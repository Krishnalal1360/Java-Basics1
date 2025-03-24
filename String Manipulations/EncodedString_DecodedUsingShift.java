import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class EncodedString_DecodedUsingShift {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter number of strings: ");
    int n = sc.nextInt();
    System.out.println("Note: Add whitespaces at the end.");
    System.out.println("Enter encoded Uppercase strings with same double characters for whitespaces: ");
    sc.nextLine();
    String st = sc.nextLine();
    st = st.toUpperCase();

    char c='\u0000', c1='\u0000';
    c = st.charAt(st.length()-1);
    c1 = st.charAt(st.length()-2);
    if(c != c1){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    String ws = String.valueOf(c)+Character.toString(c1);
    int count=0, index=0;
    for(int i=0;i<st.length();i++){
      index = st.indexOf(ws, i);
      count = count+1;
      i = index+1;
    }
    if(count != n){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    System.out.println("\nEnter shift value inclusive between 1 and 26: ");
    int sv = sc.nextInt();
    if((sv < 1) || (sv > 26)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    c = ws.charAt(0);
    c1 = ws.charAt(1);
    char c2='\u0000', c3='\u0000', c4='\u0000';
    String st1="", st2="";
    for(int i=0;i<st.length()-1;i++){
      c2 = st.charAt(i);
      c3 = st.charAt(i+1);
      if((c2 == c) && (c3 == c1)){
        for(int j=0;j<st1.length();j++){
          c4 = st1.charAt(j);
          if((c4+sv >= 65) && (c4+sv <= 90)){
            c4 = (char)(c4+sv);
          }else if(c4+sv > 90){
            c4 = (char)(64+(c4+sv-90));
          }
          st2 = st2.concat(String.valueOf(c4));
        }
        st2 = st2.concat(" ");
        st1 = "";
      }else if((c2 != c) && (c3 == c1)){
        st1 = st1.concat(String.valueOf(c2));
      }else if((c2 == c) && (c3 != c1) && (st.charAt(i-1) == c)){

      }else if((c2 == c) && (c3 != c1) && (st.charAt(i-1) != c)){
        st1 = st1.concat(String.valueOf(c2));
      }else if((c2 != c) && (c3 != c1)){
        st1 = st1.concat(String.valueOf(c2));
      }
    }
    System.out.println("\nEncoded Strings: "+st);
    System.out.println("\nDecoded Strings: "+st2);
    sc.close();
  }
}