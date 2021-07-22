import java.util.Scanner;
class Size{
	public static void main(String []args){
		System.out.println("Select a Size:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		switch(s){
			case "XS":
			   System.out.println("Length: 28");
			   break;

			case "S":
			   System.out.println("Length: 29");
			   break;

			case "M":
			   System.out.println("Length: 31");
			   break;
			   
			case "L":
				   System.out.println("Length: 32");
				   break;
			
			case "XL":
				   System.out.println("Length: 33");
				   break;
			
			default:
				System.out.println("Invalid Size");
		}
	}
}