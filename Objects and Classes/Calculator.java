import java.util.Scanner;
public class Calculator {

  public int a, b, c;

  public void accept(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter first number: ");
    a = sc.nextInt();
    System.out.println("Enter second number: ");
    b = sc.nextInt();
  }

  public void Max(){
    if(a > b){
      System.out.println("\nMaximum number is: "+a);
    }else{
      System.out.println("\nMaximum number is: "+b);
    }
  }

  public void Min(){
    if(a < b){
      System.out.println("\nMinimum number is: "+a);
    }else{
      System.out.println("\nMinimum number is: "+b);
    }
  }

  public void Sum(){
    c = a + b;
    System.out.println("\nSum of "+a+" and "+b+" is: "+c);
  }

  public void Sub(){
    c = a - b;
    System.out.println("\nSubtraction of "+a+" and "+b+" is: "+c);
  }

  public void Mul(){
    c = a * b;
    System.out.println("\nMultiplication of "+a+" and "+b+" is: "+c);
  }

  public void Div(){
    c = a / b;
    System.out.println("\nDivision of "+a+" and "+b+" is: "+c);
  }

  public void Mod(){
    c = a % b;
    System.out.println("\nModulus of "+a+" and "+b+" is: "+c);
  }

  public static void main(String[] args) {
    Calculator ob1 = new Calculator();
    ob1.accept();
    ob1.Max();
    ob1.Min();
    ob1.Sum();
    ob1.Sub();
    ob1.Mul();
    ob1.Div();
    ob1.Mod();
  }
}