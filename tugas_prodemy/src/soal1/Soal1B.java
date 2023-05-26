package soal1;

import java.util.Scanner;

public class Soal1B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input number : ");
		int number = scan.nextInt();
		
		System.out.println(number);
		for(int i = 1; i < number + 1; i++) {
			for(int j = 1; j < number + 1;j++) {
				if(i == j || i + j == number + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
