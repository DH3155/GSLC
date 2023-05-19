package GSLC;

// This is a subclass of Clothing
// Here we will inherit the attributes of the Clothing abstract class
// Since Clothing implements the actions interface class, this will also implement it
// because of the parent implementing it
public class TextileTShirt extends Clothing{
	public TextileTShirt(int chest, int waist, int hip) {
		super(chest, waist, hip);
	}
	protected int size = super.size;
	
	// Makes the "rule" for GetPrice
	// Giving it details on how to do GetPrice
	@Override
	public int GetPrice() {
		if(size == 0) {
			return 0;
		}
		int temp = 39000 + (1000*size);
		System.out.printf("Price is : %d\n", temp);
		System.out.println("=====================");
		return temp;
	}
}
