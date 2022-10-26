import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=in.next();
        String w="";
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            w=ch+w;
        }
        if(w.equals(word)){
            System.out.println("Palindrome Word");
        }
        else{
            System.out.println("Not a Palindrome Word");
        }
        in.close();
    }
}
