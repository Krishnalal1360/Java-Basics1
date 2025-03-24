import java.util.Scanner;

public class Character_Iteration {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter first character: ");
    char c1 = sc.next().charAt(0);
    System.out.println("\nEnter last character: ");
    char c2 = sc.next().charAt(0);
    System.out.println("\nCharacters inclusive between "+c1+" and "+c2+" are: ");
    for(char i=c1;i<=c2;i++){
      System.out.println(i);
    }
    System.out.println("\nCharacters inclusive between "+c1+" and "+c2+" are: ");
    for(int i=c1;i<=c2;i++){
      System.out.println(i);
    }

    System.out.println("\nEnter first character ascii code: ");
    int a1 = sc.nextInt();
    System.out.println("\nEnter last character ascii code: ");
    int a2 = sc.nextInt();
    System.out.println("\nCharacters inclusive between "+a1+" and "+a2+" are: ");
    for(int i=a1;i<=a2;i++){
      System.out.println((char)i);
    }
    sc.close();
  }
}