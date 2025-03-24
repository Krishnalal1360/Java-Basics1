import java.util.Scanner;
public class HarshadOrNiven_Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter lower limit: ");
    int l = sc.nextInt();
    System.out.println("Enter upper limit: ");
    int u = sc.nextInt();
    int dup=0, r=0, sum=0;
    System.out.println("\nHarshad/Niven Numbers: ");
    for(int i=l;i<=u;i++){
      dup = i;
      while(dup > 0){
        r = dup%10;
        sum = sum+r;
        dup = dup/10;
      }
      if(i%sum == 0){
        if(i == u){
          System.out.print(i);
        }else{
          System.out.print(i+", ");
        }
      }
      sum = 0;
    }
    sc.close();
  }
}