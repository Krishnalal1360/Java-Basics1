import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;

public class Kaprekar_Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter lower limit greater than 3: ");
    int l = sc.nextInt();
    if(l <= 3){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    System.out.println("Enter upper limit: ");
    int u = sc.nextInt();
    int sq=0, l1=0, n1=0, n2=0;
    String st="", st1="", st2="";
    System.out.println("\nKaprekar Numbers: ");
    for(int i=l;i<=u;i++){
      sq = i*i;
      st = Integer.toString(sq);
      l1 = st.length()-1;
      for(int j=0;j<=l1/2;j++){
        st1 = st1.concat(Character.toString(st.charAt(j)));
      }
      for(int k=(l1/2)+1;k<st.length();k++){
        st2 = st2.concat(Character.toString(st.charAt(k)));
      }
      n1 = Integer.parseInt(st1);
      n2 = Integer.parseInt(st2);
      if(i == (n1+n2)){
        if(i == u){
          System.out.print(i);
        }else{
          System.out.print(i+", ");
        }
      }
      st1 = "";
      st2 = "";
    }
    sc.close();
  }
}