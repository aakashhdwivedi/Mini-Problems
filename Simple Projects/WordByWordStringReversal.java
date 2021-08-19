import java.util.Scanner;
public class WordByWordStringReversal {
    public static String reverse(String a){
    			String fa = "";
       String ans = a.trim();
       for(int i=ans.length()-1;i>=0;){
            	while(ans.charAt(i)==' '){i--;}
             int j =i;
             while(ans.charAt(i)!=' '){
                i--;
            			 if(i<0) break;
             }
             
             if(fa.isEmpty()){
                 fa = fa+ans.substring(i+1,j+1);   
             }
             else{
                
                 fa = fa+" "+ans.substring(i+1,j+1);
             }			
         }
        
    return fa;
  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String to be Reversed...\n\n");
        String s = sc.nextLine();
        System.out.println("The Reversed String is : \n");
        String ans = reverse(s);
        System.out.println(ans);
        
    }
    
}
