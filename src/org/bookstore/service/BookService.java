package org.bookstore.service;
import java.util.ArrayList;

import org.bookstore.model.AddBook;
import org.bookstore.repository.BookRepository;

public class BookService {
	
	BookRepository bRepo=new BookRepository();
	AddBook ab;
	ArrayList al;
	public boolean isBookAdd(AddBook ab) {
		this.ab=ab;
		int b_id=bRepo.getB_id();
		b_id+=1;
		ab.setB_id(b_id);
		boolean b=bRepo.isBookAdd(ab);
		return b;
	}
	
	
	public ArrayList getAllBookDetails() {
		
		al=bRepo.getAllBookDetails();
		
		return al.size()>0?al:null;
	}
}
