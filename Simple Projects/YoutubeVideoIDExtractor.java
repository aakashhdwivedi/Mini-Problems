
import java.util.Scanner;

public class YoutubeVideoIDExtractor
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
       String output = YoutubeVideoIDExtractor.extractVID(input);
       System.out.println(output);
    }
    public static String extractVID(String input){
        int length = input.length();
        String result ="";
        if(input.contains("youtube.com/watch?v=")){
            result=result+input.substring(32,length);
            return result;
        }
        else{
            result=result+input.substring(17,length);
            return result;
        }
        
    }
}
