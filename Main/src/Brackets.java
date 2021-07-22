import java.util.Scanner;

public class Brackets {
	public static void main(String []args) {
		int counter1=0,counter2=0;
		Scanner sc= new Scanner(System.in);
		String exp = sc.next();
		char[] ch = exp.toCharArray();
		for(char c:ch) {
			switch(c) {
			case '[':
				counter1++;
				break;
			case ']':
				counter2++;
				break;
			case '(':
				counter1++;
				break;
			case ')':
				counter2++;
				break;
			case '{':
				counter1++;
				break;
			case '}':
				counter2++;
				break;
			}
		}
		if(counter1 == counter2)
			System.out.println("All brackets are equal.");
		else if(counter1 > counter2)
			System.out.println("Closing bracket(s) is missing!");
		else
			System.out.println("Opening bracket(s) is missing");
	}
}
