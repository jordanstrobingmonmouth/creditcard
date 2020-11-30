import java.util.Scanner;

public class creditcard {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your credit card number: ");
		String ccNum = in.next();
		
		int i = 0;
		
		while (i < ccNum.length()) {
			char ch = ccNum.charAt(i);
			if (ch == ' ' || ch == '-') {
				String before = ccNum.substring(0, i);
				String after = ccNum.substring(i + 1);
				ccNum = before + after;
				
			}
			else {
				i++;
			}
		}
		System.out.println(ccNum);
			
		
		
	}

}
