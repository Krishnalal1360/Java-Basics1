import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class Program_13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The sentence must consists of equal number of parantheses.");
    System.out.println("The sentence must end with a full stop.");
    System.out.println("The sentence must contain atleast one character inside each parantheses.");
    System.out.println("Nested Parantheses are not allowed.");
    System.out.println("\nEnter a sentence: ");
    String st = sc.nextLine();
    System.out.println("\nOriginal Sentence: \n"+st);
    st = st.toUpperCase();
    System.out.println("\nUpperCased Sentence: \n"+st);
    char c='\u0000';
    c = st.charAt(st.length()-1);
    if(c != '.'){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The sentence must end with a full stop.");
      System.exit(0);
    }

    int cop=0, ccp=0;
    c='\u0000';
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(c == '('){
        cop = cop+1;
      }else if(c == ')'){
        ccp = ccp+1;
      }
    }
    if(cop != ccp){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The sentence must consists of equal number of parantheses.");
      System.exit(0);
    }

    char c1='\u0000';
    for(int i=0;i<st.length()-1;i++){
      c = st.charAt(i);
      if(c == '('){
        c1 = st.charAt(i+1);
        if(c1 == ')'){
          System.out.println("\nInvalid Input!");
          System.out.println("Reason: The sentence must contain atleast one character inside each parantheses.");
          System.exit(0);
        }
      }
    }

    String st1="";
    c='\u0000';
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if((c == '(') || (c == ')')){
        st1 = st1.concat(Character.toString(c));
      }
    }
    System.out.println("\nParantheses: \n"+st1);

    cop=0;
    ccp=0;
    int flag=0;
    c='\u0000';
    for(int i=0;i<st1.length()-1;i++){
      c = st1.charAt(i);
      if(c == '('){
        c1 = st1.charAt(i+1);
        if(c1 == '('){
          flag = 1;
          break;
        }
      }else if(c == ')'){
        c1 = st1.charAt(i+1);
        if(c1 == ')'){
          flag = 1;
          break;
        }
      }
    }
    if(flag == 1){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: Nested Parantheses are not allowed.");
      System.exit(0);
    }
    System.out.println("\nValid Sentence: \n"+st);
    sc.close();
  }
}