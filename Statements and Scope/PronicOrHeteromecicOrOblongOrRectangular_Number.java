import java.util.Scanner;

public class PronicOrHeteromecicOrOblongOrRectangular_Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter lower limit: ");
    int l = sc.nextInt();
    System.out.println("Enter upper limit: ");
    int u = sc.nextInt();
    if(l > u){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    int freq=0;
    System.out.println("\nPronic Numbers inclusive between "+l+" and "+u+" are: ");
    for(int i=l;i<=u;i++){
      freq = freq+1;
      System.out.print((i*(i+1))+" ");
    }
    System.out.println("\n\nFrequency: "+freq);
    sc.close();
  }
}