import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.String;
import java.lang.StringBuffer;

public class Strings_DeleteSpace_DeleteString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The strings must end with . or ? or !");
    System.out.println("Add extra whitespace between strings.");
    System.out.println("\nEnter strings: ");
    String st = sc.nextLine();  

    char c='\u0000';
    c = st.charAt(st.length()-1);
    if((c != '.') && (c != '?') && (c != '!')){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: String must end with . or ? or !");
      System.exit(0);
    }

    StringTokenizer stz = new StringTokenizer(st);
    int ct = stz.countTokens();
    int ws = (ct-1)*2;
    int cws=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(c == ' '){
        cws = cws+1;
      }
    }
    if(cws != ws){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: Whitespaces");
      System.exit(0);
    }

    System.out.println("\nStrings: "+st);
    st = st.replace("  "," ");
    System.out.println("\nNew Strings: "+st);

    System.out.println("\nEnter a string from strings to delete: ");
    String st1 = sc.next();
    System.out.println("\nEnter index of that string: ");
    int index = sc.nextInt();

    StringBuffer sb = new StringBuffer(st);
    sb = new StringBuffer(st);
    sb.delete(index, (index+(st1.length()+1)));
    st = sb.toString();
    System.out.println("\nNew Strings: \n"+st);
    sc.close();
  }
}