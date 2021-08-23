package uuu.etgt.test;

import java.util.Random;
import java.util.Scanner;

public class TestWhileGuessNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int answer = random.nextInt(10) //0~9
				+ 1; //1~10
		
		Scanner scanner = new Scanner(System.in);		
//		System.out.println("請輸入一個1~10的整數:(答案是" + answer+")");		
//		int data = scanner.nextInt();
//		while(data!=answer ) {//0~many
//			System.out.println("答錯了，請再輸入一個1~10的整數:");
//			data = scanner.nextInt();
//		}
		
		int data;
		do {
			System.out.println("請輸入一個1~10的整數:(答案是" + answer+")");
			data = scanner.nextInt();
			if(data!=answer) System.out.print("答錯了 ");
		}while(data!=answer);
		
		System.out.println("答對了");
	}

}
