import java.util.Scanner;
public class GuessTheNumber2 {
    
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("System has chosen its number...\nTry to Guess it Out...\n\n");
        int system = (int)(Math.random()*100);
        int input = 0;
      do
   					{
            	input = sc.nextInt();
       					 if(input==system){
                System.out.println("\n\nYou Guessed The Number Correct... !!!\n");
                break;
            }
           else if(input>system){
                System.out.println("Your Guess is too high...Try again...");
            }
           else{
                System.out.println("Your Guess is too low...Try Again...");
            }
            
        }
    			  while(input>=0);
        System.out.println("My Guess was "+input+"...");
    }
    
}
