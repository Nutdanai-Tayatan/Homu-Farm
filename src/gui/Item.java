package gui;

public class Item {
	protected String itemName;
	protected int itemPrice;
	protected int productPrice;
	protected String mainUrl;
	
	Item(String itemName){
		switch(itemName) {
		case "Turnip" : itemPrice = 50;	productPrice = 100; mainUrl = "/res/CropItem/turnip.png"; break; // 3 days product
		case "Carrot" : itemPrice = 80; productPrice = 160; mainUrl = "/res/CropItem/carrot.png"; break; // 4 days product
		case "Potato" : itemPrice = 100; productPrice = 200; mainUrl = "/res/CropItem/potato.png";break; // 4 days product
		case "Tomato" : itemPrice = 120; productPrice = 200; mainUrl = "/res/CropItem/tomato.png";break; // 5 days product 2 time
		case "Corn"	: itemPrice = 150; productPrice = 220;mainUrl = "/res/CropItem/corn.png"; break;// 5 day 3 time
		case "Strawberry" : itemPrice = 250; productPrice = 220; mainUrl = "/res/CropItem/strawberry.png"; break;//5 day 3 time
		case "Grape" : itemPrice = 300; productPrice = 250; mainUrl = "/res/CropItem/Grape.png"; break;//5 day 3 time
		case "Watermelon" : itemPrice = 400 ; productPrice = 300;mainUrl = "/res/CropItem/Watermelon.png"; break;//5 day 4 time
		case "Fertilizer" : itemPrice = 20 ; productPrice = 0;mainUrl = "/res/Tools/fertilizer.png"; break;
		case "Pesticide" : itemPrice = 20  ; productPrice = 0; mainUrl = "/res/Tools/pesticide.png";break;
		case "Chicken" : itemPrice = 500 ; productPrice = 50; mainUrl = "/res/AnimalItem/chicken.png"; break;
		case "Sheep" : itemPrice = 800; productPrice = 80;mainUrl = "/res/AnimalItem/sheep.png"; break;
		case "Goat" : itemPrice = 1000; productPrice = 100;mainUrl = "/res/AnimalItem/goat.png"; break;
		case "Cow" : itemPrice = 1500; productPrice = 150;mainUrl = "/res/AnimalItem/cow.png"; break;
		case "Grain" : itemPrice = 20; productPrice = 0;mainUrl = "/res/AnimalItem/grain.png"; break;
		case "Straw" : itemPrice = 30; productPrice = 0;mainUrl = "/res/AnimalItem/straw.png"; break;
		case "Shovel" : itemPrice = 0; productPrice = 0;mainUrl = "/res/Tools/shovel.png"; break;
		case "Watering Can" : itemPrice = 0; productPrice = 0;mainUrl = "/res/Tools/wateringcan.png"; break;
		case "Sickle" : itemPrice = 0; productPrice = 0;mainUrl = "/res/Tools/sickle.png"; break;
		case "Basket" : itemPrice = 0; productPrice = 0;mainUrl = "/res/Tools/basket.png"; break;
		}
		this.itemName = itemName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public String getPriceText() {
		if(itemPrice > 0 ) {
			return "\nPrice: "+ itemPrice;			
		}
		return "";
	}
	
	public String getIncomeText() {
		if(productPrice > 0) {
			return "\nIncome: "+ productPrice;			
		}
		return "";
	}
}
