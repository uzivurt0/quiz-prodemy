package soal2;

import java.util.Scanner;

public class Soal2_2A {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input number");
		int n = scanner.nextInt();
		int a = 1, b = 1;
		int temp = 0;
		int j = 0;
		int k = n / 2;
		for(int i = 0; i < n;i++) {
			System.out.print(a + " ");
		
			if(i < k + 1) {
				temp = a + b;
				a = b;
				b = temp;
			}
			else {
				b = temp - a;
				temp = a;
				a = b;
//					System.out.println();
//					System.out.println("Temporary :  " + temp);
//					System.out.println("A :  " + a);
//					System.out.println("B : " + b);				}
			}
		}
	}
}
