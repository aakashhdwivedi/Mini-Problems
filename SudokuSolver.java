
public class SudokuSolver {
    
    public static void main(String[] args) {
        
        int sudoku[][] = {{0,0,3,0,0,0,0,0,2},
                          {0,0,0,0,0,0,0,8,0},
                          {5,0,0,9,0,8,0,0,6},
                          {0,0,2,7,6,0,3,0,0},    
                          {0,4,0,0,0,0,0,5,0},
                          {0,0,8,0,4,3,6,0,0},
                          {6,0,0,1,0,2,0,0,9},
                          {0,3,0,0,0,0,0,0,0},
                          {8,0,0,0,0,0,7,0,0}};
        int r = 0;
        int c = 0;
        
        
        solveSudoku(sudoku,0,0);
    }
    
    public static void printSudoku(int[][] board){
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static boolean isValid(int[][] board,int r, int c, int pos){
        
        
        for(int i = 0 ; i < board[0].length ; i++){
            if(board[r][i]==pos){
                return false;
            }
        }
        for(int i = 0 ; i < board.length ; i++){
            if(board[i][c]==pos){
                return false;
            }
        }
        int vr = 3*(r/3);
        int vc = 3*(c/3);
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(board[vr+i][vc+j] == pos)
                return false;
            }
        }
        
        return true;
        
    }
    
    public static void solveSudoku(int[][] board,int r,int c){
        if(r==board.length){
            printSudoku(board);
            return;
        }
        else{
            if(c == board[0].length){
                solveSudoku(board,r+1,0);
            }
            else{
                if(board[r][c] == 0){
                    
                    for(int pos = 1 ; pos < 10 ; pos++ ){
                       if(isValid(board,r,c,pos)==true){
                            board[r][c] = pos;
                            solveSudoku(board,r,c+1);
                            board[r][c] = 0;
                        }
                    }
                }
                else{
                    solveSudoku(board,r,c+1);
                }
            }
            
        }
        
    }
    
}
