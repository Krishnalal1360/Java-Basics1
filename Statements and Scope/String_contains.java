import java.util.Scanner;

public class String_contains {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter string1: ");
    String st1 = sc.next();
    System.out.println("Enter string2: ");
    String st2 = sc.next();
    if(st1.contains(st2)){
      System.out.println("String1 contains String2");
    }
    sc.close();
  }
}