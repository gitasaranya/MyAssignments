package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object creation
		Mobile iphone = new Mobile();
		//calling method makeCall for object created
		iphone.makeCall();
		//calling method sendMsg for object created
		iphone.sendMsg();
		System.out.println("This is my mobile");
	}
	
	public void makeCall() {
		//variables declaration and assignment
		
	
		String mobileModel = "iphone";
		float mobileWeight = 0.5f;
		System.out.println("Make a call");
		System.out.println("Mobile model is :"+mobileModel);
		System.out.println("Mobile weight is :"+ mobileWeight);
	}
	

	public void sendMsg() {
		boolean isFullcharged=false;
		int mobileCost=70000;
		System.out.println("Send a text message");
		System.out.println("Is fully charged? :"+isFullcharged);
		System.out.println("Mobile cost is : "+mobileCost);
	}
}
