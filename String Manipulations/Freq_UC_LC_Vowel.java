import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
public class Freq_UC_LC_Vowel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter 1 to count Uppercase characters");
    System.out.println("Enter 2 to count Lowercase characters");
    System.out.println("Enter 3 to count Vowels");
    System.out.println("Enter your choice: ");
    int ch = sc.nextInt();
    int count=0;
    char c='\u0000', c1='\u0000';
    String st="", vs="aeiouAEIOU";
    sc.nextLine();
    switch(ch){
      case 1: 
      System.out.println("\nEnter strings: ");
      st = sc.nextLine();
      for(int i=0;i<st.length();i++){
        c = st.charAt(i);
        if(Character.isUpperCase(c) == true){
          count = count+1;
        }
      }
      System.out.println("\nStrings: "+st);
      System.out.println("Number of uppercase characters: "+count);
      break;

      case 2:
      System.out.println("\nEnter strings: ");
      st = sc.nextLine();
      for(int i=0;i<st.length();i++){
        c = st.charAt(i);
        if(Character.isLowerCase(c) == true){
          count = count+1;
        }
      }
      System.out.println("\nStrings: "+st);
      System.out.println("Number of lowercase characters: "+count);
      break;

      case 3:
      System.out.println("\nEnter strings: ");
      st = sc.nextLine();
      for(int i=0;i<st.length();i++){
        c = st.charAt(i);
        for(int j=0;j<vs.length();j++){
          c1 = vs.charAt(j);
          if(c == c1){
            count = count+1;
            break;
          }
        }
      }
      System.out.println("\nStrings: "+st);
      System.out.println("Number of vowels: "+count);
      break;

      default:
      System.out.println("\nInvalid choice!");
    }
    sc.close();
  }
}