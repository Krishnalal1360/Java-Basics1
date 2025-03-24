import java.util.Scanner;
public class Prime_Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a number greater than 1: ");
    int n = sc.nextInt();
    if(n <= 1){
      System.out.println("\nInvalid Input");
    }else{
      int f=0;
      for(int i=2;i<=n/2;i++){
        if(n%i == 0){
          f = 1;
          break;
        }
      }
      if(f == 1){
        System.out.println("\n"+n+" is not a Prime number!");
      }else{
        System.out.println("\n"+n+" is a Prime number!");
        int dup=n;
        int r=0, rev=0;
        while(dup > 0){
          r = dup%10;
          rev = rev*10+r;
          dup = dup/10;
        }
        if(rev != n){
          System.out.println("\n"+n+" is not a Palindrome number!");
        }else{
          System.out.println("\n"+n+" is a Palindrome number!");
          System.out.println("\n"+n+" is a Prime Palindrome number!");
        }
      }
    }
    sc.close();
  }
}