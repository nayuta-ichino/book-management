package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.BookForm;
import com.example.service.InsertBookService;

/**
 * 本の情報をDB上に登録するMethod.
 * 
 * @author nayuta
 */
@Controller
@RequestMapping("/insert")
public class InsertBookController {
	@Autowired
	private InsertBookService service;

	/**
	 * 入力フォームを返すMethod.
	 * 
	 * @return 入力値
	 */
	public BookForm insertBookForm() {
		return new BookForm();
	}

	/**
	 * 入力を行うHTMLを表示するMethod.
	 * 
	 * @return
	 */
	@RequestMapping("")
	public String insertBook() {
		return "insert-book-list.html";
	}

	/**
	 * 本の情報をDBに格納するMethod.
	 * 
	 * @param bookForm form画面に入力された情報
	 * @return 結果画面
	 */
	@RequestMapping("/insert-book")
	public String insertNewBook(BookForm bookForm) {
		service.insertBook(bookForm);

		return "redirect:/";
	}
}
