package week2.day1;

public class Solution {
	public boolean isPrime(int num) {

		// Write your code here	
      boolean isItPrime = false;
      if((num==0)||(num==1)){
        System.out.println("Kindly enter a valid input!");
      }
      else if(num==2){
        isItPrime = true;
      }
      else{
        
      for(int i=2; i < num; i ++){
        if((num%i)==0){
          isItPrime = false;
          break;
        }
                  isItPrime = true;
        }
        
      }
      return isItPrime;
	}

	
  public static void main(String[] args){
    Solution prime = new Solution();
    if(prime.isPrime(13)) {
    	System.out.println("prime");
    }
    else {
    	System.out.println("Non prime");
    }
}
    

}
