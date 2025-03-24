import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
import java.lang.StringBuffer;

public class Program_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: You can enter 20 lines as maximum limit.");
    System.out.println("Each line should consists of 80 characters as maximum limit.");
    System.out.println("The punctuation marks can be ' or . or , or ; or : or whitespace.");
    System.out.println("The line must end with a full stop.");
    System.out.println("\nEnter number of lines: ");
    int n = sc.nextInt();
    if((n < 1) || (n > 20)){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The number of lines should be inclusive between 1 and 20.");
      System.exit(0);
    }
    String ar[] = new String[n];

    System.out.println("\nEnter the lines: ");
    sc.nextLine();
    char c='\u0000';
    for(int i=0;i<ar.length;i++){
      ar[i] = sc.nextLine();
      if((ar[i].length() < 1) || (ar[i].length() > 80)){
        System.out.println("\nInvalid Input!");
        System.out.println("Reason: The length of each line should be inclusive between 1 and 80.");
        System.exit(0);
      }
      if(ar[i].charAt(ar[i].length()-1) != '.'){
        System.out.println("\nInvalid Input!");
        System.out.println("Reason: The line must end with a full stop.");
        System.exit(0);
      }
      for(int j=0;j<ar[i].length()-1;j++){
        c = ar[i].charAt(j);
        if(Character.isLetterOrDigit(c) == true){
          continue;
        }else if(Character.isWhitespace(c) == true){
          continue;
        }else if((c == '\'') || (c == ',') || (c == ';') || (c == ':')){
          continue;
        }else{
          System.out.println("\nInvalid Input!");
          System.out.println("Reason: The line should consists of only letters, digits, ' or , or ; or : or whitespace.");
          System.exit(0);
        }
      }
    }
    System.out.println("\nThe lines are: ");
    for(int i=0;i<ar.length;i++){
      System.out.println(ar[i]);
    }

    c='\u0000';
    StringBuffer sb;
    String st="", st1="";
    System.out.println("\nThe words in reversed order: ");
    for(int i=ar.length-1;i>=0;i--){
      sb = new StringBuffer(ar[i]);
      sb.insert(0, ' ');
      ar[i] = sb.toString();
      for(int j=ar[i].length()-2;j>=0;j--){
        c = ar[i].charAt(j);
        if(c != ' '){
          if((c != ',') && (c != ':') && (c != ';') && (c != '\'')){
            st = st.concat(Character.toString(c));
          }
        }else{
          sb = new StringBuffer(st);
          st = sb.reverse().toString();
          st1 = st1.concat(st);
          st1 = st1.concat(" ");
          st = "";
        }
      }
    }
    st1 = st1.trim();
    System.out.println(st1);
    sc.close();
  }
}