package week2.day2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1";
		
		RemoveDuplicateWords remove = new RemoveDuplicateWords();
		remove.removedups(text);

}


public void removedups(String input) {
	int count = 0;
	String output ="";
	//Converting String to String array of words
	String[] inputArray = input.split(" ");
	for (int i = 0 ; i <inputArray.length ; i++) {
		for(int j=1 ; j < inputArray.length ; j ++) {
			if(i!=j) {
			if (inputArray[i].equalsIgnoreCase(inputArray[j])) {
				count ++;
				inputArray[j]= "";
			}
			}
		}
	}
	
	for (int i = 0 ; i <inputArray.length ; i++) {
		System.out.print(inputArray[i]+ " ");
	}
	

}
}