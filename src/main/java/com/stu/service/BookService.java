package com.stu.service;

import com.stu.dao.BookDao;
import com.stu.entity.Book;

import java.io.IOException;

/**
 * Created by yunqiang1 on 2017/6/30.
 */
public class BookService {

    private BookDao bookDao = new BookDao();

    //1.根据id找到一本书
    public Book getBookById() throws IOException {
        return bookDao.selectBook(1001);
    }

    public static void main(String[] args) throws IOException {
        Book b = new BookService().getBookById();
        System.out.println(b);
    }

}
