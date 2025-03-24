import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;

public class Natural_Sum{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a natural number: ");
    int n = sc.nextInt();
    if(n < 1){
      System.out.println("\nInvalid input");
    }else{
      int sum=0;
      String st="";
      for(int i=1;i<n;i++){
        if(sum < n){
          sum = sum+i;
          st = st.concat(Integer.toString(i));
        }
        if(sum == n){
          System.out.println("\nNatural numbers: ");
          for(int j=0;j<st.length();j++){
            if(j == st.length()-1){
              System.out.print(st.charAt(j));
            }else{
              System.out.print(st.charAt(j)+", ");
            }
          } 
          System.out.println("\nSum of natural numbers: "+sum);
          break;
        }
      }
    }
    sc.close();
  }
}