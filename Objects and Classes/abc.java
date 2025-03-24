class Emp_Sal{
  private String name="";
  private int sal=0;
  public void accept(String name, int sal){
    this.name = name;
    this.sal = sal;
  }
  public void display(){
    System.out.println("\nName: "+name);
    System.out.println("Salary: Rs."+sal);
  }
}

public class abc {
  public static void main(String[] args) {
    Emp_Sal e1 = new Emp_Sal();
    e1.accept("Tinu Kumar", 25000);
    e1.display();
    //System.out.println("e1.name="+e1.name);
    //System.out.println("e1.sal="+e1.sal);
  }
}