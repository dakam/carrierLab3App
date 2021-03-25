package lab3;

public class Package {
	private String description;
	private String zone;
	private float weight;
	private Person sender;
	
	Package(String desc, String zon, float wei, Person psender) {
		this.description=desc;
		this.zone=zon;
		this.weight=wei;
		this.sender = psender;
	}

	public double getDiscount() {
		return sender.getDiscount();
	}
	public String getDesc() {
		return description;
	}
	
	public String getZone() {
		return zone;
	}
	
	public float getWeight() {
		return weight;
	}
	
	
}
