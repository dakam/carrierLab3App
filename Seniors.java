package lab3;

public class Seniors extends Person{

	Seniors(String fullname) {
		super(fullname);
		
	}
	
	@Override
	public double getDiscount() {
		
		double dis = 15/100;
		
		return dis;
	}
	

}
