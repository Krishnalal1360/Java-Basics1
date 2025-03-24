import java.util.Scanner;
import java.lang.String;

public class String_nullCharacter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a string: ");
    String st = sc.next();
    System.out.println("\nString: \n"+st);
    System.out.println("Length: "+st.length());
    st = st.replace('.', ' ');
    System.out.println("\nAfter replacing full stop with whitespace: \n"+st);
    System.out.println("Length: "+st.length());
    st = st.replace(' ', '\u0000');
    System.out.println("\nAfter replacing whitespace with null character: \n"+st);
    System.out.println("Length: "+st.length());
    st = st.replace(Character.toString('\u0000'), "");
    System.out.println("\nAfter removing null character: \n"+st);
    System.out.println("Length: "+st.length());
    sc.close();
  }
}