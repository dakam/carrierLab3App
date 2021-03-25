package lab3;

public class Student extends Person{
	
	Student(String fullname) {
		super(fullname);
	}

	@Override
	public double getDiscount() {
		
		double dis = 10/100;
		
		return dis;
	}
	
	
	

}
