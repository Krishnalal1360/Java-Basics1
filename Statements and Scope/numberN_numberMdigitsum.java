import java.util.Scanner;

public class numberN_numberMdigitsum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter positive lower limit for M: ");
    int l = sc.nextInt();
    System.out.println("Enter positive upper limit for M: ");
    int u = sc.nextInt();
    if((l < 0) || (u < 0) || (l > u)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    System.out.println("\nEnter a positive number less than lower limit for N: ");
    int n = sc.nextInt();
    if((n < 0) || (n >= l)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    int dup=0, r=0, sum=0;
    for(int i=l;i<=u;i++){
      dup = i;
      while(dup > 0){
        r = dup%10;
        sum = sum+r;
        dup = dup/10;
      }
      if(sum == n){
        System.out.println("Smallest M number is "+i+" whose sum of it\'s digit is equal to N="+n);
        break;
      }
      sum = 0;
    }
    sc.close();
  }
}