package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Book;
import com.example.form.BookForm;

/**
 * booksテーブルを操作するRepository.
 * 
 * @author nayuta
 */
@Repository
public class BookRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;

	// ラムダ式で定義
	private static final RowMapper<Book> BOOK_ROW_MAPPER = (rs, i) -> {
		Book book = new Book();

		book.setName(rs.getString("name"));
		book.setAuthor(rs.getString("author"));
		book.setSynopsis(rs.getString("synopsis"));
		book.setThoughts(rs.getString("thoughts"));

		return book;
	};

	/**
	 * データ内の本情報を全て入手するメソッド.
	 * 
	 * @return DB内の全データ
	 */
	public List<Book> findAll() {
		List<Book> bookList = new ArrayList<>();

		// SQL文を作成
		String sql = "SELECT id, name, author, synopsis, thoughts FROM books ORDER BY id;";
		// 実行
		bookList = template.query(sql, BOOK_ROW_MAPPER);

		return bookList;
	}

	/**
	 * bookFormから入力された本の情報を挿入.
	 * 
	 * @param bookForm form画面に入力された情報
	 */
	public void insert(BookForm bookForm) {
		// プレースホルダー埋め込み
		SqlParameterSource params = new BeanPropertySqlParameterSource(bookForm);

		// SQL文を作成
		String insertSpl = "INSERT INTO books (name, author, synopsis, thoughts) VALUES (:name, :author, :synopsis, :thoughts);";

		// 実行
		template.update(insertSpl, params);
	}

}
