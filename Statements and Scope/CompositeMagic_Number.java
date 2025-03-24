import java.util.Scanner;
import java.lang.Integer;
import java.lang.String;

public class CompositeMagic_Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter lower limit greater than 3: ");
    int l = sc.nextInt();
    System.out.println("Enter upper limit: ");
    int u = sc.nextInt();
    if((l > u) || (l < 4)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    int flag=0, dup=0, r=0, sum=0, freq=0;
    String st="";
    System.out.println("\nComposite Magic numbers inclusive between "+l+" and "+u+" are: ");
    for(int i=l;i<=u;i++){
      flag = 0;
      for(int j=2;j<=i/2;j++){
        if(i%j == 0){
          flag = 1;
          break;
        }
      }
      if(flag == 1){
        dup = i;
        while(dup != 1){
          st = Integer.toString(dup);
          if((st.length() == 1) && (dup != 1)){
            break;
          }
          sum = 0;
          while(dup > 0){
            r = dup%10;
            sum = sum+r;
            dup = dup/10;
          }
          dup = sum;
        }
        if(dup == 1){
          freq = freq+1;
          System.out.print(i+" ");
        }
      }
    }
    System.out.println("\nFrequency: "+freq);
    sc.close();
  }
}