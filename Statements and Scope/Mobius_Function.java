import java.util.Scanner;
import java.lang.Math;

public class Mobius_Function {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a positive number: ");
    int n = sc.nextInt();
    if(n < 0){
      System.out.println("\nInvalid Input!");
    }else{
      if(n == 1){
        System.out.println("\nM("+n+")="+1);
      }else{
        int count=0, flag=0;
        for(int i=2;i<=n;i++){
          if(n%i == 0){
            if(((i%2 == 0) || (i%3 == 0) || (i%5 == 0) || (i%7 == 0)) && (i > 7)){
  
            }else{
              count = count+1;
            }
            if(n%(i*i) == 0){
              System.out.println("\nM("+n+")="+0);
              flag = 1;
              break;
            }
          }
        }
        if(flag == 0){
          count = (int)(Math.pow(-1, count));
          System.out.println("\nM("+n+")="+count);
        }
      }
    }
    sc.close();
  }
}