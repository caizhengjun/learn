package com.shanghai.springbootcache.mapper;

import com.shanghai.springbootcache.bean.Book;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/22 4:06 下午
 */
public interface BookRepository {
    Book getByIsbn(String isbn);
}
