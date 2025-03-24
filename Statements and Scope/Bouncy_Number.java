import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;
import java.lang.StringBuffer;

public class Bouncy_Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter lower limit: ");
    int l = sc.nextInt();
    System.out.println("Enter upper limit: ");
    int u = sc.nextInt();
    if(l > u){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    int freq=0;
    char temp='\u0000';
    String st="", st1="", st2="";
    StringBuffer sb;
    System.out.println("\nBouncy Numbers between inclusive "+l+" and "+u+" are: ");
    for(int i=l;i<=u;i++){
      st = Integer.toString(i);
      sb = new StringBuffer(st);
      for(int j=0;j<sb.length()-1;j++){
        temp = sb.charAt(j);
        for(int k=j+1;k<sb.length();k++){
          if(sb.charAt(k) < sb.charAt(j)){
            sb.setCharAt(j, sb.charAt(k));
            sb.setCharAt(k, temp);
            temp = sb.charAt(j);
          }
        }
      }
      st1 = sb.toString();
      sb = new StringBuffer(st1);
      st2 = sb.reverse().toString();
      if((st.equals(st1)) || (st.equals(st2))){
      }else{
        freq = freq+1;
        System.out.print(st+" ");
      }
    }
    System.out.println("\n\nFrequency: "+freq);
    sc.close();
  }
}