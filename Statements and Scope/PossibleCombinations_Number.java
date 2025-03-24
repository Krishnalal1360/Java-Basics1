import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
import java.lang.StringBuffer;

public class PossibleCombinations_Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the lower limit greater than 9: ");
    int l = sc.nextInt();
    if(l < 10){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    System.out.println("Enter the upper limit greater than lower limit: ");
    int u = sc.nextInt();
    if(u <= l){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    System.out.println("\nEnter a number within limit: ");
    int n = sc.nextInt();
    if((n >= l) && (n <= u)){
      String st="", st1="", st2="", st3="", st4="";
      st = Integer.toString(n);
      System.out.println("\nPossible Combinations: ");
      for(int i=0;i<st.length();i++){
        for(int j=0;j<st.length();j++){
          if(i == j){
            st1 = Character.toString(st.charAt(j));
          }else{
            st2 = st2.concat(Character.toString(st.charAt(j)));
          }
        }
        st3 = st1.concat(st2);
        StringBuffer sb = new StringBuffer(st2);
        st2 = sb.reverse().toString();
        st4 = st1.concat(st2);
        System.out.println(st3);
        System.out.println(st4);
        st2 = "";
        st3 = "";
        st4 = "";
      }
    }else{
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    sc.close();
  }
}