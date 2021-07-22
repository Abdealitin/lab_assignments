public class Startup {
	public static void main(String []args) {
		Calulate cal = new Calulate();
		//int result = cal.calculateSum(10);
		//int result = cal.calculateDifference(3);
		//boolean result = cal.checkNumber(1234589);
		boolean result = cal.checkPower(512);
		System.out.println("The output is : "+result);
	}

}
