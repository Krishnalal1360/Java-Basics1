public class String_input {
  public static void main(String[] args) {
    String st="\n";
    System.out.println(st);
    System.out.println("st.length()="+st.length());
    char ar[] = st.toCharArray();
    for(char i: ar){
      System.out.println(i);
    }
    System.out.println("ar.length="+ar.length);
  }
}