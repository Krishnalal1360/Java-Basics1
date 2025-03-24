import java.util.Scanner;
import java.lang.String;

public class String_contains {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter strings: ");
    String st = sc.nextLine();
    System.out.println("\nEnter a character: ");
    char c = sc.next().charAt(0);
    if(st.contains(String.valueOf(c)) == true){
      System.out.println("\nCharacter "+c+" is present in Strings \n"+st);
    }else{
      System.out.println("\nCharacter "+c+" is not present in Strings \n"+st);
    }
    System.out.println("\nEnter string/strings: ");
    sc.nextLine();
    String st1 = sc.nextLine();
    if(st.contains(st1) == true){
      System.out.println("\nString "+st1+" is present in Strings \n"+st);
    }else{
      System.out.println("\nString "+st1+" is not present in Strings \n"+st);
    }
    sc.close();
  }
}