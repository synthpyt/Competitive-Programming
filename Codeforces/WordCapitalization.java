import java.util.Scanner;

public class WordCapitalization {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      String word=in.next();
             if(Character.isUpperCase(word.charAt(0)))
            System.out.println(word);
        if(Character.isLowerCase(word.charAt(0)))
            System.out.println(Character.toUpperCase(word.charAt(0))+word.substring(1));
    }




}
