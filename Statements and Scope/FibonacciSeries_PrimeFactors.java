import java.util.Scanner;

public class FibonacciSeries_PrimeFactors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter 1 for Fibonacci Series");
    System.out.println("Enter 2 for Prime Factors");
    System.out.println("Enter your choice: ");
    int ch = sc.nextInt();
    switch(ch){
      case 1:
      System.out.println("\nEnter the lower limit: ");
      int l = sc.nextInt();
      System.out.println("Enter the upper limit: ");
      int u = sc.nextInt();
      int a, b, c;
      a = 0;
      b = 1;
      System.out.println("\nFibonacci Series: ");
      if(u-l == 0){
        System.out.print(a);
      }else if(u-l == 1){
        System.out.print(a+" "+b);
      }else{
        System.out.print(a+" "+b+" ");
        l = l+2;
        while(l <= u){
          c = a+b;
          System.out.print(c+" ");
          a = b;
          b = c;
          l = l+1;
        }
      }
      break;

      case 2:
      System.out.println("\nEnter a positive number greater than 3: ");
      int n = sc.nextInt();
      if(n < 4){
        System.out.println("\nInvalid Input!");
        System.exit(0);
      }
      int flag=0;
      System.out.println("\nPrime Factors: ");
      for(int i=2;i<=n/2;i++){
        if(n%i == 0){
          flag = 0;
          for(int j=2;j<=i/2;j++){
            if(i%j == 0){
              flag = 1;
              break;
            }
          }
          if(flag == 0){
            System.out.print(i+" ");
          }
        }
      }
      break;

      default:
      System.out.println("\nInvalid Choice!");
    }
    sc.close();
  }
}