import java.util.Scanner;
import java.lang.String;

public class Program_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: You can use only alternate uppercase characters from A to K.");
    System.out.println("A or C or E or G or I or K");
    System.out.println("You cannot use any other characters.");
    System.out.println("The characters cannot be repetitive.");
    System.out.println("The length of password string must be 6.");
    System.out.println("\nEnter a password string: ");
    String st = sc.next();
    char c='\u0000';
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isUpperCase(c) == false){
        System.out.println("\nInvalid Input!");
        if(Character.isLowerCase(c) == true){
          System.out.println("Reason: The characters must be in Uppercase.");
        }else if(Character.isLetter(c) == false){
          System.out.println("Reason: No special character/s allowed.");
        }
        System.exit(0);
      }
    }
    if(st.length() != 6){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The length of password string must be 6.");
      System.exit(0);
    }
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if((c != 'A') && (c != 'C') && (c != 'E') && (c != 'G') && (c != 'I') && (c != 'K')){
        System.out.println("\nInvalid Input!");
        System.out.println("Reason: You can use only alternate uppercase characters from A to K.");
        System.exit(0);
      }
    }
    int freq=0;
    char c1='\u0000';
    String pws="ACEGIK";
    for(int i=0;i<pws.length();i++){
      c = pws.charAt(i);
      for(int j=0;j<st.length();j++){
        c1 = st.charAt(j);
        if(c == c1){
          freq = freq+1;
        }
      }
      if(freq != 1){
        System.out.println("\nInvalid Input!");
        System.out.println("Reason: The repetitive characters are not allowed.");
        System.exit(0);
      }
      freq = 0;
    }

    System.out.println("\nValid Password String: \n"+st);
    sc.close();
  }
}