package lab3;

public class UPS implements carrier{

	private String name;
	
	UPS(String name) {
		
		this.name=name;
	}
	@Override
	public double calculateCosts(Package p) {
		
		if(p !=null) {
		
			float w = p.getWeight();
			double dis = p.getDiscount();
			
			double price = 0.45*w;
			double discount = price*dis;
			return price-discount;
			
			
		}
		else
		{
			return 0;
		}
		
	}
	
	public String getCName() {
		return name;
	}

}
