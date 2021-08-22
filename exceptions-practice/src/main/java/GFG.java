import java.util.Scanner;

public class GFG
{
    // A utility method that returns true if x is perfect square
    static  boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }
      
    // Returns true if n is a Fibonacci Number, else false
    static boolean isFibonacci(int n)
    {
        // n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
        // is a perfect square
        return isPerfectSquare(5*n*n + 4) ||  
               isPerfectSquare(5*n*n - 4);
    }
 
    // Driver method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum = 0;
        if(isFibonacci(n)) {
        	System.out.println(n);
        }
        else {
        	for(int i=0; i<n; i++) {
        		if(i%2!=0) {
        			if(isFibonacci(i)) {
        				sum = sum+i;
        			}
        		}
        	}
        	System.out.println(sum);
        }
    }
}