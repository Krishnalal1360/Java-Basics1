import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;

public class Fascinating_Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter lower limit greater than 2-digit: ");
    int l = sc.nextInt();
    System.out.println("Enter upper limit: ");
    int u = sc.nextInt();
    if((l > u) || (l <= 99)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    int freq=0, count=0, f=0;
    char c1='\u0000', c2='\u0000';
    String st="", st1="", st2="", st3="", st4="123456789";
    System.out.println("\nFascinating Numbers inclusive between "+l+" and "+u+" are: ");
    for(int i=l;i<=u;i++){
      st = Integer.toString(i);
      st1 = Integer.toString(i*2);
      st2 = Integer.toString(i*3);
      st3 = st+st1+st2;
      f = 0;
      for(int j=0;j<st4.length();j++){
        c1 = st4.charAt(j);
        count = 0;
        for(int k=0;k<st3.length();k++){
          c2 = st3.charAt(k);
          if(c1 == c2){
            count = count+1;
          }
        }
        if(count != 1){
          f = 1;
          break;
        }
      }
      if(f == 0){
        freq = freq+1;
        System.out.print(i+" ");
      }
    }
    System.out.println("\n\nFrequency: "+freq);
    sc.close();
  }
}