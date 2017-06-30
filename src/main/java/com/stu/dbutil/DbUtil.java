package com.stu.dbutil;

import com.stu.mapper.BookMapper;
import com.stu.entity.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by yunqiang1 on 2017/6/29.
 */
public class DBUtil {

    public static SqlSession getSqlSession() throws IOException {
        String resource = "config/mybatis.xml";
        //1.得到文件的输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //2.得到会话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.开启会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }

    public static void main(String[] args) throws IOException {
        String resource = "config/mybatis.xml";
        //1.得到文件的输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //2.得到会话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.开启会话
        SqlSession session = sqlSessionFactory.openSession();
        //4.用法一: 选择
        Book book1 = (Book)session.selectOne("com.stu.mapper.BookMapper.selectBook",1001);
        //5.用法二:
        BookMapper bookMapper = session.getMapper(BookMapper.class);
        bookMapper.selectBook(1001);
    }

}
