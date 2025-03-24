import java.util.Scanner;
import java.lang.String;

public class Unique_Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter lower limit: ");
    int l = sc.nextInt();
    System.out.println("Enter upper limit: ");
    int u = sc.nextInt();
    if(l > u){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    int flag=0, freq=0;
    String st="";
    System.out.println("\nUnique Numbers between "+l+" and "+u+" are: ");
    for(int i=l;i<=u;i++){
      st = Integer.toString(i);
      flag=0;
      for(int j=0;j<st.length()-1;j++){
        for(int k=j+1;k<st.length();k++){
          if(st.charAt(j) == st.charAt(k)){
            flag = 1;
            break;
          }
        }
      }
      if(flag == 0){
        freq = freq+1;
        System.out.print(i+" ");
      }
    }
    System.out.println("\nFrequency of Unique Numbers is: "+freq);
    sc.close();
  }
}