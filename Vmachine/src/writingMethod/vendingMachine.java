/*First the program enters in the Cost method where it tells the user to enter in the amount of 1 dollar bills, five dollar bills
 , and the amount of change (20 for 20 cents). The money is added then the user can enter in 2 to continue and 0 to cancel and end the program. If it continues the program returns to the main 
 method and the user is given a list of products with their prices to choose from or can enter in 0 to cancel.
 The user chooses and is once again given the option to enter 1( keep choosing products and add on to the previously chosen
  product), 2 (get change and finish), 0 (cancel the purchase). Once 2 is chosen it subtracts the product(s) price(s) and
 gives you change in quarters, dimes, nickels, and/or pennies. If you don't have enough the program will say so and then end.
 * */
package writingMethod;
import java.util.Scanner;
public class vendingMachine
{
	public static void main(String[] args)
	{
		int finalTotal=0;
		int purchase=0;
		finalTotal = Cost();
		purchase(purchase, finalTotal);
	}
	private static void purchase(int purchase, int finalTotal)
	{
		int input2=1, total4=0;
		if (input2==1)
		{
			Scanner keyboard = new Scanner(System.in); 
			System.out.println("Choose what you want to buy");
			System.out.println(" a. deoderant($1.25), b.running sneakers($2.50),");
			System.out.println(" c.mountain dew($4.25), d.socks($5.45), e.T-shirt($6.00), or 0 to cancel");
			String choice=keyboard.next();
			if(choice.contains("a"))
			{
				total4= 125;
				purchase=purchase+total4;
			}
			else if (choice.contains("b"))
			{
				total4= 250;
				purchase=purchase+total4;
			}
			else if (choice.contains("c"))
			{
				total4= 425;
				purchase=purchase+total4;
			}
			else if (choice.contains("d"))
			{
				total4= 545;
				purchase=purchase+total4;
			}
			else if (choice.contains("e"))
			{
				total4= 600;
				purchase=purchase+total4;
			}
			else if (choice.contains("0"))
			{
				System.out.println("you got your money back");
				end();
			}
			System.out.println("you're spending "+(purchase)+" cents");
			System.out.println("do you want to keep spending money?");
			System.out.println("enter 1 for yes 2 for no and 0 to cancel");
			input2=keyboard.nextInt();
			if (input2==0)
			{
				System.out.println("you got your "+finalTotal+" cents back");
				end();	
			}
			else if(input2==1)
			{
				purchase(purchase, finalTotal);
			}
		}
		
		if((finalTotal-(purchase))>=0)
		{
			System.out.println("your change is "+(finalTotal-purchase)+" cents");
			vendingMachine(finalTotal-purchase);
		}
		else /*if((finalTotal-purchase)<0)*/
		{
			System.out.println("you're spending "+purchase);
			System.out.println(" you don't have enough money");
			end();
		}
	}
	private static void end() 
	{
		System.exit(0);
	}
	private static int Cost()
	{
		int number,input=1,total=0, total2=0, total3=0;
		int finalTotal=0;
		Scanner keyboard = new Scanner(System.in); 
		if (input==1)
		{
			System.out.println("enter the amount of one and five dollar bills and amount of change you wish to spend?");
			number = keyboard.nextInt();
			int amount=number*100;
			total=total+amount;

			number = keyboard.nextInt();
			int amount2=number*500;
			total2=total2+amount2;

			int amount3 = keyboard.nextInt();
			total3=total3+amount3;

			finalTotal=total+total2+total3;
			System.out.println("your item is worth "+finalTotal+" cents");
			System.out.println("do you want to keep going or cancel?");
			System.out.println("enter 2 to keep going and 0 to cancel.");
			input=keyboard.nextInt();
			if (input==0)
			{
				end();
			}
		}
		return finalTotal;
	}
	private static void vendingMachine(int amount)
	{
		int originalAmount,quarters, dimes, nickels, pennies; 
		originalAmount = amount;       
		quarters = amount / 25;     
		amount = amount % 25;     
		dimes = amount / 10;       
		amount = amount % 10;      
		nickels = amount / 5;      
		amount = amount % 5;       
		pennies = amount;
		System.out.println(originalAmount +" cents in coins can be given as:");      
		System.out.println(quarters + " quarters");   
		System.out.println(dimes + " dimes");     
		System.out.println(nickels + " nickels and"); 
		System.out.println(pennies + " pennies");		
	}
}
