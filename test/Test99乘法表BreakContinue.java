package uuu.etgt.test;

import java.time.LocalDate;

public class Test99乘法表BreakContinue {
	public static void main(String[] args) {		
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(
					i + "*" + j + "=" + i*j + (j==9?'\n':'\t'));
				if(j==i) {
					System.out.println();
					break;
				}
			}
			
		}
		
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print('*' + (j==9?"\n":""));
				if(j==i) {
					System.out.println();
					break;
				}
			}
		}
		
http://www.uuu.com.tw
		for(int i=1;i<10;i++) {
			loop2:
line32:			for(int j=1;j<10;j++) {
				System.out.print(
					i + "*" + j + "=" + i*j + (j==9?'\n':'\t'));
				if(j==i) {
					System.out.println();
					continue http;
				}
			}
			
		}
		
		
		
		
	}
}
