import java.util.Scanner;

public class Triangular_Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter number of terms: ");
    int n = sc.nextInt();
    int ts=0;
    System.out.println("\nTriangular Series: ");
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i+1;j++){
        ts = ts+j;
      }
      System.out.print(ts+" ");
      ts = 0;
    }
    sc.close();
  }
}