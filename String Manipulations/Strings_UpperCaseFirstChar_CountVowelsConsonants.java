import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class Strings_UpperCaseFirstChar_CountVowelsConsonants {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The strings must end with . or ?");
    System.out.println("Enter strings: ");
    String st = sc.nextLine();
    char c='\u0000', pc='\u0000';
    c = st.charAt(st.length()-1);
    pc = c;
    if((c != '.') && (c != '?')){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: Must end with . or ?");
      System.exit(0);
    }
    System.out.println("\nOriginal Strings: \n"+st);
    if(c == '.'){
      st = st.replace("."," ");
    }else if(c == '?'){
      st = st.replace("?", " ");
    }
    
    String st1="", st2="";
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(c != ' '){
        st1 = st1.concat(String.valueOf(c));
      }else{
        c = st1.charAt(0);
        c = Character.toUpperCase(c);
        st2 = st2.concat(String.valueOf(c));
        st2 = st2.concat(st1.substring(1));
        st2 = st2.concat(" ");
        st1 = "";
      }
    }

    int vc=0, cc=0, flag=0;
    st1 = "aeiouAEIOU";
    char c1='\u0000';
    for(int i=0;i<st2.length();i++){
      c = st2.charAt(i);
      flag = 0;
      for(int j=0;j<st1.length();j++){
        c1 = st1.charAt(j);
        if(c == c1){
          vc = vc+1;
          flag = 1;
          break;
        }
      }
      if(flag == 0){
        if(c != ' '){
          cc = cc+1;
        }
      }      
    }
    st2 = st2.trim();
    st2 = st2.concat(String.valueOf(pc));

    System.out.println("\nNew Strings: \n"+st2);
    System.out.println("\nVowels: "+vc);
    System.out.println("\nConsonants: "+cc);
    sc.close();
  }
}