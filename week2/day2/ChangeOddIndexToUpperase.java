package week2.day2;

public class ChangeOddIndexToUpperase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangeOddIndexToUpperase convert = new ChangeOddIndexToUpperase();
		convert.toOddIndexUppercase("changeme");
		
	}
	
	public void toOddIndexUppercase(String input) {
		char[] inputArray = input.toCharArray();
		for(int i =inputArray.length ; i>0 ; i--) {
			if(i%2==1) {
				inputArray[i] = Character.toUpperCase(inputArray[i]);
			}
		}
		
		System.out.println("Changed string is: ");
		for(int i =0 ; i <inputArray.length ; i++) {
			System.out.print(inputArray[i]);
		}
	}

}
