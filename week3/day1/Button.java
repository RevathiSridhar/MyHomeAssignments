package week3.day1;

public class Button extends WebElement {

	public void submit() {
		System.out.println("The input textfield is submitted");
	}
	
	public void setText(String text) {
		System.out.println("The text of the button is displayed"+" "+ text);	
	}
	public static void main(String[] args) {
		Button bt = new Button();
		bt.setText("Testleaf");
		

	}

}
