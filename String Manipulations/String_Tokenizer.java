import java.util.Scanner;
import java.lang.String;
import java.util.StringTokenizer;

public class String_Tokenizer {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter string: ");
    String st = sc.nextLine();
    StringTokenizer stz = new StringTokenizer(st);
    int nt = stz.countTokens();
    System.out.println("\nNumber of tokens: "+nt);
    int count=0;
    System.out.println("\nTokens: ");
    while(stz.hasMoreTokens() == true){
      System.out.println(stz.nextToken());
      count = count+1;
    }
    System.out.println("\nNumber of tokens: "+count);
    sc.close();
  }
}