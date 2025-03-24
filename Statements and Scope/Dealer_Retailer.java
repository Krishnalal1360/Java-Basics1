import java.util.Scanner;

public class Dealer_Retailer{

  static public void dealerDiscount(int d, int p){
    float dc=0.0f, amt=0.0f;
    if(d <= 30){
      dc = 0.15f*p;
    }else if((d > 30) && (d <= 45)){
      dc = 0.12f*p;
    }else if((d > 45) && (d <= 60)){
      dc = 0.10f*p;
    }else{
      dc = 0.0f*p;
    }
    amt = p-dc;
    System.out.println("\nDealer");
    System.out.println("Days of payment: "+d);
    System.out.println("Payment: Rs."+p);
    System.out.println("Discount: Rs."+dc);
    System.out.println("Amount: Rs."+amt);
  }

  static public void retailerDiscount(int d, int p){
    float dc=0.0f, amt=0.0f;
    if(d <= 30){
      dc = 0.10f*p;
    }else if((d > 30) && (d <= 45)){
      dc = 0.08f*p;
    }else if((d > 45) && (d <= 60)){
      dc = 0.05f*p;
    }else{
      dc = 0.0f*p;
    }
    amt = p-dc;
    System.out.println("\nRetailer");
    System.out.println("Days of payment: "+d);
    System.out.println("Payment: Rs."+p);
    System.out.println("Discount: Rs."+dc);
    System.out.println("Amount: Rs."+amt);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter days of payment from Dealer to Company: ");
    int d1 = sc.nextInt();
    System.out.println("Enter payment: ");
    int p1 = sc.nextInt();
    System.out.println("\nEnter days of payment from Retailer to Company: ");
    int d2 = sc.nextInt();
    System.out.println("Enter payment: ");
    int p2 = sc.nextInt();
    dealerDiscount(d1, p1);
    retailerDiscount(d2, p2);
    sc.close();
  }
}