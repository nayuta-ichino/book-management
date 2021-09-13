package com.example.domain;

/**
 * booksテーブル内のカラムを表示するdomain.
 * 
 * @author nayuta
 */
public class Book {
	/** 書籍名 */
	private String name;
	/** 作者 */
	private String author;
	/** あらすじ */
	private String synopsis;
	/** 感想 */
	private String thoughts;

	// コンストラクタ
	public Book() {
		// 引数、処理なしのコンストラクタ
	}

	// getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getThoughts() {
		return thoughts;
	}

	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}

	// toString
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", synopsis=" + synopsis + ", thoughts=" + thoughts + "]";
	}

}
