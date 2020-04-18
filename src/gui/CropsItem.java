package gui;

public class CropsItem extends Item {

	private String seedUrl = "/res/CropsItem/seed.png";
	private String grassUrl = "/res/CropItem/grass.png";
	private String wormUrl = "/res/CropItem/worm.png";
	private String diedCropsUrl = "/res/CropItem/diedCrops";
	int harvestInterval;
	int productionAmount;
	
	CropsItem(String itemName) {
		super(itemName);
		switch (itemName) {
		case "Turnip" : harvestInterval = 3; productionAmount = 1; break;
		case "Carrot" : harvestInterval = 4;productionAmount =1; break;
		case "Potato" :  harvestInterval = 4;productionAmount = 1; break;
		case "Tomato" : harvestInterval = 5; productionAmount = 2; break;
		case "Corn" :  harvestInterval = 5; productionAmount = 3; break;	
		case "Strawberry" :  harvestInterval = 5; productionAmount =3; break;
		case "Grape" :  harvestInterval = 5; productionAmount =3; break;
		case "Watermelon" :  harvestInterval = 5; productionAmount =4; break;
		}
	}

	public String getSeedUrl() {
		return seedUrl;
	}

	public void setSeedUrl(String seedUrl) {
		this.seedUrl = seedUrl;
	}

	public String getGrassUrl() {
		return grassUrl;
	}

	public void setGrassUrl(String grassUrl) {
		this.grassUrl = grassUrl;
	}

	public String getWormUrl() {
		return wormUrl;
	}

	public void setWormUrl(String wormUrl) {
		this.wormUrl = wormUrl;
	}

	public String getDiedCropsUrl() {
		return diedCropsUrl;
	}

	public void setDiedCropsUrl(String diedCropsUrl) {
		this.diedCropsUrl = diedCropsUrl;
	}

	public int getHarvestInterval() {
		return harvestInterval;
	}

	public void setHarvestInterval(int harvestInterval) {
		this.harvestInterval = harvestInterval;
	}

	public int getProductionAmount() {
		return productionAmount;
	}

	public void setProductionAmount(int productionAmount) {
		this.productionAmount = productionAmount;
	}
	
	
	
}
