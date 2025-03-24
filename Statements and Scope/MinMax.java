import java.util.Scanner;
import java.lang.Math;

public class MinMax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter first number: ");
    int n = sc.nextInt();
    System.out.println("Enter second number: ");
    int m = sc.nextInt();
    int  min = Math.min(n, m);
    int  max = Math.max(n, m);
    System.out.println("\nFirst number: "+n);
    System.out.println("Second number: "+m);
    System.out.println("Minimum number: "+min);
    System.out.println("Maximum number: "+max);
    sc.close();
  }
}