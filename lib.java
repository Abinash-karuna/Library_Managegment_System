package library;
import java.util.Scanner;

 abstract  class texts {
	 private String Name;
	 private int password;
	 abstract void upload();
	 void setter(String name,int Password) {
		 Name=name;
		 password=Password;
		 System.out.println("Successfully created");
	 }
	 void checker(String name,int Password) {
		 if(Name.equals(name)) {
			 System.out.println("You have are correct");
		 }
	 }

}
 public class lib extends texts {
	 Scanner sc= new Scanner(System.in);
	 int flag=0;
	 public void upload() {
		 	System.out.println("Enter the name: ");
			String Name=sc.nextLine();
			System.out.println("Enter the password: ");
			int id=sc.nextInt();
			sc.nextLine();
		if(flag==0) {
			
			setter(Name,id);
			flag=1;
		}
		else {
			checker(Name,id);
		}
	 }
 }
