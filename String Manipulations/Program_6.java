import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;

public class Program_6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: Both the strings must be equal in length.");
    System.out.println("\nEnter first string: ");
    String st1 = sc.next();
    System.out.println("Enter second string: ");
    String st2 = sc.next();
    if(st1.length() != st2.length()){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The strings must be of equal length.");
      System.exit(0);
    }

    st1 = st1.toUpperCase();
    st2 = st2.toUpperCase();
    System.out.println("\nFirst String: "+st1);
    System.out.println("Second String: "+st2);
    StringBuffer sb = new StringBuffer(st2);
    st2 = sb.reverse().toString();
    System.out.println("Reversed Second String: "+sb);

    char c1='\u0000';
    String st3="";
    /*for(int i=0;i<st1.length();i++){
      c1 = st1.charAt(i);
      st3 = st3.concat(String.valueOf(c1));
      c2 = st2.charAt(i);
      st3 = st3.concat(Character.toString(c2));
    }*/
    for(int i=0;i<st2.length();i++){
      c1 = st1.charAt(i);
      st3 = st3.concat(String.valueOf(c1));
      c1 = st2.charAt(i);
      st3 = st3.concat(String.valueOf(c1));
    }

    System.out.println("\nModified String: \n"+st3);
    sc.close();
  }
}