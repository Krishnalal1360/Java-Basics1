import java.util.Scanner;
import java.lang.StringBuffer;

public class Anagram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter first string: ");
    String st1 = sc.next();
    st1 = st1.toUpperCase();
    System.out.println("\nEnter second string: ");
    String st2 = sc.next();
    st2 = st2.toUpperCase();
    System.out.println("\nFirst String: "+st1);
    System.out.println("Second String: "+st2);
    String st3="", st4="";
    st3 = st1;
    st4 = st2;

    StringBuffer sb1 = new StringBuffer(st1);
    char temp='\u0000';
    for(int i=0;i<sb1.length()-1;i++){
      temp = sb1.charAt(i);
      for(int j=i+1;j<sb1.length();j++){
        if(sb1.charAt(j) <= sb1.charAt(i)){
          sb1.setCharAt(i, sb1.charAt(j));
          sb1.setCharAt(j, temp);
          temp = sb1.charAt(i);
        }
      }
    }
    st1 = sb1.toString();

    sb1 = new StringBuffer(st2);
    for(int i=0;i<sb1.length()-1;i++){
      temp = sb1.charAt(i);
      for(int j=i+1;j<sb1.length();j++){
        if(sb1.charAt(j) <= sb1.charAt(i)){
          sb1.setCharAt(i, sb1.charAt(j));
          sb1.setCharAt(j, temp);
          temp = sb1.charAt(i);
        }
      }
    }
    st2 = sb1.toString();

    if(st1.equals(st2)){
      System.out.println("\n"+st3+" and "+st4+" are Anagram!");
    }else{
      System.out.println("\n"+st3+" and "+st4+" are not Anagram!");
    }
    sc.close();
  }
}