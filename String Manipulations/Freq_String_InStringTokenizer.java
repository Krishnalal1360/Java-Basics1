import java.util.StringTokenizer;
import java.lang.String;
import java.util.Scanner;

public class Freq_String_InStringTokenizer {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a Sentence with a full stop: ");
    String st = sc.nextLine();
    if(st.charAt(st.length()-1) != '.'){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    st = st.replace('.', ' ');
    StringTokenizer stz = new StringTokenizer(st);
    int count = stz.countTokens();
    System.out.println("\nNumber of Tokens: "+count);
    System.out.println("\nEnter a token to be searched: ");
    String st1 = sc.next();
    String st2="";
    count = 0;
    while(stz.hasMoreTokens() == true){
      st2 = stz.nextToken();
      if(st1.equalsIgnoreCase(st2) == true){
        count = count+1;
      }
    }
    st = st.trim();
    st = st.concat(".");
    System.out.println("\nSentence: "+st);
    System.out.println("Frequency of "+st1+": "+count);
    sc.close();
  }
}