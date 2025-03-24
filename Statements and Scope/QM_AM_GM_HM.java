import java.util.Scanner;
import java.lang.Math;

public class QM_AM_GM_HM {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter 1 for QM(Quadratic Mean)");
    System.out.println("Enter 2 for AM(Arithmetic Mean)");
    System.out.println("Enter 3 for GM(Geometric Mean)");
    System.out.println("Enter 4 for HM(Harmonic Mean)");
    System.out.println("Enter your choice: ");
    int ch = sc.nextInt();
    System.out.println("\nEnter number of terms: ");
    int n = sc.nextInt();
    int ar[] = new int[n];
    System.out.println("\nEnter the terms: ");
    for(int i=0;i<ar.length;i++){
      ar[i] = sc.nextInt();
    }
    System.out.println("\nTerms: ");
    for(int i=0;i<ar.length;i++){
      System.out.print(ar[i]+" ");
    }
    switch(ch){
      case 1:
      int sum=0;
      float qm=0.0f;
      for(int i=0;i<n;i++){
        sum = sum+(int)(Math.pow(ar[i], 2));
      }
      System.out.println("\nSum="+sum);
      qm = (float)(Math.sqrt(sum*1.0f/n));
      System.out.println("\nQM="+qm);
      break;

      case 2:
      sum=0;
      float am=0.0f;
      for(int i=0;i<n;i++){
        sum = sum+ar[i];
      }
      System.out.println("\nSum="+sum);
      am = sum*1.0f/n;
      System.out.println("\nAM="+am);
      break;

      case 3:
      float prod=1.0f, gm=0.0f;
      for(int i=0;i<n;i++){
        prod = prod*ar[i];
      }
      gm = (float)(Math.pow(prod, 1.0f/n));
      System.out.println("\nGM="+gm);
      break;

      case 4:
      sum=0;
      prod=1;
      float hm=0.0f;
      for(int i=0;i<n;i++){
        prod = prod*ar[i];
        sum = sum+ar[i];
      }
      prod = 2*prod;
      System.out.println("\nProd="+prod);
      System.out.println("Sum="+sum);
      hm = (prod*1.0f/sum);
      System.out.println("\nHM="+hm);
      break;

      default:
      System.out.println("\nInvalid choice!");
    }
    sc.close();
  }
}