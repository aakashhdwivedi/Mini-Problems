import java.util.Scanner;
public class Knights_Tour_Problem {
   static boolean gotAnswer = false;
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Size of Board : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int board[][] = new int[n][n];
        
        long start = System.currentTimeMillis();
        
        solveKnightsTour(board,r,c,1);
        
        long end = System.currentTimeMillis();
        
        System.out.println("Total time taken : "+(end-start)/1000+" seconds...");
        
    }
    
    
    public static void printSol(int n,int board[][]){
        for(int i = 0 ; i<n ; i++){
                for(int j = 0 ; j<n ;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
        System.out.println("\n");
    }
    
    
    public static void solveKnightsTour(int[][] board,int r,int c,int move){
       
        if(gotAnswer == true) return;
        
        if(r<0 || c<0 || r>=board.length || c>=board.length || board[r][c] != 0){
            return;
        }
        else if(move == board.length * board.length){
            board[r][c] = move;
            printSol(board.length,board);
            gotAnswer = true;
            return;
        }
        
        board[r][c] = move;
        for(int i=0 ; i<8 ; i++){
           if(!(r + y[i]<0 || c + x[i]<0 || r + y[i]>=board.length || c + x[i]>=board.length || board[r+y[i]][c+x[i]] != 0)){
                solveKnightsTour(board , r + y[i] , c + x[i], move + 1);
            }
        }
        board[r][c] = 0;
        
    }
    
    static int[] x = {1 , 2 , 2 , 1 , -1 , -2 , -2 , -1};
    static int[] y = {-2 , -1 , 1 , 2 , 2 , 1 , -1 , -2};
    
    
}
