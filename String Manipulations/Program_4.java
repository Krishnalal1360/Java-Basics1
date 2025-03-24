import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class Program_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The characters must be either in Uppercase or Lowercase.");
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
      System.out.println("Reason: The characters must be either in Uppercase or Lowercase.");
      System.exit(0);
    }

    c = st.charAt(0);
    int freq=0;
    System.out.println("\nFrequency of Characters: ");
    if(Character.isUpperCase(c) == true){
      for(char i='A';i<='Z';i++){
        freq = 0;
        for(int j=0;j<st.length();j++){
          if(i == st.charAt(j)){
            freq = freq+1;
          }
        }
        if(freq > 0){
          System.out.println("Frequency of "+i+" is "+freq);
        }
      }
    }else{
      for(char i='a';i<='z';i++){
        freq = 0;
        for(int j=0;j<st.length();j++){
          if(i == st.charAt(j)){
            freq = freq+1;
          }
        }
        if(freq > 0){
          System.out.println("Frequency of "+i+" is "+freq);
        }
      }
    }
    sc.close();
  }
}