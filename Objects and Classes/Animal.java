abstract class Animal {
  protected String nm="Parent Animal";
  abstract protected void Baby();
  abstract protected void Eat();
  static protected void Run(){
    System.out.println("I can run!");
  }
  public static void main(String[] args) {
    //Animal ob1 = new Animal();
    Run();
  }
}