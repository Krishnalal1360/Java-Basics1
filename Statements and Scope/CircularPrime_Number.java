import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;

public class CircularPrime_Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a prime number: ");
    int n = sc.nextInt();
    int f=0;
    for(int i=2;i<=n/2;i++){
      if(n%i == 0){
        f = 1;
        break;
      }
    }
    if(f == 1){
      System.out.println(n+" is not a Prime number!");
    }else{
      String st = Integer.toString(n);
      int num=0, flag=0;
      String st1="", st2="", st3="";

      for(int i=0;i<st.length();i++){
        for(int j=0;j<st.length();j++){
          if(j == i){
            st1 = st1.concat(Character.toString(st.charAt(j)));
          }else{
            st2 = st2.concat(Character.toString(st.charAt(j)));
          }
        }
        st3 = st2.concat(st1);
        num = Integer.parseInt(st3);
        for(int j=2;j<=num/2;j++){
          if(num%j == 0){
            flag = 1;
            break;
          }
        }
        if(flag == 0){
          System.out.println("Number "+num+" is prime!");
        }else{
          break;
        }
        st1 = "";
        st2 = "";
        st3 = "";
      }
      if(flag == 0){
        System.out.println(n+" is Circular Prime!");
      }else{
        System.out.println(n+" is not Circular Prime!");
      }
    }
    sc.close();
  }
}