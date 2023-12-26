package week2.day1;

public class Fibonacci {
	
	public void fibonacciSeries(int range) {
		
		int n1 = 0;
		int n2 = 1;
		if(range==1) {
			System.out.print("Fibonacci series is : ");
			System.out.print(n1);
		}
		else if(range ==2) {
			System.out.print("Fibonacci series is : ");
			System.out.print(n1);
			System.out.print(", "+n2);
		}
		else {
			
		
		System.out.print("Fibonacci series is : ");
		System.out.print(n1);
		System.out.print(", "+n2);
		for(int i=3 ; i <= range ; i++) {
						
			int n3= n1+n2;
			n1 = n2;
			n2= n3;
			System.out.print(", "+n3);
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci input = new Fibonacci();
		input.fibonacciSeries(8);
	}

}
