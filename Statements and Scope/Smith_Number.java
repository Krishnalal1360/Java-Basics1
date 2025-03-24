import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;
import java.lang.Character;

public class Smith_Number {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a number: ");
    int n = sc.nextInt();
    int flag=0, dup=0;
    String st="";

    for(int i=2;i<=n/2;i++){
      if(n%i == 0){
        flag = 0;
        for(int j=2;j<=i/2;j++){
          if(i%j == 0){
            flag = 1;
            break;
          }
        }
        if(flag == 0){
          dup = n;
          while(dup > 0){
            if(dup == 1){
              break;
            }
            if(dup%i != 0){
              break;
            }
            dup = dup/i;
            st = st.concat(Integer.toString(i));
            st = st.concat(" ");
          }
        }
      }
    }
    //System.out.println("\nst="+st);

    dup=n;
    int r=0, sum=0;
    while(dup > 0){
      r = dup%10;
      sum = sum+r;
      dup = dup/10;
    }
    //System.out.println("\nsum="+sum);

    int sum1=0, d=0;
    char c='\u0000';
    String st1="";
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isWhitespace(c) == true){
        if(st1.length() == 1){
          sum1 = sum1+Integer.parseInt(st1);
        }else{
          for(int j=0;j<st1.length();j++){
            d = Integer.parseInt(Character.toString(st1.charAt(j)));
            sum1 = sum1+d;
          }
        }
        st1 = "";
      }else{
        st1 = st1.concat(Character.toString(c));
      }
    }
    //System.out.println("\nsum1="+sum1);

    if(sum == sum1){
      System.out.println("\n"+n+" is a Smith Number!");
    }else{
      System.out.println("\n"+n+" is not a Smith Number!");
    }
    sc.close();
  }
}