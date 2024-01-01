package week2.day2;

public class StringReverese {
	
	public void reverseString(String companyName) {
		
		char[] inputArray =companyName.toCharArray();
		int len = inputArray.length;
		System.out.println("Reversed string is: ");	
		for ( int i =len-1 ; i>=0 ; i--) {
			System.out.print(inputArray[i]);
				
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverese companyName = new StringReverese();
		companyName.reverseString("Testeaf");
	}

}
