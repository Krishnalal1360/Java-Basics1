import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
import java.util.StringTokenizer;
import java.lang.Integer;

public class Program_12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The sentence must be in Uppercase.");
    System.out.println("The sentence must end with a full stop.");
    System.out.println("The sentence can contain atmost 80 strings.");
    System.out.println("\nEnter sentence: ");
    String st = sc.nextLine();
    char c='\u0000';
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isLetter(c) == true){
        if(Character.isUpperCase(c) == false){
          System.out.println("\nInvalid Input!");
          System.out.println("Reason: The sentence must be in Uppercase.");
          System.exit(0);
        }
      }
    }
    c = st.charAt(st.length()-1);
    if(c != '.'){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The sentence must end with a full stop.");
      System.exit(0);
    }
    StringTokenizer stt = new StringTokenizer(st, " ");
    int ct = stt.countTokens();
    if(ct > 80){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The sentence can contain atmost 80 strings.");
      System.exit(0);
    }else{
      System.out.println("\nOriginal Sentence: \n"+st);
    }

    st = st.replace(".", "");
    stt = new StringTokenizer(st, " ");
    ct = stt.countTokens();
    String ar[] = new String[ct];
    int index=0;
    while(stt.hasMoreTokens()){
      ar[index] = stt.nextToken();
      index = index+1;
    }
    /*System.out.println("\nArray 1D: ");
    for(int i=0;i<ar.length;i++){
      System.out.println(ar[i]);
    }*/

    int freq=0, flag=0, flag1=0;
    String ar1[][] = new String[ct][2];
    index = 0;
    for(int i=0;i<ar.length-1;i++){
      for(int j=i+1;j<ar.length;j++){
        if((ar[i].equals(ar[j])) && (ar[i].equals("0") == false)){
          flag = 1;
          freq = freq+1;
        }
      }
      for(int k=i+1;k<ar.length;k++){
        if(ar[i].equals(ar[k])){
          ar[k] = "0";
        }
        if(k == ar.length-1){
          if(ar[i].equals(ar[k])){
            flag1 = 1;
          }
        }
      }
      if((flag == 0) && (ar[i].equals("0") == false)){
        ar1[index][0] = ar[i];
        ar1[index][1] = String.valueOf(1);
      }
      if(flag == 1){
        ar1[index][0] = ar[i];
        ar1[index][1] = Integer.toString(freq+1);
      }
      if((flag == 0) && (ar[i].equals("0") == true)){
        ar1[index][0] = "0";
        ar1[index][1] = "0";
      }
      index = index+1;
      flag = 0;
      freq = 0;
    }
    if(flag1 == 1){
      ar1[ct-1][0] = "0";
      ar1[ct-1][1] = "0";
    }else if(flag1 == 0){
      ar1[ct-1][0] = ar[ct-1];
      ar1[ct-1][1] = String.valueOf(1);
    }
    /*System.out.println("\nArray 2D: ");
    for(int i=0;i<ar1.length;i++){
      for(int j=0;j<ar1[i].length;j++){
        System.out.print(ar1[i][j]+" ");
      }
      System.out.println();
    }*/

    String temp="", temp1="";
    for(int i=0;i<ar1.length-1;i++){
      temp = ar1[i][0];
      temp1 = ar1[i][1];
      for(int j=i+1;j<ar1.length;j++){
        if(ar1[j][0].equals("0")){
          continue;
        }
        if(ar1[j][0].length() < ar1[i][0].length()){
          ar1[i][0] = ar1[j][0];
          ar1[j][0] = temp;
          temp = ar1[i][0];
          ar1[i][1] = ar1[j][1];
          ar1[j][1] = temp1;
          temp1 = ar1[i][1];
        }else if(ar1[j][0].length() == ar1[i][0].length()){
          if(ar1[j][0].compareTo(ar1[i][0]) < 0){
            ar1[i][0] = ar1[j][0];
            ar1[j][0] = temp;
            temp = ar1[i][0];
            ar1[i][1] = ar1[j][1];
            ar1[j][1] = temp1;
            temp1 = ar1[i][1];
          }
        }
      }
    }
    /*System.out.println("\nArray 2D: ");
    for(int i=0;i<ar1.length;i++){
      for(int j=0;j<ar1[i].length;j++){
        System.out.print(ar1[i][j]+" ");
      }
      System.out.println();
    }*/

    System.out.println("\nWord - Frequency: ");
    for(int i=0;i<ar1.length;i++){
      if(ar1[i][0].equals("0")){
        continue;
      }
      System.out.println(ar1[i][0]+" - "+ar1[i][1]);
    }
    sc.close();
  }
}