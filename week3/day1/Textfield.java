package week3.day1;

public class Textfield extends WebElement {
		public void getText() {
			System.out.println("The text of the input box is displayed");
		}
		public static void main(String[] args) {
			Textfield text = new Textfield();
			
			text.setText("Revathi TestLeaf");
			text.getText();
			
		}
}
