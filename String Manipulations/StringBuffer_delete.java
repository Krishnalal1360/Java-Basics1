import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;

public class StringBuffer_delete {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter strings: ");
    String st = sc.nextLine();
    StringBuffer sb = new StringBuffer(st);
    System.out.println("\nEnter a string from strings to delete: ");
    String st1 = sc.next();
    System.out.println("Enter index of that string: ");
    int index = sc.nextInt();
    sb.delete(index, (index+(st1.length()+1)));
    st = sb.toString();
    System.out.println("\nNew Strings: "+st);
    sc.close();
  }
}