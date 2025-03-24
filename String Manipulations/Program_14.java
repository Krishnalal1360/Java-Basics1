import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
import java.util.StringTokenizer;
import java.lang.Integer;

public class Program_14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of sentences inclusive between 1 and 3.");
    System.out.println("The sentences must be in Uppercase.");
    System.out.println("The sentences must end with either full stop or question mark.");
    System.out.println("The sentences must contain only single whitespace between words.");
    System.out.println("\nEnter number of sentences: ");
    int n = sc.nextInt();
    if((n < 1) || (n > 3)){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The number of sentences must be inclusively between 1 and 3.");
      System.exit(0);
    }

    String ar[] = new String[n];
    System.out.println("\nEnter sentences: ");
    sc.nextLine();
    for(int i=0;i<ar.length;i++){
      ar[i] = sc.nextLine();
    }

    char c='\u0000';
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length();j++){
        c = ar[i].charAt(j);
        if(Character.isLetter(c) == true){
          if(Character.isUpperCase(c) == false){
            System.out.println("\nInvalid Input!");
            System.out.println("Reason: The sentence must be in Uppercase.");
            System.exit(0);
          }
        }
      }
      c = ar[i].charAt(ar[i].length()-1);
      if((c != '.') && (c != '?')){
        System.out.println("\nInvalid Input!");
        System.out.println("Reason: The sentence must end with either full stop or question mark.");
        System.exit(0);
      }
    }

    int ct=0, ws=0, cws=0, tt=0;
    c='\u0000';
    for(int i=0;i<ar.length;i++){
      StringTokenizer stt = new StringTokenizer(ar[i], " ");
      ct = stt.countTokens();
      tt = tt+ct;
      ws = ct-1;
      for(int j=0;j<ar[i].length();j++){
        c = ar[i].charAt(j);
        if(Character.isWhitespace(c) == true){
          cws = cws+1;
        }
      }
      if(cws != ws){
        System.out.println("\nInvalid Input!");
        System.out.println("Reason: The sentence must contain only single whitespace between words.");
        System.exit(0);
      }
      cws = 0;
    }

    System.out.println("\nOriginal Sentences:");
    for(int i=0;i<ar.length;i++){
      System.out.println(ar[i]);
    }

    System.out.println("\nTotal number of words: "+tt);

    int index=0;
    String st="";
    c='\u0000';
    String ar1[] = new String[tt];
    for(int i=0;i<ar.length;i++){
      StringTokenizer stt = new StringTokenizer(ar[i], " ");
      while(stt.hasMoreTokens()){
        st = stt.nextToken();
        c = st.charAt(st.length()-1);
        if(Character.isLetterOrDigit(c) == false){
          st = st.replace(Character.toString(c), "");
        }
        ar1[index] = st;
        index = index+1;
      }
    }
    /*System.out.println("\nArray 1D: ");
    for(int i=0;i<ar1.length;i++){
      System.out.println(ar1[i]);
    }*/

    int freq=0, flag=0, flag1=0;
    String ar2[][] = new String[tt][2];
    index=0;
    for(int i=0;i<ar1.length-1;i++){
      for(int j=i+1;j<ar1.length;j++){
        if((ar1[i].equals(ar1[j])) && (ar1[i].equals("0") == false)){
          flag = 1;
          freq = freq+1;
        }
      }
      for(int k=i+1;k<ar1.length;k++){
        if(ar1[i].equals(ar1[k])){
          ar1[k] = "0";
        }
        if(k == ar1.length-1){
          if(ar1[i].equals(ar1[k])){
            flag1 = 1;
          }
        }
      }
      if((flag == 0) && (ar1[i].equals("0") == false)){
        ar2[index][0] = ar1[i];
        ar2[index][1] = String.valueOf(1);
      }
      if(flag == 1){
        ar2[index][0] = ar1[i];
        ar2[index][1] = Integer.toString(freq+1);
      }
      if((flag == 0) && (ar1[i].equals("0") == true)){
        ar2[index][0] = "0";
        ar2[index][1] = "0";
      }
      index = index+1;
      flag = 0;
      freq = 0;
    }
    if(flag1 == 1){
      ar2[tt-1][0] = "0";
      ar2[tt-1][1] = "0";
    }else if(flag1 == 0){
      ar2[tt-1][0] = ar1[tt-1];
      ar2[tt-1][1] = String.valueOf(1);
    }
    /*System.out.println("\nArray 2D: ");
    for(int i=0;i<ar2.length;i++){
      for(int j=0;j<ar2[i].length;j++){
        System.out.print(ar2[i][j]+" ");
      }
      System.out.println();
    }*/

    System.out.println("\nWord - Frequency: ");
    for(int i=0;i<ar2.length;i++){
      if(ar2[i][0].equals("0")){
        continue;
      }
      System.out.println(ar2[i][0]+" - "+ar2[i][1]);
    }
    sc.close();
  }
}