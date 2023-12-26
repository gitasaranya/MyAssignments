package week2.day1;
import java.util.Arrays;
public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {2,5,7,7,5,9,2,3};
		//Sorting the array
		Arrays.sort(num);
		//Iterating through the array		
		for(int i=0 ; i<num.length-1 ; i++) {
		//Comparing current index value and next value in the array
			if(num[i]==num[i+1]) {
				System.out.println(num[i]+" is a duplicate value");
			}
		}
	}

}
