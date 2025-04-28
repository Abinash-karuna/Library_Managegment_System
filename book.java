package library;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class book {
		HashMap<String,Integer> book= new HashMap<>();
		ArrayList<String>borrowed_books =new ArrayList<>();
				Scanner sc= new Scanner(System.in);
				int id;String name;
public void book_add() {
				System.out.print("Enter the book name to add: ");
    	name=sc.nextLine();
    	System.out.print("Enter the book id: ");
    	id=sc.nextInt();
		book.put(name,id);
		sc.nextLine();
		}
public void display() {
		for(String book_av:book.keySet()) {
			System.out.println(book_av);
		}
	}
public void book_borrowed() {
	System.out.print("Enter the book name to be borrowed: ");
	String name = sc.nextLine();
	borrowed_books.add(name);
	book.remove(name);
	}
public void book_returned() {
	System.out.print("Enter the book name to be return: ");
	String name = sc.nextLine();
	borrowed_books.remove(name);
	book.put(name,id);
	}
}
