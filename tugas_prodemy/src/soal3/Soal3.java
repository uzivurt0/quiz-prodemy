package soal3;

import java.util.Scanner;

public class Soal3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input number : ");
		int n = scanner.nextInt();
		int a = 1, b = 1, c = 1;
		int temp;
		for( int i = 0; i < n; i++) {
			System.out.print(" " + a + " ");
			temp = a + b + c;
			
			a = b;
			b = c;
			c = temp;
			
		}
		
		
	}
}
