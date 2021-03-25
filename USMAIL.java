package lab3;

public class USMAIL implements carrier{

	private String name;
	
	USMAIL(String name) {
		
		this.name=name;
	}
	@Override
	public double calculateCosts(Package p) {
		
		if(p !=null) {
		
			float w = p.getWeight();
	        double dis = p.getDiscount();
			
			
			
			if(w <3) {
				
				double price = 1;
				double discount = price*dis;
				return price-discount;
				
			}
			else
			{
				double price = 0.55*w;
				double discount = price*dis;
				return price-discount;
					
			}
			
		
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
