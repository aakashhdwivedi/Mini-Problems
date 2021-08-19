import java.util.Scanner;
public class SquareRoot {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :\n");
        long x = sc.nextInt();
        long y = sc.nextInt();
        long output = exponent(x,y);
        System.out.println("\n\n"+x+" raised to the power "+y+" is : "+output);
    }
    
    public static long exponent(long x ,long y){
        long temp=x;
        for(long i=0;i<y;i++){
            temp*=x;
        }
        return temp;
    }
    
    public static double sqrt(int number){
        return Math.sqrt((double)(number));
    }
    
}
