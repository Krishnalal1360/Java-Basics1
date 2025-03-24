import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;

public class MixedCaseStrings_RemoveVowels_AlphabeticalSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter strings in mixed case: ");
    String st = sc.nextLine();
    char c='\u0000';
    int lc=0, uc=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isLowerCase(c) == true){
        lc = lc+1;
      }else if(Character.isUpperCase(c) == true){
        uc = uc+1;
      }
    }
    if((lc == 0) || (uc == 0)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    st = st.concat(" ");
    char c1='\u0000', temp='\u0000';
    String st1="", vs="aeiouAEIOU", st2="";
    StringBuffer sb;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(c != ' '){
        st1 = st1.concat(String.valueOf(c));
      }else{
        sb = new StringBuffer(st1);
        for(int j=0;j<sb.length();j++){
          c = sb.charAt(j);
          for(int k=0;k<vs.length();k++){
            c1 = vs.charAt(k);
            if(c == c1){
              sb.setCharAt(j, '\u0000');
              break;
            }
          }
        }
        for(int j=0;j<sb.length()-1;j++){
          temp = sb.charAt(j);
          for(int k=j+1;k<sb.length();k++){
            if(sb.charAt(k) < sb.charAt(j)){
              sb.setCharAt(j, sb.charAt(k));
              sb.setCharAt(k, temp);
              temp = sb.charAt(j);
            }
          }
        }
        st1 = sb.toString();
        st2 = st2.concat(st1);
        st2 = st2.concat(" ");
        st1 = "";
      }
    }
    System.out.println("\nStrings: "+st);
    System.out.println("\nChanged Strings: "+st2);
    sc.close();
  }
}