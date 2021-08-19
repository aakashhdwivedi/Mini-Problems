import java.util.Scanner;
public class TowerOfHanoi {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number of Disks : ");
        int n = sc.nextInt();
        System.out.println("\nEnter the ID of The Three Towers :\nOnly Integers allowed...\n ");
        int t1id = sc.nextInt();
        int t2id = sc.nextInt();
        int t3id = sc.nextInt();
           
        long time1 = System.nanoTime();
        toh(n,t1id,t2id,t3id);
        long time2 = System.nanoTime();
        
        wait(500);
        
        System.out.print("\nTotal Number Of Moves : " + count);
        System.out.print("\nTotal time taken : "+(time2-time1)/1000000+" ms");
        
        
    }
    
    public static void toh(int n, int t1, int t2, int t3){
        if(n==0) return;
        
        toh(n-1,t1,t3,t2);
        System.out.println((count+1)+". "+n+" ["+t1+" –» "+t2+"]");
        count++;
     //   wait(100);
     
        toh(n-1,t3,t2,t1);
        
    }
    
    public static void wait(int ms)
    {
      try
      {
          Thread.sleep(ms);
      }
      catch(InterruptedException ex)
      {
          Thread.currentThread().interrupt();
      }
    }
    
}
