package com.subrutin.service.impl;

import com.subrutin.domain.Author;
import com.subrutin.domain.Book;
import com.subrutin.dto.BookDetailDTO;
import com.subrutin.service.BookService;

public class BookServiceImpl implements BookService{

	private Book book;

	public BookServiceImpl() {
		Author author = new Author();
		book = new Book(author);
	}

	@Override
	public BookDetailDTO findBookDetailById(Long bookId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
