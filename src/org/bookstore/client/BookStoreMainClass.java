package org.bookstore.client;

import java.util.*;
import org.bookstore.model.AddBook;
import org.bookstore.service.BookService;

public class BookStoreMainClass {
	static int count;
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		int choice;
		BookService bservice = new BookService();
		ArrayList al;
		
		
		
		do {

			System.out.println("\n=============================================================");
			System.out.println("1.Add Books with their Details: ");
			System.out.println("2.Show All Books Present in the Store with their Details: ");
			System.out.println("3.Show count of Books Category Wise: ");
			System.out.println("4.Display Category Wise Book Details: ");
			System.out.println("5.Display Author Wise Book Details: ");
			System.out.println("=============================================================");
			System.out.println("Enter choice: ");
			choice = k.nextInt();

			switch (choice) {

			case 1: {
				boolean flag = false;
				k.nextLine();
				System.out.println("Enter Book Name: ");
				String b_name = k.nextLine();
				try {
					al = bservice.getAllBookDetails();
					for (Object obj : al) {
						AddBook ab = (AddBook) obj;
						if (ab.getB_name().equals(b_name)) {
							flag = true;
							break;
						}
					}
				} catch (Exception e) {

				}

				if (!flag) {
					System.out.println("Enter Book Author: ");
					String b_author = k.nextLine();
					System.out.println("Enter Book Publication: ");
					String b_publication = k.nextLine();
					System.out.println("Enter Book Price: ");
					int b_price = k.nextInt();
					k.nextLine();
					System.out.println("Enter Book Category: ");
					String b_category = k.nextLine();

					AddBook ab = new AddBook(b_name, b_author, b_publication, b_price, b_category);

					boolean b = bservice.isBookAdd(ab);

					if (b) {
						System.out.println("Book Details Added Successfully........ :)");
					}
				} else {
					System.out.println("Book is Already Present...");
				}

			}
				break;

			case 2: {
				
				al = bservice.getAllBookDetails();
				if (al.size() > 0) {
					System.out
							.println("\n-----------------------------------------------------------------------------------------------");
					System.out.println("BookID\tBook Name\tBook Author\tBook Publication\tBook Price\tBook Category");
					System.out.println("-----------------------------------------------------------------------------------------------");

					for (Object ob : al) {

						AddBook ab = (AddBook) ob;
						System.out.println(ab.getB_id() + "\t" +ab.getB_name() + "\t" + ab.getB_author() + "\t"
								+ ab.getB_publication() + "\t" + ab.getB_price() + "\t" + ab.getB_category());

					}
				} else {
					System.out.println("Sorry :( there are no Books to show..");
				}
			}
				break;

			case 3: {
				
				al = bservice.getAllBookDetails();
				
				ArrayList <AddBook> al1=new ArrayList<AddBook>(al);

				for(int i=0;i<al1.size();i++) {
					count=1;
					for(int j=(i+1);j<al1.size();j++) {
						
						if((al1.get(i)).getB_category().equals((al1.get(j)).getB_category())){
							count++;
							al1.remove(j);
						}
					}
					System.out.println("This type of Category Book ["+(al1.get(i)).getB_category()+"] Available in : "+count+"\n");
				}
				
			}
				break;
				
			case 4: {
				
				al = bservice.getAllBookDetails();
				
				ArrayList <AddBook> al2=new ArrayList<AddBook>(al);

				System.out
				.println("\n-----------------------------------------------------------------------------------------------");
				System.out.println("BookID\tBook Name\tBook Author\tBook Publication\tBook Price");
				System.out.println("-----------------------------------------------------------------------------------------------");
				
				for(int i=0;i<al2.size();i++) {
					
					System.out.println("["+(al2.get(i)).getB_category()+"] Category of Books are: \n"
							+"--------------------------------------------------------------------------------------------\n");
								System.out.println((al2.get(i)).getB_id()+"\t"+(al2.get(i)).getB_name()+"\t"+(al2.get(i)).getB_author()+"\t"+(al2.get(i)).getB_publication()
										+"\t"+(al2.get(i)).getB_price());
					for(int j=(i+1);j<al2.size();j++) {
						
						if((al2.get(i)).getB_category().equals((al2.get(j)).getB_category())){
							
							System.out.println((al2.get(j)).getB_id()+"\t"+(al2.get(j)).getB_name()+"\t"+(al2.get(j)).getB_author()+"\t"+(al2.get(j)).getB_publication()
									+"\t"+(al2.get(j)).getB_price());
							al2.remove(j);
						}
					}
					System.out.println("--------------------------------------------------------------------------------------------\n");
				}
				
			}
			break;
			
			case 5: 
{
				
				al = bservice.getAllBookDetails();
				
				ArrayList <AddBook> al3=new ArrayList<AddBook>(al);

				System.out
				.println("\n-----------------------------------------------------------------------------------------------");
				System.out.println("BookID\tBook Name\tBook Publication\tBook Price\tBook Category");
				System.out.println("-----------------------------------------------------------------------------------------------");
				
				for(int i=0;i<al3.size();i++) {
					
					System.out.println("["+(al3.get(i)).getB_author()+"] Author of Books are: \n"
							+"--------------------------------------------------------------------------------------------\n");
								System.out.println((al3.get(i)).getB_id()+"\t"+(al3.get(i)).getB_name()+"\t"+(al3.get(i)).getB_author()+"\t"+(al3.get(i)).getB_publication()
										+"\t"+(al3.get(i)).getB_price());
								
					for(int j=(i+1);j<al3.size();j++) {
						
						if((al3.get(i)).getB_author().equals((al3.get(j)).getB_author())){
							
							System.out.println((al3.get(j)).getB_id()+"\t"+(al3.get(j)).getB_name()+"\t"+(al3.get(j)).getB_author()+"\t"+(al3.get(j)).getB_publication()
									+"\t"+(al3.get(j)).getB_price());
							
							al3.remove(j);
						}
					}
					System.out.println("--------------------------------------------------------------------------------------------\n");
				}
				
			}
			break;
			}

		} while (true);

	}

}
