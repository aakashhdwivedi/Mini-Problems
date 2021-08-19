/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
	class Library
{
		   	ArrayList<String> BooksAv=new ArrayList<String>();
			  ArrayList<String> IssuedB= new ArrayList<String>();
	
	    Scanner sc = new Scanner(System.in);	 
   		 int userinput;
		
	  Library(){
				
				BooksAv.add("WrenMartin");
				BooksAv.add("Lucent's General Knowledge");
				BooksAv.add("History of Medivial India");
				BooksAv.add("Indian Polity");
				BooksAv.add("Arihant's NDA Pathfinder");
				BooksAv.add("India's Ancient Past");
				BooksAv.add("Differential Calculus");
				BooksAv.add("Mechanics");
				BooksAv.add("Electromagnetism");
			 BooksAv.add("ElectroDynamics");
			 BooksAv.add("Themes in Indian History");
				BooksAv.add("Themes in World History");
			}
			public void showAvailableBooks()
			{
		   System.out.println();
					for(int i = 0 ; i<BooksAv.size();i++){
			    
							System.out.println(">> " +BooksAv.get(i));
						}
		    System.out.println();
					
			}
			public void menu(){
					System.out.println("Choose an Option to Continue...");
		   	System.out.println("1. Show Available Books");
	   		System.out.println("2. Show Issued Books\n3. Issue Books");
   			System.out.println("4. Return Book");
	   		
		   userinput = sc.nextInt();
		   checkInput();
		
   	}
			
			public void showIssuedBooks(){
						if(!IssuedB.isEmpty()){
									for(int i = 0; i<IssuedB.size();i++){
									   System.out.println("\n\n"+(i+1)+". "+IssuedB.get(i)+"\n\n");
					     	}
												menu();
						}
									
						else{
									System.out.println("No Books Issued..\n\n");
									menu();
									
						}
						
			}
			
			public void issueBook(){
						showAvailableBooks();
						System.out.println("Choose Book Number to Issue Book...\nEnter 0 to go to Menu...\n");
					 int 	input = sc.nextInt();
					if(input == 0)	{
									menu();
						}
						else{
									System.out.println(BooksAv.get(input-1)+" Issued...\n\n");
						IssuedB.add(BooksAv.get(input-1));
						BooksAv.remove(input-1);
									menu();
						}
						
			}
			
			public void returnBook(){
						showIssuedBooks();
						System.out.println("Choose Book to Return...\nEnter 0 to go to menu");
						int ret = sc.nextInt();
						if(ret==0){
									menu();
						}
						else if(ret<IssuedB.size()){
									System.out.println(IssuedB.get(ret)+" Returned...\nThank You for Returning the Book...\n\n");
									BooksAv.add(IssuedB.get(ret));
									IssuedB.remove(ret);
									menu();
						}
						else{
									System.out.println("Invalid Input...\nReturning to Menu...\n\n");
									menu();
						}
						
			}
			
	  
	  public void checkInput(){
		   switch(userinput){
			    case 1:
												showAvailableBooks();
												menu();
				   case 2: showIssuedBooks();
							case 3: issueBook();
							case 4: returnBook();
			    default :
												System.out.println("Invalid Input...\nPlease Enter the Input Correctly...\n");
												userinput = sc.nextInt();
												checkInput();
		   }
		
   	}  
		
		
		
}
class OnlineLibrary
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Library L1 = new Library();
		 System.out.println("Welcome to the Online Library...\n\n");
		 L1.menu();
			
		 
			
	}
}
