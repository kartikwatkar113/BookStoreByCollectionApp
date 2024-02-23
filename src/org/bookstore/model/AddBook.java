package org.bookstore.model;

public class AddBook {

	private int b_id;
	private String b_name;
	private String b_author;
	private String b_publication;
	private int b_price;
	private String b_category;
	private int check;
	private boolean b_status;

	
	public AddBook() {
		
	}
	public AddBook(String b_name,String b_author,String b_publication,int b_price,String b_category) {
		
		this.b_name=b_name;
		this.b_author=b_author;
		this.b_publication=b_publication;
		this.b_price=b_price;
		this.b_category=b_category;
	}
	
	
	
	public int getCheck() {
		return check;
	}
	public void setCheck(int check) {
		this.check = check;
	}
	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getB_author() {
		return b_author;
	}

	public void setB_author(String b_author) {
		this.b_author = b_author;
	}

	public String getB_publication() {
		return b_publication;
	}

	public void setB_publication(String b_publication) {
		this.b_publication = b_publication;
	}

	public int getB_price() {
		return b_price;
	}

	public void setB_price(int b_price) {
		this.b_price = b_price;
	}

	public String getB_category() {
		return b_category;
	}

	public void setB_category(String b_category) {
		this.b_category = b_category;
	}

	public boolean isB_status() {
		return b_status;
	}

	public void setB_status(boolean b_status) {
		this.b_status = b_status;
	}

}
