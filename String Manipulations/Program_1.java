import java.util.Scanner;
import java.lang.String;

public class Program_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter Strings: ");
    String st = sc.nextLine();
    char c='\u0000', max_u='A', max_l='a', min_u='Z', min_l='z';
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if((c >= 'A') && (c <= 'Z')){
        if(c > max_u){
          max_u = c;
        }
        if(c < min_u){
          min_u = c;
        }
      }else if((c >= 'a') && (c <= 'z')){
        if(c > max_l){
          max_l = c;
        }
        if(c < min_l){
          min_l = c;
        }
      }
    }
    System.out.println("Max Upper Case: "+max_u);
    System.out.println("Min Upper Case: "+min_u);
    System.out.println("Max Lower Case: "+max_l);
    System.out.println("Min Lower Case: "+min_l);
    sc.close();
  }
}