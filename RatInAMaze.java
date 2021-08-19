/* A Maze is given as N*N binary matrix of 
 * blocks where source block is the upper 
 * left most block i.e., maze[0][0] and 
 * destination block is lower rightmost 
 * block i.e., maze[N-1][N-1]. A rat starts 
 * from source and has to reach the destination. 
 * The rat can move only in two directions: 
 * forward and down. 

In the maze matrix, 0 means the block is a 
dead end and 1 means the block can be used 
in the path from source to destination. Note 
that this is a simple version of the
*/

public class RatInAMaze {
    
    static int solCount = 0;
    public static void main(String[] args) {
        
        int input[][] = {{1, 0, 0, 0},
                         {1, 1, 1, 1},
                         {0, 1, 0, 1},
                         {1, 1, 1, 1}};
        int output[][] = new int[(input.length)][(input[0].length)];
        
        solveMaze(input,output,0,0);
        System.out.println("Total number of Solutions : " + solCount);
    }
    
    public static void printMaze(int[][] output){
        for(int i = 0 ; i < output.length ; i++){
            for(int j = 0 ; j < output[0].length ; j++){
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void solveMaze(int[][] input, int[][] output, int r,int c){
        if(r==input.length && c==input[0].length-1){
            printMaze(output);
            solCount++;
        }
        else{
            if(r >= input.length || c >= input[0].length ) return;
           else if(input[r][c] != 1) return;
            else{
                output[r][c] = 1;
                solveMaze(input,output,r,c+1);
                solveMaze(input,output,r+1,c);
                output[r][c] = 0;
            }
        }
    }
    
}
