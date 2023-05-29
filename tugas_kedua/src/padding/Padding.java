package padding;

import java.util.Scanner;

public class Padding {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please input your string : ");
		String a = scan.next();
		System.out.print("Please input your number : ");
		int counter = scan.nextInt();
		LeftPadding(a, counter);
		RightPadding(a, counter);
	}
	
	public static String LeftPadding(String checker, int count) {
		String answer = "";
		if(checker.length() != count) {
		for(int i = 0; i <= count - checker.length();i++) {
			answer = " " + checker;
			checker = answer;
		}
		} else {
			answer = checker;
		}
		System.out.println("Left Padding :" + answer);
		return answer;
	}
	
	public static String RightPadding(String checker, int count) {
		String answer = "";
		if(checker.length() != count) {
			for(int i = 0; i <= count - checker.length();i++) {
				answer = checker + " ";
				checker = answer;
			}
		}
		else {
			answer = checker;
		}
		System.out.println("Right Padding :" + answer);
		return answer;
	}
	
	
}
