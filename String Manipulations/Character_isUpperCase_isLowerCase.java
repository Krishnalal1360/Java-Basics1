import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class Character_isUpperCase_isLowerCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a sentence: ");
    String st = sc.nextLine();
    char c='\u0000';
    int cuc=0, clc=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isUpperCase(c) == true){
        cuc = cuc+1;
      }else if(Character.isLowerCase(c) == true){
        clc = clc+1;
      }
    }
    System.out.println("\nNumber of Uppercase characters: "+cuc);
    System.out.println("Number of Lowercase characters: "+clc);

    boolean b = Character.isUpperCase(' ');
    System.out.println(b);
    b = Character.isUpperCase('.');
    System.out.println(b);
    sc.close();
  }
}