import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.String;

public class StringTokenizer_countTokens {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter strings: ");
    String st = sc.nextLine();
    StringTokenizer stz = new StringTokenizer(st);
    int ct = stz.countTokens();
    System.out.println("\nStrings: "+st);
    System.out.println("\nNumber of tokens: "+ct);
    System.out.println("\nTokens: ");
    while(stz.hasMoreTokens() == true){
      System.out.println(stz.nextToken());
    }
    sc.close();
  }
}