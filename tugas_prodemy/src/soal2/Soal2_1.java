package soal2;

import java.util.Scanner;

public class Soal2_1 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input number : ");
		int n=scanner.nextInt();
		int first = 1, second = 1;
		int temp = 0;
		for(int i = 0; i < n;i++) {
			System.out.print(first + " ");
			
			temp = first + second;
			first = second;
			second = temp;
		}
		
	}
}
