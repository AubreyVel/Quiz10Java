import java.util.Scanner;  

public class Main {
    public static void main(String[] args) {

      
      Scanner myObj = new Scanner(System.in);
      
      double moneyOff = 0;
      double tax = 0;
      double moneyLeft =0;
      double total = 0;


      System.out.print("Enter Item Price:");

      double price = myObj.nextDouble();

      System.out.print("Enter Sales Tax (In Decimal Form):");

      double salesTax = myObj.nextDouble();

      System.out.print("Enter Promotion Discount (In Decimal Form):");

      double promotion = myObj.nextDouble();
      
      //calc how much money is taken off due to promo
      moneyOff = price * promotion;
      //System.out.println(moneyOff); //testing if output is right
      //calc how much of the total is left when discount is applied
      moneyLeft = price - moneyOff;
      //System.out.println(moneyLeft);//testing if output is right
      //adding the tax and discounted price for total
      //calc tax with new total
      tax = moneyLeft * salesTax;
      total = moneyLeft + tax;
      System.out.print("Your total is: " + total);

    }
  }