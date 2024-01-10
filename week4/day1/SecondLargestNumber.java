package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare an array {3, 2, 11, 4, 6, 7}.
		int[] input = {3,2,11,4,6,7};
		
		//Pick the 2nd element from the last and print it
		List<Integer> inputList = new ArrayList<Integer>();
		
		for(int i=0; i<input.length; i++) {
			inputList.add(input[i]);
		}
		Collections.sort(inputList);;
		 
		System.out.println("Second largest number is: "+ inputList.get(inputList.size()-2));
	}

}
