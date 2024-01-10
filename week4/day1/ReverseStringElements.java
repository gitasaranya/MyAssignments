package week4.day1;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseStringElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse the given collection of String elements
		//Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		
		//Add the collection to a list
		ArrayList<String> companies = new ArrayList<String>();
		
		for(int i=0; i<input.length;i++) {
			companies.add(input[i]);
		}
		
		Collections.sort(companies);
		System.out.println("Output is: ");		
		//Iterate the values in the list
		//Print the required output as Wipro, HCL, CTS, Aspire Systems
		for(int i=(companies.size())-1;i>=0;i--) {
			System.out.print(companies.get(i)+", ");
		}
		
	}

}
