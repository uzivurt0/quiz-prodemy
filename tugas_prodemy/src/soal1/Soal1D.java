package soal1;

import java.util.Scanner;

public class Soal1D {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input number : ");
		int input = scan.nextInt();
		
		System.out.println(input);
		
		for(int i = 1; i < input + 1; i++) {
			int k = 1;
				for(int j = 1; j < input + 1;j++) {
					
					if(i == j || i + j == input + 1) {
						System.out.print(k + " ");
						k+=2;
					} else {
						System.out.print(" ");
						k+=2;
					}
				}
			System.out.println();
		}
//		for(int i = 0; i < input; i++) {
//
//			for(int j = 0; j < input;j++) {
//				if(k % 2 != 0) {
//					System.out.print(k);
//					k++;
//				} else {
//					
//					k++;
//				}
//				
//			}
//			System.out.println();
//		}
	}
}
