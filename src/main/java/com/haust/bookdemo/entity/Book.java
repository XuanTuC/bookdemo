package com.haust.bookdemo.entity;

import lombok.Data;

@Data
public class Book {
    private Long id;
    private String title;
    private String author;
    private String publishDate;
    private Integer pages;
}