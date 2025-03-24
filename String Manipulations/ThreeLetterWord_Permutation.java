import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;

public class ThreeLetterWord_Permutation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a three lettered unique word: ");
    String st = sc.next();
    st = st.toUpperCase();
    if(st.length() != 3){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    char c1='\u0000', c2='\u0000';
    for(int i=0;i<st.length()-1;i++){
      c1 = st.charAt(i);
      for(int j=i+1;j<st.length();j++){
        c2 = st.charAt(j);
        if(c1 == c2){
          System.out.println("\nInvalid Input!");
          System.exit(0);
        }
      }
    }
    String st1="", st2="", st3="", st4="";
    StringBuffer sb;
    System.out.println("\nPermutation of "+st+" are:");
    for(int i=0;i<st.length();i++){
      for(int j=0;j<st.length();j++){
        c1 = st.charAt(j);
        if(i == j){
          st1 = st1.concat(String.valueOf(c1));
        }else{
          st2 = st2.concat(String.valueOf(c1));
        }
      }
      st3 = st1.concat(st2);
      sb = new StringBuffer(st2);
      st2 = sb.reverse().toString();
      st4 = st1.concat(st2);
      System.out.println(st3);
      System.out.println(st4);
      st1 = "";
      st2 = "";
    }
    sc.close();
  }
}