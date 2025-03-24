import java.util.Scanner;
import java.lang.StringBuffer;
import java.lang.String;
import java.lang.Integer;

public class BinaryDecimal_DecimalBinary {

  static public void binaryDecimal(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a binary number: ");
    int b = sc.nextInt();
    String st = Integer.toString(b);
    StringBuffer sb = new StringBuffer(st);
    st = sb.reverse().toString();
    int num=0, d=0;
    char c='\u0000';
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      num = Integer.parseInt(Character.toString(c));
      d = d+(num*(int)(Math.pow(2, i)));
    }
    System.out.println("\nBinary number: "+b);
    System.out.println("Decimal number: "+d);
    //sc.close();
  }

  static public void decimalBinary(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a decimal number: ");
    int d = sc.nextInt();
    if(d == 0){
      System.out.println("\nDecimal number: "+d);
      System.out.println("Binary number: 000");
    }else{
      int dup=d;
      int r=0;
      String st="";
      while(dup > 0){
        r = dup%2;
        st = st.concat(Integer.toString(r));
        dup = dup/2;
      }
      StringBuffer sb = new StringBuffer(st);
      st = sb.reverse().toString();
      int b = Integer.parseInt(st);
      System.out.println("\nDecimal number: "+d);
      System.out.println("Binary number: "+b);
    }
    //sc.close();
  }

  public static void main(String[] args) {
    binaryDecimal();
    decimalBinary();
  }
}