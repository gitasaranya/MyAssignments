package week3.day2;

public class Elements extends Button{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Execution Class: Elements
		//Create execution class named , also inheriting from the Button subclass.
		
		TextField input = new TextField();
		input.click();
		input.setText("Apple");
		System.out.println(input.getText());
		
		CheckBoxButton check= new CheckBoxButton();
		check.click();
		check.submit();
		check.clickCheckButton();
		
		RadioButton radio= new RadioButton();
		radio.click();
		radio.submit();
		radio.selectRadioButton();
	}

}
