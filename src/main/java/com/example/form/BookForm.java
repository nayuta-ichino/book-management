package com.example.form;

import javax.validation.constraints.NotBlank;

public class BookForm {
	/** 書籍名 */
	@NotBlank(message="作品名を入力してください。")
	private String name;
	/** 作者 */
	@NotBlank(message="作者を入力してください。")
	private String author;
	/** あらすじ */
	@NotBlank(message="あらすじを入力してください。")
	private String synopsis;
	/** 感想 */
	@NotBlank(message="感想を入力してください。")
	private String thoughts;

	// コンストラクタ
	public BookForm() {
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
