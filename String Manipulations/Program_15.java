import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;

public class Program_15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Note: The length of the sentence must be inclusively between 4 and 99.");
    System.out.print("\nEnter a sentence: \n");
    String st = sc.nextLine();
    if(st.length() < 4 || st.length() > 99){
      System.out.println("\nReason: The length of the sentence must be inclusively between 4 and 99.");
      System.exit(0);
    }
    char c='\u0000', c1='\u0000';
    int ascii=0, diff=0;
    System.out.println("\nOriginal Sentence: \n"+st);
    StringBuffer sb = new StringBuffer(st);
    for(int i=0;i<sb.length();i++){
      c = sb.charAt(i);
      if(((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z'))){
        if((c >= 'A') && (c <= 'Z')){
            ascii = (int)(c+13);
            if(ascii > 90){
              diff = ascii-90;
              c1 = (char)(64+diff);
            }else{
              c1 = (char)(ascii);
            }
        }else if((c >= 'a') && (c <= 'z')){
          ascii = (int)(c+13);
          if(ascii > 122){
            diff = ascii-122;
            c1 = (char)(96+diff);
          }else{
            c1 = (char)(ascii);
          }
        }
        sb.setCharAt(i, c1);
      }
    }
    st = sb.toString();
    System.out.println("\nCaesar Cipher Sentence: \n"+st);
    sc.close();
  }
}