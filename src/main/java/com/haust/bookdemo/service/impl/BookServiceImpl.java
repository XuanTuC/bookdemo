package com.haust.bookdemo.service.impl;

import com.haust.bookdemo.entity.Book;
import com.haust.bookdemo.mapper.BookMapper;
import com.haust.bookdemo.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
}