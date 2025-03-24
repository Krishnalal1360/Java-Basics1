import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
import java.util.StringTokenizer;

public class Program_11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The sentence must be in lowercase.");
    System.out.println("The sentence must be terminated with a full stop.");
    System.out.println("The sentence must contain single whitespace between strings.");
    System.out.println("\nEnter a sentence: ");
    String st = sc.nextLine();
    char c='\u0000';
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isLetter(c) == true){
        if(Character.isLowerCase(c) == false){
          System.out.println("\nInvalid Input!");
          System.out.println("Reason: The sentence must be in lowercase.");
          System.exit(0);
        }
      }
    }
    c = st.charAt(st.length()-1);
    if(c != '.'){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The sentence must be terminated with a full stop.");
      System.exit(0);
    }
    StringTokenizer stt = new StringTokenizer(st, " ");
    int ct = stt.countTokens();
    int ws = ct-1;
    int cws=0;
    c='\u0000';
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isWhitespace(c) == true){
        cws = cws+1;
      }
    }
    if(cws != ws){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The sentence must contain single whitespace between strings.");
      System.exit(0);
    }

    System.out.println("\nOriginal Sentence: \n"+st);
    st = st.replace(Character.toString('.'), "");
    stt = new StringTokenizer(st, " ");
    ct = stt.countTokens();
    String ar[] = new String[ct];
    int index=0;
    while(stt.hasMoreTokens()){
      ar[index] = stt.nextToken();
      index = index+1;
    }

    String temp="";
    for(int i=0;i<ar.length-1;i++){
      temp = ar[i];
      for(int j=i+1;j<ar.length;j++){
        if(ar[j].length() < ar[i].length()){
          ar[i] = ar[j];
          ar[j] = temp;
          temp = ar[i];
        }else if(ar[j].length() == ar[i].length()){
          if(ar[j].compareTo(ar[i]) < 0){
            ar[i] = ar[j];
            ar[j] = temp;
            temp = ar[i];
          }
        }
      }
    }

    st="";
    for(int i=0;i<ar.length;i++){
      st = st.concat(ar[i]);
      st = st.concat(" ");
    }
    st = st.trim();
    st = st.concat(".");
    System.out.println("\nModified Sentence: \n"+st);
    sc.close();
  }
}