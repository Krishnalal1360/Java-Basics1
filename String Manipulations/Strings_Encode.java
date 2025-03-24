import java.util.Scanner;
import java.lang.String;

public class Strings_Encode{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter strings: ");
    String st = sc.nextLine();
    System.out.println("Enter number of moves either positive or negative: ");
    int n = sc.nextInt();
    st = st.toUpperCase();
    st = st.concat(" ");
    char c='\u0000';
    String st1="", st2="", st3="";
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(c != ' '){
        st1 = st1.concat(String.valueOf(c));
      }else{
        for(int j=0;j<st1.length();j++){
          c = st1.charAt(j);
          if((c+n >= 65) && (c+n <= 90)){
            c = (char)(c+n);
          }else if(c+n > 90){
            c = (char)(64+(c+n-90));
          }else if(c+n < 65){
            c = (char)(91-(65-(c+n)));
          }
          st2 = st2.concat(String.valueOf(c));
        }
        st3 = st3.concat(st2);
        st3 = st3.concat(" ");
        st2 = "";
        st1 = "";
      }
    }
    st = st.trim();
    st3 = st3.trim();
    System.out.println("\nStrings: "+st);
    System.out.println("\nEncoded Strings: "+st3);
    sc.close();
  }
}