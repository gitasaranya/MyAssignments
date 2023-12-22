package week1.day2;

public class NegativeToPositiveConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration and initialization of a negative number 
		int number = -89;
		System.out.println("The number is "+number);
		
		//if loop to check for negative number
		if(number<0) {
			//converting number to negative and storing in a new variable
			int newNumber = -number;
			System.out.println("The number "+number+" is converted to "+newNumber);
		}
	}

}
