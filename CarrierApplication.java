package lab3;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CarrierApplication {

	public static void main(String[] args) {
		// to sort carriers by lowest price i will use a treeMap 
		carrier ups = new UPS("UPS");
		carrier usmail = new USMAIL("US MAIL");
		carrier fedex = new FEDEX("FedEx");
		
		Person damian = new Student("Damian");

		System.out.println("Please enter The number of Packages to ship");
		Scanner sc = new Scanner(System.in);
		String st = sc.next();

		try {
			int num = getInt(st);
			int n=0;
			String printstr="";
			do {

				System.out.println("-------Carrier Service App-------------");
				System.out.println("Please enter Package Description:");
				String pdesc = sc.next();

				System.out.println("Please enter Package Weight:");
				String pweight = sc.next();
				double pw = getDouble(pweight);
				float packageweight = (float) pw;

				System.out.println("Please enter Package Zone:");
				String pzone = sc.next();

				Package package1 = new Package(pdesc, pzone, packageweight,damian);

				TreeMap<Double,carrier> carriermap = new TreeMap<Double,carrier>();
				carriermap.put(ups.calculateCosts(package1), ups);
				carriermap.put(fedex.calculateCosts(package1), fedex);
				carriermap.put(usmail.calculateCosts(package1), usmail);

				carrier bestcar = carriermap.firstEntry().getValue();
				printstr = printstr+ package1.getDesc()+" $"+bestcar.calculateCosts(package1)+" "+bestcar.getCName()+"\n";
				n++;
			}while(n<num);

            System.out.println("*------Results------*");
			System.out.println(printstr);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static int getInt(String s) throws IOException 
	{

		return (Integer.valueOf(s));
	}

	public static double getDouble(String s) throws IOException 
	{

		return (Double.valueOf(s)).doubleValue();
	}


}
