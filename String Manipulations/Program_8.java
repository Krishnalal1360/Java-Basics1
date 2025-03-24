import java.util.Scanner;
import java.lang.String;
import java.util.StringTokenizer;
import java.lang.Character;

public class Program_8{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The whitespace between strings should be more than 1.");
    System.out.println("Enter strings: ");
    String st = sc.nextLine();
    StringTokenizer stz = new StringTokenizer(st);
    int ct = stz.countTokens();
    int ws = (ct-1);
    char c='\u0000';
    int cws=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isWhitespace(c) == true){
        cws = cws+1;
      }
    }
    if(ws == cws){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The number of whitespaces must be greater than 1 between strings.");
      System.exit(0);
    }
    c = st.charAt(st.length()-1);
    if(Character.isWhitespace(c) == true){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The sentence should not end with whitespace.");
      System.exit(0);
    }

    System.out.println("\nOriginal Strings: \n"+st);

    int flag=0;
    cws=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isWhitespace(c) == false){
        if(flag == 1){
          break;
        }
      }else if(Character.isWhitespace(c) == true){
        cws = cws+1;
        flag = 1;
      }
    }

    String st1="";
    for(int i=1;i<=cws;i++){
      st1 = st1.concat(" ");
    }

    st = st.replace(st1, " ");

    System.out.println("\nModified Strings: \n"+st);
    sc.close();
  }
}