import java.util.Scanner;
public class printZ {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size : ");
        
        int input = sc.nextInt();
        System.out.print("\n\n");
        printz(input);
    }
    public static void printz(int n){
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println("");
        for(int i=n-2;i>0;i--){
            int j = i;
            while(j!=0){
                System.out.print("  ");
                j--;
            }
            System.out.println("*");
        }
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
    }
    
}
