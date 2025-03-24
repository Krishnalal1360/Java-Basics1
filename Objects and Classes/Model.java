public class Model implements Sample_Interface{

  public void display1() {
    System.out.println("This is display1 method");
  }
  public void display2() {
    System.out.println("This is display2 method");
  }
  public static void main(String[] args) {
    Sample_Interface ob1 = new Model();
    //Model ob1 = new Model();
    ob1.display1();
    ob1.display2();
    Sample_Interface.display3();
  }
}