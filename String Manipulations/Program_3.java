import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
import java.lang.StringBuffer;

public class Program_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The strings must be in either Uppercase or Lowercase.");
    System.out.println("Enter strings: ");
    String st = sc.nextLine();
    char c='\u0000';
    int cuc=0, clc=0, flag=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isUpperCase(c) == true){
        cuc = cuc+1;
      }else if(Character.isLowerCase(c) == true){
        clc = clc+1;
      }
    }
    if(cuc > 0){
      if(clc != 0){
        flag = 1;
      }
    }else if(clc > 0){
      if(cuc != 0){
        flag = 1;
      }
    }
    if(flag == 1){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The strings must be in either UpperCase or LowerCase.");
      System.exit(0);
    }

    System.out.println("\nOriginal String: \n"+st);
    char temp='\u0000';
    StringBuffer sb = new StringBuffer(st);
    for(int i=0;i<sb.length()-1;i++){
      temp = sb.charAt(i);
      for(int j=i+1;j<sb.length();j++){
        if(sb.charAt(j) < sb.charAt(i)){
          sb.setCharAt(i, sb.charAt(j));
          sb.setCharAt(j, temp);
          temp = sb.charAt(i);
        }
      }
    }
    st = sb.toString();
    System.out.println("\nSorted String: \n"+st);

    c = st.charAt(0);
    char f='\u0000', l='\u0000';
    f = st.charAt(0);
    l = st.charAt(st.length()-1);
    String st1="";
    if(Character.isUpperCase(c) == true){
      for(char i=f;i<=l;i++){
        st1 = st1.concat(String.valueOf(i));
      }
    }else if(Character.isLowerCase(c) == true){
      /*for(char i=f;i<=l;i++){
        if(st.contains(Character.toString(i)) == true){
          st1 = st1.concat(Character.toString(i));
        }else{
          st1 = st1.concat(Character.toString(i));
        }
      }*/
      for(char i=f;i<=l;i++){
        st1 = st1.concat(String.valueOf(i));
      }
    }

    if(Character.isUpperCase(c) == true){
      System.out.println("\nAll Uppercase characters inserted between "+f+" and "+l+": \n"+st1);
    }else{
      System.out.println("\nAll Lowercase characters inserted between "+f+" and "+l+": \n"+st1);
    }
    sc.close();
  }
}