package gui;


public class AnimalsItem extends Item {
	private String dairyProductUrl;
	private String graveUrl = "/res/AnimalItem/grave.png";
	private int fastingTime;
	
	AnimalsItem(String itemName) {
		super(itemName);
		switch(itemName) {
		case "Chicken" :  dairyProductUrl = "/res/AnimalItem/egg.png"; fastingTime = 3; break;
		case "Sheep" :  dairyProductUrl = "/res/AnimalItem/wool.png";  fastingTime = 4; break;
		case "Goat" :  dairyProductUrl = "/res/AnimalItem/goatmilk.png"; fastingTime = 4; break;
		case "Cow" :  dairyProductUrl = "/res/AnimalItem/cowmilk.png"; fastingTime = 5; break;
		}
	}

	public String getDairyProductUrl() {
		return dairyProductUrl;
	}

	public void setDairyProductUrl(String dairyProductUrl) {
		this.dairyProductUrl = dairyProductUrl;
	}

	public String getGraveUrl() {
		return graveUrl;
	}

	public void setGraveUrl(String graveUrl) {
		this.graveUrl = graveUrl;
	}

	public int getFastingTime() {
		return fastingTime;
	}

	public void setFastingTime(int fastingTime) {
		this.fastingTime = fastingTime;
	}
	
}
