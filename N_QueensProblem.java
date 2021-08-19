import java.util.Scanner;
import java.util.Arrays;
public class N_QueensProblem {
    
    
    public static void main(String[] args) {
        System.out.print("Enter the Size of Board : ");
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        boolean board[][] = new boolean[n][n];
        boolean col[] = new boolean[n];
        boolean rc[] = new boolean[(2*n)-1];
        boolean rc_l[] = new boolean[(2*n)-1];
       
        solve(n,0,board,col,rc,rc_l,"");
    }
    
    public static void solve(int n,int row,boolean board[][],boolean cols[],boolean rc[],boolean rc_1[],String asf){
      
        if(row == board.length){
            System.out.println(asf);
            return;
        }
        
        for(int col =0;col<board[0].length;col++){
           if(cols[col] == false && rc[row+col]==false && rc_1[row-col+board.length-1]==false){
                board[row][col] = true;
                cols[col]= true;
                rc[row+col]=true;
                rc_1[row - col + board.length - 1] = true;
                solve(n,row+1,board,cols,rc,rc_1,asf+row+"-"+col+"  ");
                board[row][col] = false;
                cols[col]= false;
                rc[row+col]=false;
                rc_1[row - col + board.length - 1] = false;
            } 
        } 
        
    }
    
}
