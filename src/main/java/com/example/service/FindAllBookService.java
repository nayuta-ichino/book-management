package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Book;
import com.example.repository.BookRepository;

/**
 * DB上の全ての本を取得するservice.
 * 
 * @author nayuta
 */
@Service
@Transactional
public class FindAllBookService {
	@Autowired
	private BookRepository repository;

	/**
	 * データ内の本情報を全て入手するメソッド.
	 * 
	 * @return DB上のすべての本
	 */
	public List<Book> findAllBook() {
		List<Book> bookList = repository.findAll();

		return bookList;
	}

}
