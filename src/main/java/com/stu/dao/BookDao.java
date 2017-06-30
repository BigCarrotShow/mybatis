package com.stu.dao;

import com.stu.dbutil.DBUtil;
import com.stu.entity.Book;
import com.stu.mapper.BookMapper;

import java.io.IOException;

/**
 * Created by yunqiang1 on 2017/6/30.
 */
public class BookDao implements BookMapper{
    public Book selectBook(int id) throws IOException {
        return DBUtil.getSqlSession().getMapper(BookMapper.class).selectBook(id);
    }
}
