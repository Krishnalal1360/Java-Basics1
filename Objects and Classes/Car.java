import java.util.Scanner;
public class Car {

  //instance variable
  private String n="";
  //class variable
  static private int t=4;

  private void accept(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter Name of Car: ");
    n = sc.next();
  }

  private void display(){
    int hp;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter horse power(hp) of engine: ");
    hp = sc.nextInt();
    System.out.println("\nCar\'s Name: "+n);
    System.out.println("No. of Tyres: "+t);
    System.out.println("Horse Power: "+hp+" hp");
  }

  public static void main(String[] args) {
    Car c1 = new Car();
    c1.accept();
    c1.display();
    Car c2 = new Car();
    c2.accept();
    c2.display();
  }
}