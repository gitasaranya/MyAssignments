package week2.day1;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeCheck number = new PalindromeCheck();
		number.palindromeOrNot(121);
		number.palindromeOrNot(12345);
	}
	
	public void palindromeOrNot(int input) {
		
		int temp = input;
		int reversedNumber = 0;
		while(temp>0) {
			
			reversedNumber = (reversedNumber*10) + (temp%10);
			temp = temp/10;
		}
		if(reversedNumber==input) {
			System.out.println(input +" is a palindrome");
		}
		else {
			System.out.println(input +" is NOT a palindrome");
		}
	}
}
