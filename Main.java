import java.util.Scanner;  

public class Main {
    public static void main(String[] args) {

      //using scanner to record inputs
      Scanner myObj = new Scanner(System.in);
      
      double discount = 0;
      double tax = 0;
      double moneyLeft =0;
      double total = 0;

      //asking for Total price pre tax and discount
      System.out.print("Enter Total Item Price:");
      
      double price = myObj.nextDouble();
      //asking user to input sales tax in decimal form
      System.out.print("Enter Sales Tax (In Decimal Form):");

      double salesTax = myObj.nextDouble();
      //asking user to input promotional discount in decimal form
      System.out.print("Enter Promotion Discount (In Decimal Form):");

      double promotion = myObj.nextDouble();
      
      //calculate how much money is taken off due to promo
      discount = price * promotion;
      //System.out.println(moneyOff); //testing if output is right
      //calculate how much of the total is left when discount is applied
      moneyLeft = price - discount;
      //System.out.println(moneyLeft);//testing if output is right
      //adding the tax and discounted price for total
      //calculate tax with new total after discount
      tax = moneyLeft * salesTax;
      total = moneyLeft + tax;
      System.out.print("Your total is: " + total);

    }
  }