package soal4;

import java.util.Scanner;

public class Soal4 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input number : ");
		
		int number = scan.nextInt();
		
		System.out.println(number);
		for(int i = 1; i < number + 1; i++) {
			int a = 1, b = 1, temp;
			for(int j = 1; j < number + 1;j++) {
				
				if(i == j || i + j == number + 1) {
					System.out.print(a);
				} else {
					System.out.print(" ");
				}
				temp = a + b;
				a = b;
				b = temp;
			}
			System.out.println();
		}
	}
}
