package librarysystems;
import java.util.Scanner;
import library.lib;
import library.book;
public class imp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		book ds= new book();
		lib sk=new lib();
        System.out.println("Welcome to Library Management System");
        int ch;

		do {
	        System.out.println("Press 1 to login ");
	        System.out.println("Press 2 to Book Available  ");
	        System.out.println("Press 3 to Book Borrowed ");
	        System.out.println("Press 4 to Book returned ");
	        System.out.println("Press 5 to display ");
	        System.out.println("Press 6 to exit ");
	        System.out.print("Press the button:  ");
	        ch=sc.nextInt();
	        sc.nextLine();
	        switch(ch) {
	        case 1:
	        	sk.upload();
	        	break;
	        case 2:
	        	ds.book_add();
	        	break;
	        case 3:
	        	ds.book_borrowed();
	        	break;
	        case 4:
        	ds.book_returned();
	        	break;
	        case 5:
	        	ds.display();
	        	break;
	        case 6:
	        	break;
	        default:
	        	System.out.println("You have pressed invalid option!!!\n Press valid option");
	        }
	        
		}while(ch!=6);
	}
}
