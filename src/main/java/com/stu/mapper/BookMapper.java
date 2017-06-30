package com.stu.mapper;

import com.stu.entity.Book;

import java.io.IOException;

/**
 * Created by yunqiang1 on 2017/6/30.
 */
public interface BookMapper {

    public Book selectBook(int id) throws IOException;

}
