import java.util.Scanner;

public class Cuboid {

  public int l, b, h;

  public Cuboid(){
    this.l = 0;
    this.b = 0;
    this.h = 0;
  }

  public void accept(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter length: ");
    l = sc.nextInt();
    System.out.println("Enter breadth: ");
    b = sc.nextInt();
    System.out.println("Enter height: ");
    h = sc.nextInt();
  }

  public void display(){
    int volume = l*b*h;
    System.out.println("\nVolume of Cuboid: "+volume+" cubic units");
  }

  public static void main(String[] args) {
    Cuboid c1 = new Cuboid();
    c1.accept();
    c1.display();
    Cuboid c2 = new Cuboid();
    c2.accept();
    c2.display();
  }
}