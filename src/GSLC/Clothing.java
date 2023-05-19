package GSLC;

// Here is the abstract class
// Abstract classes are like the frameworks of other classes
// These kinds of classes are designed for subclasses to extend
// If it is extended, the class will inherit the class' attributes

// Here we have an abstract class implementing the action interface
// This means that the abstract class has the "rule titles" given by the interface
// Now this abstract class can give the details about the "rules" from the interface
abstract class Clothing implements actions{
	protected int Chest;
	protected int Waist;
	protected int Hip = 0;
	protected int size;

	public Clothing(int chest, int waist, int hip) {
		this.Chest = chest;
		this.Waist = waist;
		this.Hip = hip;
	}
	
	// Makes the "rule" for GetGender
	// Giving it details on how to do GetGender
	public void GetGender() {
		if(this.Hip == 0) {
			System.out.println("-- Male Sizes--");
		}else {
			System.out.println("-- Female Sizes -- ");
		}
	}
	
	// Makes the "rule" for GetSize
	// Giving it details on how to do GetSize
	public int GetSize() {
		if(this.Hip == 0) {
			if((this.Chest >= 33 && this.Chest < 35) && (this.Waist >= 26 && this.Waist < 28)) {
				this.size = 1;
				System.out.println("Size is : XS (Male)");
			}else if((this.Chest >= 35 && this.Chest < 37) && (this.Waist >= 28 && this.Waist < 30)) {
				this.size = 2;
				System.out.println("Size is : S (Male)");
			}else if((this.Chest >= 37 && this.Chest < 40) && (this.Waist >= 30 && this.Waist < 32)) {
				this.size = 3;
				System.out.println("Size is : M (Male)");
			}else if((this.Chest >= 40 && this.Chest < 42) && (this.Waist >= 32 && this.Waist < 34)) {
				this.size = 4;
				System.out.println("Size is : L (Male)");
			}else if((this.Chest >= 42 && this.Chest < 44) && (this.Waist >= 34 && this.Waist < 36)) {
				this.size = 5;
				System.out.println("Size is : XL (Male)");
			}else {
				System.out.println("Unavailable");
				this.size = 0;
			}
		}else {
			if((this.Chest >= 30 && this.Chest < 32) && (this.Waist >= 22 && this.Waist < 24) && (this.Hip >= 31 && this.Hip < 33)) {
				this.size = 1;
				System.out.println("Size is : XXS (Female)");
			}else if((this.Chest >= 32 && this.Chest < 34) && (this.Waist >= 25 && this.Waist < 27) && (this.Hip >= 34 && this.Hip < 35)) {
				this.size = 2;
				System.out.println("Size is : XS (Female)");
			}else if((this.Chest >= 34 && this.Chest < 36) && (this.Waist >= 27 && this.Waist < 29) && (this.Hip >= 35 && this.Hip < 38)) {
				this.size = 3;
				System.out.println("Size is : S (Female)");
			}else if((this.Chest >= 36 && this.Chest < 38) && (this.Waist >= 29 && this.Waist < 32) && (this.Hip >= 39 && this.Hip < 41)) {
				this.size = 4;
				System.out.println("Size is : M (Female)");
			}else if((this.Chest >= 38 && this.Chest < 41) && (this.Waist >= 32 && this.Waist < 35) && (this.Hip >= 41 && this.Hip < 44)) {
				this.size = 5;
				System.out.println("Size is : L (Female)");
			}else if((this.Chest >= 41 && this.Chest < 43) && (this.Waist >= 35 && this.Waist < 38) && (this.Hip >= 44 && this.Hip < 47)) {
				this.size = 6;
				System.out.println("Size is : XL (Female)");
			}else {
				System.out.println("Unavailable");
				this.size = 0;
			}
		}
		return this.size;
	}
	
	// This makes the subclass determine the rules themselves
	// with this, they can have other values of their own
	public abstract int GetPrice();
}
