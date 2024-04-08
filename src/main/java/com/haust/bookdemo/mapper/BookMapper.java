package com.haust.bookdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.haust.bookdemo.entity.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends BaseMapper<Book> {
}