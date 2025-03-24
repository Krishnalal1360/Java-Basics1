import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;

public class CharactersSort {

  static public void sort(String st){
    System.out.println("\nString: "+st);
    StringBuffer sb = new StringBuffer(st);
    char temp='\u0000';
    for(int i=0;i<sb.length()-1;i++){
      temp = sb.charAt(i);
      for(int j=i+1;j<sb.length();j++){
        if(sb.charAt(j) < sb.charAt(i)){
          sb.setCharAt(i, sb.charAt(j));
          sb.setCharAt(j, temp);
          temp = sb.charAt(i);
        }
      }
    }
    st = sb.toString();
    System.out.println("Sorted String: "+st);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a string: ");
    String st = sc.next();
    sort(st);
    sc.close();
  }
}