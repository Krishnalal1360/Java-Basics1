import java.util.Scanner;

public class Permutation_Combination {

  static public int fact(int n){
    int f=1;
    for(int i=2;i<=n;i++){
      f = f*i;
    }
    return f;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter total number of terms: ");
    int n = sc.nextInt();
    System.out.println("Enter number of selected items: ");
    int r = sc.nextInt();
    double p=0.0d, c=0.0d;
    p = ((fact(n)*1.0)/(fact(n-r)*1.0));
    c = ((fact(n)*1.0)/(fact(n-r)*fact(r)*1.0));
    System.out.println("\nPermutation of "+r+" out of "+n+" is "+p);
    System.out.println("Combination of "+r+" out of "+n+" is "+c);
    sc.close();
  }
}