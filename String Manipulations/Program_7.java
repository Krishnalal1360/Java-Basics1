import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
import java.lang.StringBuffer;

public class Program_7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The string length must be 4.");
    System.out.println("Enter a string: ");
    String st = sc.next();
    if(st.length() != 4){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The length of string must be 4.");
      System.exit(0);
    }
    System.out.println("\nOriginal String: \n"+st);

    st = st.toUpperCase();
    System.out.println("\nUppercase String: \n"+st);

    char c='\u0000', c1='\u0000';
    String st1="", st2="", st3="", st4="", st5="";
    StringBuffer sb;
    System.out.println("\nPermutation of String: ");
    for(int i=0;i<st.length();i++){
      
      for(int j=0;j<st.length();j++){
        c = st.charAt(j);
        if(i == j){
          st1 = String.valueOf(c);
        }else{
          st2 = st2.concat(Character.toString(c));
        }
      }

      for(int k=0;k<st2.length();k++){
        for(int l=0;l<st2.length();l++){
          c1 = st2.charAt(l);
          if(k == l){
            st3 = String.valueOf(c1);
          }else{
            st4 = st4.concat(Character.toString(c1));
          }
        }
        st5 = st1.concat(st3).concat(st4);
        System.out.println(st5);
        st4 = "";
      }

      sb = new StringBuffer(st2);
      st2 = sb.reverse().toString();
      for(int k=0;k<st2.length();k++){
        for(int l=0;l<st2.length();l++){
          c1 = st2.charAt(l);
          if(k == l){
            st3 = String.valueOf(c1);
          }else{
            st4 = st4.concat(Character.toString(c1));
          }
        }
        st5 = st1.concat(st3).concat(st4);
        System.out.println(st5);
        st4 = "";
      }

      st2 = "";
    }
    sc.close();
  }
}