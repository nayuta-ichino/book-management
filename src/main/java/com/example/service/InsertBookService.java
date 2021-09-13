package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.form.BookForm;
import com.example.repository.BookRepository;

/**
 * 本の情報を挿入するservice.
 * 
 * @author nayuta
 */
@Service
@Transactional
public class InsertBookService {
	@Autowired
	private BookRepository bookRepository;

	/**
	 * BookFormからの情報を取得して登録するMethod.
	 * 
	 * @param bookForm form画面に入力された情報
	 */
	public void insertBook(BookForm bookForm) {
		bookRepository.insert(bookForm);
	}

}
