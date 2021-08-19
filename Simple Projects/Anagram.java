import java.util.Scanner;
public class Anagram {
    public static boolean checkAnagram(String a,String b){
        boolean isAnagram = false;
        for(int i=0;i<a.length();i++){
            char c1 = a.charAt(i);
            
            for(int j=0;j<b.length();j++){
                if(b.charAt(j)==c1){
                    isAnagram=true;
                    break;
                }
            }
            if(!isAnagram) break;
        }
        return isAnagram;
    }
    public static void main(String[] args) {
        System.out.println("Enter The Strings :\n\nString 1 : ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.println("String 2 : ");
        String s2 = sc.next();
        if(checkAnagram(s1,s2)){
            System.out.println("They are Anagrams...");
        }
        else System.out.println("Not Anagrams :-(");
    }
    
}
