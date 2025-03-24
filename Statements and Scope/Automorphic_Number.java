import java.util.Scanner;
import java.lang.Integer;
import java.lang.String;
import java.lang.Math;

public class Automorphic_Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter number of terms: ");
    int n = sc.nextInt();
    int num=0, l=0, sq=0, r=0, count=0;
    String st="";
    System.out.println("\nAutomorphic Numbers: ");
    outer:
    for(int i=1;i>=1;i++){
      num = i;
      st = st.concat(Integer.toString(num));
      l = st.length();
      sq = num*num;
      r = sq%(int)(Math.pow(10, l));
      if(r == num){
        count = count+1;
        System.out.println(num);
      }
      if(count == n){
        break outer;
      }
      st = "";
    }
    sc.close();
  }
}