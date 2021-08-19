/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Game{
		private int userInput;
		private int systemInput;
		private int noofguesses = 0;
		
		Game(){
				Random rn = new Random();
				int temp = rn.nextInt(101);
				setsystemInput(temp);
				
			}
		public void setnoofguesses(){
				noofguesses++;
			}
		public int getnoofguesses(){
				return noofguesses;
			}
		
		public void setuserInput(int n){
				userInput = n;
			}
		public int getuserInput() {
				return userInput;
			}
		public void setsystemInput(int m) {
				systemInput = m;
			}
		public int getsystemInput() {
				return systemInput;
			}
			
			Scanner sc = new Scanner(System.in);
		public void takeuserInput() {
				System.out.println("Enter the Number....");
				int input = sc.nextInt();
				setuserInput(input);
				setnoofguesses();
				isCorrectNumber();
			}
		public void isCorrectNumber(){
				int input = getuserInput();
				int system = getsystemInput();
				int attempts = getnoofguesses();
				if(input==system){
						System.out.println("Congrats!!.. You Guessed The Number Correctly.. It is " + system );
						System.out.println("You Took " + attempts + " Attempts to Guess The Number...");
					}
				else if(input<system){
						System.out.println("Too Low, Try Again..");
						takeuserInput();
					}
				else{
						System.out.println("Too High, Try Again..");
						takeuserInput();
					}
			
			}
	
	}
class GuessTheNumber
{
	public static void main (String[] args)
	{
			Game gtn = new Game();
			gtn.takeuserInput();
			
	}
}
