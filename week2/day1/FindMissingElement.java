package week2.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputArray[]= {1,4,3,2,8,6,7};
		//1,2,3,4,6,7,8
		Arrays.sort(inputArray);
		for( int i = 0 ; i < inputArray.length ; i++) {
			if(inputArray[i] != i+1) {
				System.out.println("Missing element is " +(i+1));
				break;
			}
		}
	}

}
