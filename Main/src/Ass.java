import java.util.Scanner;

public class Ass {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		getDifference(n);
	}
	public static void getDifference(long n) {
		StringBuilder sbOdd = new StringBuilder();
		StringBuilder sbEven = new StringBuilder();
		String num = String.valueOf(n);
		for(int i=0; i<num.length();i++) {
			if(i%2 == 0)
				sbOdd.append(num.charAt(i));
			else
				sbEven.append(num.charAt(i));
		}
//		System.out.println(sbOdd);
//		System.out.println(sbEven);
		String odd = String.valueOf(sbOdd);
		String even = String.valueOf(sbEven);
		System.out.println(Math.abs(Integer.parseInt(odd) - Integer.parseInt(even)));
	}

}

