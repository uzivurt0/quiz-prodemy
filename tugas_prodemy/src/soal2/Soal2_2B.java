package soal2;

import java.util.Scanner;

public class Soal2_2B {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input number");
		int n = scanner.nextInt();
		int j = 0;
		int k = n / 2;
		for(int i = 0; i < n;i++) {
			if(i < k + 1) {
				j++;
				System.out.print(j + " ");
				
			}
			else {
				j--;
				System.out.print(j + " ");
			}
		}
	}
}
