import java.util.Scanner;
public class characterNumericValue {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a character: ");
    char c = sc.next().charAt(0);
    System.out.println("\nCharacter: "+c);
    System.out.println("\nNumeric value: "+Character.getNumericValue(c));
    sc.close();
  }
}