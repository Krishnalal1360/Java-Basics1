import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;
import java.lang.Integer;

public class Evil_Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter lower limit greater than 0: ");
    int l = sc.nextInt();
    System.out.println("Enter upper limit: ");
    int u = sc.nextInt();
    if((l < 1) || (l > u)) {
      System.out.println("\nInvalid input!");
      System.exit(0);
    }
    int dup=0, r=0, count=0, freq=0;
    char c='\u0000';
    String st="";
    StringBuffer sb;
    System.out.println("\nEvil numbers between "+l+" and "+u+" are: ");
    for(int i=l;i<=u;i++){
      dup = i;
      while(dup > 0){
        r = dup%2;
        st = st.concat(Integer.toString(r));
        dup = dup/2;
      }
      sb = new StringBuffer(st);
      st = sb.reverse().toString();
      for(int j=0;j<st.length();j++){
        c = st.charAt(j);
        if(c == '1'){
          count = count+1;
        }
      }
      if(count%2 == 0){
        freq = freq+1;
        System.out.print(i+" ");
      }
      st = "";
      count = 0;
    }
    System.out.println("\n\nFrequency of evil numbers is: "+freq);
    sc.close();
  }
}