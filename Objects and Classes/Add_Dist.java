import java.util.Scanner;

public class Add_Dist {

  public int km, m, cm, add;

  public Add_Dist(){
    this.km = 0;
    this.m = 0;
    this.cm = 0;
    this.add = 0;
  }

  public void accept(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter distance in km: ");
    km = sc.nextInt();
    System.out.println("Enter distance in m: ");
    m = sc.nextInt();
    System.out.println("Enter distance in cm: ");
    cm = sc.nextInt();
  }

  public void display(){
    add = km*100000 + m*100 + cm;
    System.out.println("\nDistance in cm: "+add+" cm");
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Add_Dist d1 = new Add_Dist();
    d1.accept();
    d1.display();
    sc.close();
  }
}