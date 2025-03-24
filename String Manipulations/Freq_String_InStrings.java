import java.util.Scanner;
import java.lang.String;
public class Freq_String_InStrings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a Sentence with a full stop: ");
    String st = sc.nextLine();
    if(st.charAt(st.length()-1) != '.'){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    System.out.println("Enter string to be searched: ");
    String st1 = sc.next();
    st = st.replace('.', ' ');
    int count=0;
    char c = '\u0000';
    String st2="";
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(c != ' '){
        st2 = st2.concat(String.valueOf(c));
      }else{
        if(st2.equalsIgnoreCase(st1) == true){
          count = count+1;
        }
        st2 = "";
      }
    }
    st = st.trim();
    st = st.concat(".");
    System.out.println("\nSentence: "+st);
    System.out.println("Frequency of "+st1+": "+count);
    sc.close();
  }
}