package com.nihaorz.service;

import com.nihaorz.dto.AppointExecution;
import com.nihaorz.entity.Book;

import java.util.List;

/**
 * Created by wangrui1066 on 2017-3-29.
 */
public interface BookService {

    /**
     * 查询一本图书
     *
     * @param bookId
     * @return
     */
    Book getById(long bookId);

    /**
     * 查询所有图书
     *
     * @return
     */
    List<Book> getList();

    /**
     * 预约图书
     *
     * @param bookId
     * @param studentId
     * @return
     */
    AppointExecution appoint(long bookId, long studentId);

}
