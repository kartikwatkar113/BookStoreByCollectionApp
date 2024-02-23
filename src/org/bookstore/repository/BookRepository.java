package org.bookstore.repository;

import java.util.ArrayList;

import org.bookstore.model.AddBook;

public class BookRepository {
	
	static ArrayList al=new ArrayList();
	
	public int getB_id() {
		
		return al.size();
	}
	public boolean isBookAdd(AddBook ab) {
		boolean b=al.add(ab);
		return b;
	}
	
	
	public ArrayList getAllBookDetails() {
		
		return al;
	}
}
