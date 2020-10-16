
public class ItemToPurchase {
	String name; 
	int itemPrice;
	int itemQuantity; 
	int age;
	
	
	void setName(String name){
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	void setPrice(int price) {
		this.itemPrice = price;
	}
	
	int getPrice() {
		return this.itemPrice;
	}
	
	void setQuantity(int quantity) {
		this.itemQuantity = quantity;
	}
	 int getQuantity() {
		 return this.itemQuantity;
	 }
}
