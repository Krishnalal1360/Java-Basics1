import java.util.Scanner;
import java.lang.String;

public class GoldbachNumber_UsingArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a positive even number greater than 4: ");
    int n = sc.nextInt();
    if((n < 4) || (n%2 != 0)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    int ar[] = new int[(n/2)-1];
    int flag=0, count=0;
    for(int i=3;i<n;i=i+2){
      for(int j=2;j<=i/2;j++){
        if(i%j == 0){
          flag = 1;
          break;
        }
      }
      if(flag == 0){
        ar[count] = i;
        count = count+1;
      }
      flag = 0;
    }
   
    int n1=0, n2=0;
    flag=0;
    for(int i=0;i<ar.length;i++){
      n1 = ar[i];
      for(int j=0;j<ar.length;j++){
        n2 = ar[j];
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