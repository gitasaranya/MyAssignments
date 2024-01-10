package week4.day1;

import java.util.ArrayList;
import java.util.Collections;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare an array {1, 2, 3, 4, 10, 6, 8}.
		int[] inputArray = {1, 2, 3, 4, 10, 6, 8};
				
		//Do a comparison check if there is a gap in the sequence of numbers.
		ArrayList<Integer> inputList = new ArrayList<Integer>();
		for(int i=0; i<inputArray.length; i++) {
			inputList.add(inputArray[i]);
		}
		Collections.sort(inputList);
		//Print the numbers that are missing.
		System.out.println("Missing numbers are: ");
		for(int i=0; i<inputList.size()-1;i++) {
			if((inputList.get(i)+1)!=(inputList.get(i+1))){
				System.out.println(inputList.get(i)+1);
				
			}
		}
		

	}

}
