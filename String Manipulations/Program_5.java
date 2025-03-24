import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
import java.lang.StringBuffer;

public class Program_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter strings: ");
    String st = sc.nextLine();
    System.out.println("\nOriginal strings: \n"+st);
    char c='\u0000';
    String st1="", st2="";
    StringBuffer sb;
    st = st.concat(" ");
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isWhitespace(c) == false){
        st1 = st1.concat(Character.toString(c));
      }else{
        sb = new StringBuffer(st1);
        st1 = sb.reverse().toString();
        st2 = st2.concat(st1);
        st2 = st2.concat(" ");
        st1 = "";
      }
    }
    st2 = st2.trim();

    System.out.println("\nReversed Strings: \n"+st2);
    sc.close();
  }
}