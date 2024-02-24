package week3.day1;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		String value = text.toLowerCase();
		String remove ="";
		int count =0;
		String[] duplicateText = value.split(" ");
		
		for(int i=0;i<duplicateText.length-1;i++) {
			for(int j=i+1;j<duplicateText.length;j++) {
				if(duplicateText[i].equals(duplicateText[j])) {
					
					count++;
					remove=text.replace(duplicateText[j], "");
					
				}	
			
			}
		}
		if(count > 0)  {
			System.out.println(remove);  
		}
	}
}		
		
