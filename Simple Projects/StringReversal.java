/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StringReversal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be reversed :");
		String input = sc.nextLine();
	//	System.out.println(input);
		System.out.println("\n\nThe reversed string is :");
		String output = "";
		for(int i = input.length()-1; i>=0; i--){
					output = output+input.charAt(i);
			
			}
			System.out.println(output);
	}
}
