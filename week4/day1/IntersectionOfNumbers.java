package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};
		
		List<Integer> array = new ArrayList<Integer>();
		
		
		for(int i=0; i<array1.length; i++) {
			array.add(array1[i]);
		}
		System.out.println("Intersection of numbers is: ");
		for(int i=0; i<array2.length; i++) {
			if(array.contains(array2[i])){
				System.out.println(array2[i]);
			}
		}
	
		
	}

}
