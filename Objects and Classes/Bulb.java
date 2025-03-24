import java.util.Scanner;

public class Bulb{

  //instance variables
  private String c, t;
  private int v, w;

  private Bulb(){
    this.c = "";
    this.t = "";
    this.v = 0;
    this.w = 0;
  }

  private void accept(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter Company\'s Name: ");
    c = sc.next();
    System.out.println("Enter Type of Bulb: ");
    t = sc.next();
    System.out.println("Enter Voltage: ");
    v = sc.nextInt();
    System.out.println("Enter Watt: ");
    w = sc.nextInt(); 
    //sc.close();
  }

  private void display(){
    System.out.println("\nCompany\'s Name: " + c);
    System.out.println("Type of Bulb: " + t);
    System.out.println("Voltage: " + v+" Volts");
    System.out.println("Watt: " + w+" Watts");
  }

  public static void main(String[] args) {
    Bulb CFL = new Bulb();
    CFL.accept();
    CFL.display();
    Bulb LED = new Bulb();
    LED.accept();
    LED.display();
    System.out.println(CFL instanceof Bulb);
    System.out.println(LED instanceof Bulb);
    //System.out.println(Incadescent instanceof Bulb);
  }
}