package Activity2;
import java.util.Scanner;

public class candymachine {

  static Scanner scan = new Scanner(System.in);
  
  public static double displayMenu(){

    double price = 0;
    System.out.println("Here's what I have:");
    System.out.println("A.   3.00    Mentos");
    System.out.println("B.   10.00   Cloud9");
    System.out.println("C.   30.00    Snickers");
    
    System.out.println();
    System.out.println("Which candy would you like to purchase(letter only)?: ");
    
    String choice = scan.next().toUpperCase();
    
    if (choice.equals("A")){
      System.out.println("You have selected Mentos");
      System.out.print("Price: ");
      price = 3.00;
      return price;
    }
    else if (choice.equals("B")){
      System.out.println("You have selected Cloud9");
      System.out.print("Price: ");
      price = 10.00;
      return price;
    }
    else if (choice.equals("C")){
      System.out.println("You have selected Snickers");
      System.out.print("Price: ");
      price = 30.00;
      return price;
    }
    else {
      return price;
    }
  }
  
  public static void dispense(double money, double candyPrice){
       
    if (money > candyPrice){
      System.out.println("Here''s your candy. Enjoy!");
      double change = money - candyPrice;
      System.out.println("Here's "+change+" in change");
    }
    else if (money == candyPrice){
      System.out.println("Here's your candy. Enjoy!");
    }
    else {
      System.out.println("You don't have enough money to purchase the item");
    }
   
  }
  
  public static void main(String[] args) {
   
     System.out.println("Welcome to the first ever Virtual candymachine!!!");
     System.out.println();
     
     
     double candyPrice = displayMenu();
     System.out.println(candyPrice);
     
     if (candyPrice == 0){
       System.out.println("I don't have that item on my menu");
     }
     else {
       System.out.print("Please enter your money here: ");
       double money = scan.nextDouble();
       dispense(money, candyPrice);
       
     }
  }
}