package GSLC;

import java.util.Scanner;

public class Main {
//	This program has interface class and also abstract class
//	The interface class is called actions (Details on interface can be seen on actions.java)
//	The abstract class is called Clothing (Details on abstract can be seen on Clothing.java)
	
/*	The differences between abstract and interface are:
	Interface :
	- Collection of methods signatures, not what inside the method
	- Must be implemented by classes
	- A class can implement multiple interface
	- uses the implements keyword
	
	Abstract :
	- Can have both abstract and non-abstract methods
	- Can have variables, constructors, and methods
	- A class can extend 1 abstract
	- uses the extends keyword
*/

// This is a program to calculate the total price of clothes from a custom made store
	public static void main(String[] args) {
		int total = 0;
		int sel = 0;
		Scanner sc = new Scanner(System.in);
		
		while(sel == 0){ // Main Menu
			System.out.println("Welcome to TStore, where we make custom made clothings");
			System.out.printf("Total : %d\n", total);
			System.out.println("1. Cotton T-Shirt");
			System.out.println("2. Flannel T-Shirt");
			System.out.println("3. Linen T-Shirt");
			System.out.println("4. Polyester T-Shirt");
			System.out.println("5. Textile T-Shirt");
			System.out.println("6. Exit");
			sel = sc.nextInt();
			if(sel == 1) {
				System.out.println("Cotton has been chosen");
				System.out.println("Input chest Size : ");
				int chest = sc.nextInt();
				System.out.println("Input waist Size : ");
				int waist = sc.nextInt();
				System.out.println("Input hip Size (0 is for male) : ");
				int hip = sc.nextInt();
			
				CottonTShirt temp = new CottonTShirt(chest, waist, hip);
				int price = temp.GetPrice();
				total = total + price;
				sel = 0;
			}else if(sel == 2) {
				System.out.println("Flannel has been chosen");
				System.out.println("Input chest Size : ");
				int chest = sc.nextInt();
				System.out.println("Input waist Size : ");
				int waist = sc.nextInt();
				System.out.println("Input hip Size (0 is for male) : ");
				int hip = sc.nextInt();
			
				FlannelTShirt temp = new FlannelTShirt(chest, waist, hip);
				int price = temp.GetPrice();
				total = total + price;
				sel = 0;
			}else if(sel == 3) {
				System.out.println("Linen has been chosen");
				System.out.println("Input chest Size : ");
				int chest = sc.nextInt();
				System.out.println("Input waist Size : ");
				int waist = sc.nextInt();
				System.out.println("Input hip Size (0 is for male) : ");
				int hip = sc.nextInt();
			
				LinenTShirt temp = new LinenTShirt(chest, waist, hip);
				int price = temp.GetPrice();
				total = total + price;
				sel = 0;
			}else if(sel == 4) {
				System.out.println("Polyester has been chosen");
				System.out.println("Input chest Size : ");
				int chest = sc.nextInt();
				System.out.println("Input waist Size : ");
				int waist = sc.nextInt();
				System.out.println("Input hip Size (0 is for male) : ");
				int hip = sc.nextInt();
			
				PolyesterTShirt temp = new PolyesterTShirt(chest, waist, hip);
				int price = temp.GetPrice();
				total = total + price;
				sel = 0;
			}else if(sel == 5) {
				System.out.println("Textile has been chosen");
				System.out.println("Input chest Size : ");
				int chest = sc.nextInt();
				System.out.println("Input waist Size : ");
				int waist = sc.nextInt();
				System.out.println("Input hip Size (0 is for male) : ");
				int hip = sc.nextInt();
			
				TextileTShirt temp = new TextileTShirt(chest, waist, hip);
				int price = temp.GetPrice();
				total = total + price;
				sel = 0;
			}else if(sel == 6){
				System.out.printf("The final total is: %d\n", total);
				break;
			}
			else {
				
				sel = 0;
			}
		}
		
	}

}
