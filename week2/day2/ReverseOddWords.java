package week2.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I am a software tester";
		ReverseOddWords rev = new ReverseOddWords();
		System.out.println("Input string is : "+ input);
		System.out.print("Odd Words Reversed String is : ");
		rev.reverse(input);
	}
	
	public void reverse(String input) {
		String[] words = input.split(" ");
		System.out.print((words[0])+" ");
		for(int i = 1; i< words.length; i++) {
				if(i%2==1) {
				char[] letters = words[i].toCharArray();
				for(int j =letters.length-1; j>=0; j--) {
					System.out.print(letters[j]);
				}
				System.out.print(" ");
			}
			else {
				System.out.print(words[i]+" ");
			}
		}
	}
}
