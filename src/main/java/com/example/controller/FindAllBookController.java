package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Book;
import com.example.service.FindAllBookService;

@Controller
@RequestMapping("/")
public class FindAllBookController {
	@Autowired
	private FindAllBookService service;

	@RequestMapping("")
	public String index(Model model) {
		List<Book> bookList = service.findAllBook();

		model.addAttribute("bookList", bookList);

		return "find-all-book.html";
	}
}
