import java.util.Scanner;
public class BitwiseOperations {
      public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Enter you Choice :\n");
        System.out.println("1.Bitwise Swapping Two Numbers\n2.Check Number if It is Even or Odd\n");
        int input = sc.nextInt();
         
        switch(input){
            case 1: swap();break;
            case 2: oddeven();break;
            default : System.out.println("Invalid Input.. Try Again");
        }
    }
    
    public static void swap(){
        System.out.println("\nEnter the Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        a ^= b; b ^= a; a ^=b;
        System.out.println("a is "+a+" and b is "+b+" ...");
    }
    
    public static void oddeven(){
        System.out.println("\nEnter the Number :");
        int a = sc.nextInt();
        
        if((a&1)==0) System.out.println("\n"+a+" is even ...\n");
        else System.out.println("\n"+a+" is odd ...\n");
    }
    
}
