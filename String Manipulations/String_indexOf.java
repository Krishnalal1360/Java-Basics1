import java.util.Scanner;

public class String_indexOf {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a string: ");
    String st = sc.next();
    System.out.println("Enter a character to be searched: ");
    char c = sc.next().charAt(0);
    int i = st.indexOf(c);
    System.out.println("Character "+c+" is present at index "+i);
    System.out.println("Enter a string to be searched: ");
    String st1 = sc.next();
    i = st.indexOf(st1);
    System.out.println("String "+st1+" is present at index "+i);
    sc.close();
  }
}