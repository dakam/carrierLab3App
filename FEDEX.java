package lab3;

public class FEDEX implements carrier{

	private String name;
	
	FEDEX(String name) {
		
		this.name=name;
	}
	@Override
	public double calculateCosts(Package p) {
		
		if(p !=null) {
		
			float w = p.getWeight();
			String z = p.getZone();
			double dis = p.getDiscount();
			double zone=0.0;
			switch(z) {
			
			case "IA" :
			case "MT" :
			case "OR" :
			case "CA" :
			
				zone=0.35;
				break;
				
			case "TX" :
			case "UT" :
				zone =0.30;
				break;
			
			case "FL" :
			case "MA" :
			case "OH" :
				zone=0.55;
				break;
			
			default :
				zone=0.43;		
			}
			
			double price = zone*w;
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

