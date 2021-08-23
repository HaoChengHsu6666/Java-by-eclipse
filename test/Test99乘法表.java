package uuu.etgt.test;

public class Test99乘法表 {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(
					i + "*" + j + "=" + i*j + (j==9?'\n':'\t'));
			}
		}
		
		for (int i=10;i>0;i-=2) {
			System.out.println(i);			
		}
		
		System.out.println("*****************");
		
		int i = 1;
		for(System.out.println(i);i<10;System.out.println(i)) {
			i++;
		}		
		System.out.println(Math.round(11.5));
		System.out.println(Math.round(-11.5));
	}
}
