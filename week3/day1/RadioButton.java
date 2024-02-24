package week3.day1;

public class RadioButton extends Button{

	public void selectRadioButton() {
		System.out.println("Radio Button Checked");
	}
	public static void main(String[] args) {
		RadioButton box = new RadioButton();
		
		box.setText("Checkbox");
		box.Click();
	}
}
