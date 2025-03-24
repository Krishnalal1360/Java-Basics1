import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;
import java.lang.Character;
import java.lang.Integer;

public class EncodedString_DecodedUsingReverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: Enter strings of characters.");
    System.out.println("The characters are in their ASCII code form.");
    System.out.println("Use space also between ASCII code digits.");
    System.out.println("Must add whitespace at end");
    System.out.println("\nEnter a string: ");
    String st = sc.nextLine();
    char c='\u0000';
    int cc=0, cws=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(c != ' '){
        cc = cc+1;
      }else if(c == ' '){
        cws = cws+1;
      }
    }
    if(cc != cws){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    String st1="";
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(c != ' '){
        st1 = st1.concat(String.valueOf(c));
      }
    }
    StringBuffer sb = new StringBuffer(st1);
    st1 = sb.reverse().toString();
    char c1='\u0000', c2='\u0000';
    int num=0;
    String st2="", st3="";
    for(int i=0;i<st1.length();i=i+2){
      c = st1.charAt(i);
      c1 = st1.charAt(i+1);
      st2 = Character.toString(c)+String.valueOf(c1);
      num = Integer.valueOf(st2);
      c2 = (char)(num);
      st3 = st3.concat(Character.toString(c2));
    }
    System.out.println("\nEncoded string: "+st);
    System.out.println("\nDecoded string: "+st3);
    sc.close();
  }
}