import java.util.Scanner;

public class Strings_whitespace {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter strings: ");
    String st = sc.nextLine();
    char c='\u0000';
    int cws=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(c == ' '){
        cws = cws+1;
      }
    }
    System.out.println("\nStrings: "+st);
    System.out.println("\nNumber of whitespaces: "+cws);
    sc.close();
  }
}