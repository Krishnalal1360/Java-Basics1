import java.util.Scanner;
import java.lang.String;

public class Strings_replace {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nReplacing Character in strings!");
    System.out.println("\nEnter strings: ");
    String st = sc.nextLine();
    System.out.println("\nStrings: "+st);
    System.out.println("\nEnter character from strings to replace: ");
    char c1 = sc.next().charAt(0);
    System.out.println("Enter character to replace with: ");
    char c2 = sc.next().charAt(0);
    st = st.replace(c1, c2);
    System.out.println("\nNew Strings: "+st);

    System.out.println("\nReplacing String in strings!");
    System.out.println("\nEnter strings: ");
    sc.nextLine();
    st = sc.nextLine();
    System.out.println("\nStrings: "+st);
    System.out.println("\nEnter strings from strings to replace: ");
    String st1 = sc.next();
    System.out.println("Enter strings to replace with: ");
    String st2 = sc.next();
    st = st.replace(st1, st2);
    System.out.println("\nNew Strings: "+st);
    sc.close();
    /*String st3 = "Hello  World!";
    System.out.println("\nStrings: "+st3);
    st3 = st3.replace("  "," ");
    System.out.println("\nNew Strings: "+st3);*/
  }
}