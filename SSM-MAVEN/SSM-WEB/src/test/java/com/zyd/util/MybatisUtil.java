package com.zyd.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	
	
	private static SqlSession sqlSession;
	private static SqlSessionFactory sessionFactory;

	public static SqlSession getSqlSession(){
		try {
			InputStream reader = Resources.getResourceAsStream("resources/mybatis.xml");
			if (sessionFactory == null) {
				sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
			sqlSession = sessionFactory.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sqlSession;
	}
}
