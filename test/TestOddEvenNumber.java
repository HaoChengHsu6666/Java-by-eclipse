package uuu.etgt.test;

import java.util.Scanner;

public class TestOddEvenNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int data = scanner.nextInt();
		
		if(data%2 == 0) {
			System.out.println(data + "是偶數");
		}else {
			System.out.println(data + "是奇數");
		}
		
		switch(data%2) {
			case 0:
				System.out.println(data + "是偶數");
				break;
			default:
				System.out.println(data + "是奇數");
		}
	}

}
