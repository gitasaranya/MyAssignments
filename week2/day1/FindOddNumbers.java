package week2.day1;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxRange = 10;
		FindOddNumbers odd = new FindOddNumbers();
		//calling oddNumbers function
		odd.oddNumbers(maxRange);
		
	}
	
	public void oddNumbers(int maxRange) { 
		System.out.println("Odd numbers from 1 to "+maxRange+" are:");
			for (int i=1; i<=maxRange ; i++) {
			//Conditional statement
			if((i%2)==1) {
				System.out.println(i);
			}
		}
	}
}
