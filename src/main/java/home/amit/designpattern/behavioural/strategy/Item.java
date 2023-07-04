package home.amit.designpattern.behavioural.strategy;

public class Item {
	
	private int price;
	private String itemCode;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public Item(int price, String itemCode) {
		super();
		this.price = price;
		this.itemCode = itemCode;
	}

}
