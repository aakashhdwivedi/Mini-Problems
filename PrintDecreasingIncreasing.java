/*
You Have to Solve This Using Recursions Only
 and not any kind of Loops
*/

import java.util.Scanner;
public class PrintDecreasingIncreasing {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to Print Decreasing Increasing....\n\nThis Program Takes a positive number n as input\nand prints numbers from n to 1 and then from 1 to n...\nHope you like it !!!\n\nEnter the Number : ");
        int input = sc.nextInt();
        System.out.println("\n");
        pdi(input);
    }
    
    public static void pdi(int n){
      if(n==0){
         return;   
        }
       else{
          System.out.println(n);
          pdi(n-1);
          System.out.println(n);
       }
    }
    
}
