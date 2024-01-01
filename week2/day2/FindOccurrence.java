package week2.day2; 

public class FindOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test string declaration
		String input = "TestLeaf";
		//Character declaration
		char c = 'e';
		//Object creation
		FindOccurrence word = new FindOccurrence();
		System.out.println("Occurrence of "+c+" in "+ input +" is " + word.countOccurrence(input,c));
	}

	public int countOccurrence(String input, char c) {
		//variable to count occurrence of character
		int count = 0;
		//converting string to character array
		char[] inputArray = input.toCharArray();
		//Traversing through the char array values
		for(int i = 0 ; i <inputArray.length ; i++) {
			//comparing each character with target character
			if(inputArray[i]==c) {
				count++;
			}
		}
		return count;
		
	}
}
