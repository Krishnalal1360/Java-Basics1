import java.util.Scanner;
import java.lang.String;
import java.util.StringTokenizer;
import java.lang.Character;

public class UpperCaseSentence_DeleteExtraSpace_ArrangeStringsStartsAndEndsWithVowel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The sentence must be in UpperCase.");
    System.out.println("Add extra whitespace between strings.");
    System.out.println("The sentence must end with . or ? or !");
    System.out.println("\nEnter a sentence: ");
    String st = sc.nextLine();

    char c='\u0000', pc='\u0000';
    int flag=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isUpperCase(c) == true){
        continue;
      }else if(Character.isLowerCase(c) == true){
        flag = 1;
      }
    }
    if(flag == 1){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The sentence is not in UpperCase!");
      System.exit(0);
    }
    
    c = st.charAt(st.length()-1);
    pc = c;
    if((c != '.') && (c != '?') && (c != '!')){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The sentence does not end with . or ? or !");
      System.exit(0);
    }

    StringTokenizer stz = new StringTokenizer(st," ");
    int ct = stz.countTokens();
    int ws = (ct-1)*2;
    int wsc=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(c == ' '){
        wsc = wsc+1;
      }
    }
    if(wsc != ws){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The sentence does not have extra whitespace between strings.");
      System.exit(0);
    }

    System.out.println("\nOriginal Sentence: \n"+st);

    st = st.replace("  "," ");
    System.out.println("\nSentence after removing extra whitespace: \n"+st);

    st = st.replace(String.valueOf(pc), " ");

    String st1="", st2="", st3="";
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(c != ' '){
        st1 = st1.concat(Character.toString(c));
      }else{
        if(st1.startsWith("A") || st1.startsWith("E") || st1.startsWith("I") || st1.startsWith("O") || st1.startsWith("U")){
          if(st1.endsWith("A") || st1.endsWith("E") || st1.endsWith("I") || st1.endsWith("O") || st1.endsWith("U")){
            st2 = st2.concat(st1);
            st2 = st2.concat(" ");
          }else{
            st3 = st3.concat(st1);
            st3 = st3.concat(" ");
          }
        }else{
          st3 = st3.concat(st1);
          st3 = st3.concat(" ");
        }
        st1 = "";
      }
    }
    st3 = st3.trim();
    st3 = st3.concat(String.valueOf(pc));

    if(st2.length() > 0){
      st3 = st2.concat(st3);
    }

    System.out.println("\nNew Strings: \n"+st3);
    sc.close(); 
  }
}