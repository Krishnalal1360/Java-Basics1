import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class Program_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The strings must be in mixed case.");
    System.out.println("\nEnter strings: ");
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
    if((cuc == 0) || (clc == 0)){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The strings must be in mixed case.");
      System.exit(0);
    }
    
    String uc="", lc="";
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isUpperCase(c) == true){
        uc = uc+Character.toString(c);
      }else if(Character.isLowerCase(c) == true){
        lc = lc+Character.toString(c);
      }
    }
    lc = lc.concat(uc);

    System.out.println("\nOriginal Strings: \n"+st);
    System.out.println("\nChanged Strings: \n"+lc);
    sc.close();
  }
}