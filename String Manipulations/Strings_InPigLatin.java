import java.util.Scanner;
import java.lang.String;

public class Strings_InPigLatin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter strings: ");
    String st = sc.nextLine();
    st = st.concat(" ");
    st = st.toUpperCase();
    int id=0;
    char c='\u0000', c1='\u0000', c2='\u0000';
    String st1="", vs="AEIOU", st2="", st3="", st4="";
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(c != ' '){
        st1 = st1.concat(String.valueOf(c));
      }else{
        outer:
        for(int j=0;j<st1.length();j++){
          c1 = st1.charAt(j);
          for(int k=0;k<vs.length();k++){
            c2 = vs.charAt(k);
            if(c1 == c2){
              id = j;
              break outer;
            }
          }
        }
        st2 = st1.substring(0, id);
        st3 = st1.substring(id, st1.length());
        st4 = st4+st3+st2+"AY";
        st4 = st4+" ";
        st1 = "";
      }
    }
    st = st.trim();
    System.out.println("\nStrings: "+st);
    System.out.println("\nPigLatin Strings: "+st4);
    sc.close();
  }
}