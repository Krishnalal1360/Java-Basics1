import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;

public class GoldbachNumber_UsingString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a positive even number greater than 4: ");
    int n = sc.nextInt();
    if((n < 4) || (n%2 != 0)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    String st="";
    int flag=0;
    for(int i=3;i<n;i=i+2){
      for(int j=2;j<=i/2;j++){
        if(i%j == 0){
          flag = 1;
          break;
        }
      }
      if(flag == 0){
        st = st.concat(Integer.toString(i));
      }
      flag = 0;
    }
    System.out.println("st="+st);
    char c1='\u0000', c2='\u0000';
    int n1=0, n2=0;
    flag=0;
    for(int i=0;i<st.length();i++){
      c1 = st.charAt(i);
      for(int j=0;j<st.length();j++){
        c2 = st.charAt(j);
        n1 = Integer.parseInt(Character.toString(c1));
        n2 = Integer.parseInt(Character.toString(c2));
        if((n1+n2) == n){
          flag = 1;
          System.out.println("\nSum of two Odd Prime numbers results in positive Even number.");
          System.out.println(n1+"+"+n2+"="+n);
        }
      }
    }
    if(flag == 1){
      System.out.println(n+" is a Goldbach Number!");
    }
    sc.close();
  }
}