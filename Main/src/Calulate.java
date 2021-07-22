
public class Calulate {

	public int calculateSum(int n) {
		int sum=0;
		// TODO Auto-generated method stub
		for(int i=0; i<=n; i++) {
			if(i%3==0 || i%5==0) {
				sum += i;
			}
		}
		return sum;
	}

	public int calculateDifference(int n) {
		int squareSum = 0;
		for(int i=1; i<=n; i++) {
			squareSum = squareSum + (i*i);
		}
		int sumSquare = 0;
		int sum=0;
		for(int j=0; j<=n; j++) {
			sum+=j;
		}
		sumSquare = sum*sum;
		int difference = sumSquare- squareSum;
		return difference;
	}

	public boolean checkIncreasingNumber(int n) {
		// TODO Auto-generated method stub
		boolean flag=true;
		int present = n%10;
		n=n/10;
		while(n>0) {
			if(present<=n%10) {
				flag = false;
				break;
			}
			present = n%10;
			n=n/10;
		}
		return flag;
	}

	public boolean checkPower(int n) {
		// TODO Auto-generated method stub
		boolean flag = true;
		int counter = 0;
		if(n<1) {
			return false;
		}
		while(n!=1) {
			if(n%2==0) {
				n=n/2;
				counter++;
			}else {
				flag=false;
				break;
			}
			
		}
		System.out.println(counter);
		return flag;
	}

}
