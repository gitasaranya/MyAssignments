package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName = new String("google");
		char[] company = companyName.toCharArray();
		Set<Character> output = new LinkedHashSet<Character>();
		for(int i=0;i<company.length; i++) {
			output.add(company[i]);
		}
		System.out.println(output);
		String uniqueChar ="";
		
		for(Character unique:output) {
			uniqueChar = uniqueChar + unique;
		}
		System.out.println(uniqueChar);
	}

}
