import java.util.Scanner;
import java.lang.Math;

public class MinimumDistance_TwinPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a positive non-prime number: ");
    int n = sc.nextInt();
    int f=0;
    for(int i=2;i<=n/2;i++){
      if(n%i == 0){
        f = 1;
        break;
      }
    }
    if((f == 0) || (n < 2)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    f = 0;
    int p1=0, p2=0;
    for(int i=n;i>=2;i--){
      f = 0;
      for(int j=2;j<=i/2;j++){
        if(i%j == 0){
          f = 1;
          break;
        }
      }
      if(f == 0){
        p1 = i;
        break;
      }
    }
    f = 0;
    for(int i=n;i<=n*n;i++){
      f = 0;
      for(int j=2;j<=i/2;j++){
        if(i%j == 0){
          f = 1;
          break;
        }
      }
      if(f == 0){
        p2 = i;
        break;
      }
    }
    int d1 = Math.abs(n-p1);
    int d2 = Math.abs(n-p2);
    int md = Math.min(d1, d2);
    int p11=0, p22=0;
    if(md == d1){
      p11 = p1-2;
      f = 0;
      for(int i=2;i<=p11/2;i++){
        if(p11%i == 0){
          f = 1;
          break;
        }
      } 
      if(f == 0){
        System.out.println("\nMinimum Distance: "+md);
        System.out.println("Twin Prime Pairs: "+"("+p11+", "+p1+")");
      }else{
        f = 0;
        p22 = p2+2;
        for(int i=2;i<=p22/2;i++){
          if(p22%i == 0){
            f = 1;
            break;
          }
        }
        if(f == 0){
          System.out.println("\nMinimum Distance: "+md);
          System.out.println("Twin Prime Pairs: "+"("+p2+", "+p22+")");
        }else{
          System.out.println("\nMinimum Distance: "+md);
          System.out.println("No Twin Prime Pairs exist!");
        }
      }
    }else if(md == d2){
      p22 = p2+2;
      f = 0;
      for(int i=2;i<=p22/2;i++){
        if(p22%i == 0){
          f = 1;
          break;
        }
      }
      if(f == 0){
        System.out.println("\nMinimum Distance: "+md);
        System.out.println("Twin Prime Pairs: "+"("+p2+", "+p22+")");
      }else{
        f = 0;
        p11 = p1-2;
        for(int i=2;i<=p11/2;i++){
          if(p11%i == 0){
            f = 1;
            break;
          }
        }
        if(f == 0){
          System.out.println("\nMinimum Distance: "+md);
          System.out.println("Twin Prime Pairs: "+"("+p11+", "+p1+")");
        }else{
          System.out.println("\nMinimum Distance: "+md);
          System.out.println("No Twin Prime Pairs exist!");
        }
      }
    }
    sc.close();
  }
}