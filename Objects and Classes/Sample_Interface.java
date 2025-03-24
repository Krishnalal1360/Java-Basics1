interface Sample_Interface {
  abstract public void display1();
  abstract public void display2();
  static public void display3() {
    System.out.println("This is display3 method");
  }
  public static void main(String[] args) {
    //Sample_Interface ob1 = new Sample_Interface();
    display3();
  }
}