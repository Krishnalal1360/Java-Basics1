public class Cow extends Animal {

  public void Baby(){
    System.out.println("I am Cow!");
  }

  public void Eat(){
    System.out.println("I eat grass!");
  }

  public static void main(String[] args) {
    //Animal ob1 = new Cow();
    Cow ob1 = new Cow();
    System.out.println("ob1.nm="+ob1.nm);
    ob1.Baby();
    ob1.Eat();
    Run();
  }
}