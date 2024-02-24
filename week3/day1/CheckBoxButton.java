package week3.day1;

public class CheckBoxButton extends Button {

	public void clickCheckButton() {
		System.out.println("Checkbox Button clicked");
	}
	
	public static void main(String[] args) {
		CheckBoxButton box = new CheckBoxButton();
		
		box.setText("Checkbox");
		box.Click();
	}
}
