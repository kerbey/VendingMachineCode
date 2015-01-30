package writingMethod;
import java.util.Scanner;
public class vendingMachine
{
	public static void main(String[] args)
	{
		int total4=0;
		int finalTotal=0;
		int input2=1;
		int finaltotal2=0;
		int product=1;
		Scanner keyboard = new Scanner(System.in); 
		if (product!=0)
		{
			finalTotal = Cost();//goes to cost method to collect amount user wants to spend
			if (input2==1)
			{//user chooses which product to purchase
				System.out.println("Choose what you want to buy");
				System.out.println(" a. deoderant($1.25), b.running sneakers($2.50),");
				System.out.println(" c.mountain dew($4.25), d.socks($5.45), e.T-shirt($6.00)");
				String choice=keyboard.next();
				if(choice.contains("a"))
				{
					total4= 125;
				}
				else if (choice.contains("b"))
				{
					total4= 250;
				}
				else if (choice.contains("c"))
				{
					total4= 425;
				}
				else if (choice.contains("d"))
				{
					total4= 545;
				}
				else if (choice.contains("e"))
				{
					total4= 600;
				}
				finaltotal2=finaltotal2+total4;
				System.out.println("you're spending "+(finaltotal2)+" cents");
                //user can continue purchasing, cancel the whole thing, or receive change
				System.out.println("do you want to keep spending money?");
				System.out.println("enter 1 for yes 2 for no and 0 to cancel");
				input2=keyboard.nextInt();
				if (input2==0)
				{
					System.out.println("end");
					end();//goes to end method to end the program	
				}
			}
			if((finaltotal2-finalTotal)<0)
			{
				System.out.println("your change is "+(finalTotal-finaltotal2)+" cents");
				vendingMachine(finalTotal-finaltotal2);//change is given here
			}
			else 
			{
				System.out.println(" you don't have enough money");
			}
		}
	}
	public static void start()
	{
		main(null);
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
		{//user enters the amount of 1 dollar bills, then fives, then the amount of change (20 for 20 cents)
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
			System.out.println("do you want to keep adding money?");
			System.out.println("enter 1 for yes and 2 for no and 0 to cancel.");
			input=keyboard.nextInt();
			if (input==0)
			{
				end();
			}
		}
		return finalTotal;
	}
	private static void vendingMachine(int amount)
	{//algorithm to get any amount of money in change
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
