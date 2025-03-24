import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;
import java.lang.StringBuffer;

public class DigitSort_MagicNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter 1 for Digits Sort");
    System.out.println("Enter 2 for Magic Number");
    System.out.println("Enter your choice: ");
    int ch = sc.nextInt();
    switch(ch){

      case 1:
      System.out.println("\nEnter 3-digit or greater number: ");
      int n = sc.nextInt();
      String st = Integer.toString(n);
      int l = st.length();
      if(l < 3){
        System.out.println("\nInvalid Input!");
      }else{
        StringBuffer sb = new StringBuffer(st);
        l = sb.length();
        char temp='\u0000';
        for(int i=0;i<l-1;i++){
          temp = sb.charAt(i);
          for(int j=i+1;j<l;j++){
            if(sb.charAt(j) <= sb.charAt(i)){
              sb.setCharAt(i, sb.charAt(j));
              sb.setCharAt(j, temp);
              temp = sb.charAt(i);
            }
          }
        }
        st = sb.toString();
        System.out.println("\nNumber: "+n);
        System.out.println("\nSorted digits: ");
        for(int i=0;i<st.length();i++){
          if(i == st.length()-1){
            System.out.print(st.charAt(i));
          }else{
            System.out.print(st.charAt(i)+", ");
          }
        }
      }
      break;

      case 2:
      System.out.println("\nEnter a positive number: ");
      n = sc.nextInt();
      if(n < 0){
        System.out.println("\nInvalid Input!");
      }else{
        int sum=n, dup=0, r=0;
        st="";
        while(sum != 1){
          dup=sum;
          sum=0;
          while(dup > 0){
            r = dup%10;
            sum = sum+r;
            dup = dup/10;
          }
          st = Integer.toString(sum);
          if((sum != 1) && (st.length() == 1)){
            break;
          }
        }
        if(sum == 1){
          System.out.println("\nNumber "+n+" is a Magic number!");
        }else{
          System.out.println("\nNumber "+n+" is not a Magic number!");
        }
      }
      break;

      default:
      System.out.println("\nInvalid choice!");

    }
    sc.close();
  }
}