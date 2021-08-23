package uuu.etgt.test;

public class TestBitwiseOperators {
	public static void main(String[] args) {
		byte a = 6; //0b00000110
		byte b = 5; //0b00000101
		
		System.out.println(~a);
		System.out.println(a&b); //0b00000100:4
		System.out.println(a|b); //0b00000111:7
		System.out.println(a^b); //0b00000011:3
		
		byte c = 0b0000100; //4		
		System.out.println("c的十進位:" + (c));
		System.out.println("c的二進位:" + Integer.toBinaryString(c));
		System.out.println((byte)(c >> 2)); //0b00000001: 1 (c/4)
		System.out.println((byte)(c << 2)); //0b00010000: 16(c*4)
		System.out.println((byte)(c >>> 2)); //0b00010000: 1(c*4)
		
		byte c1 = -0b0000100;
		System.out.println("c1的十進位:" + (c1));
		System.out.println("c1的二進位:" + Integer.toBinaryString(c1));
		System.out.println((byte)(c1 >> 2)); //0b11111111: -1 (c1/4)
		System.out.println((byte)(c1 << 2)); //0b11110000: -16(c1*4)
		System.out.println(Integer.toBinaryString(c1 << 2));
		System.out.println((byte)(c1 >>> 2)); //0b11111111: -1
		
		//三元運算子
		
		int discount = 21; //21 % off
//		if(discount%10 == 0) {
//			System.out.println((100-discount)/10 + "折");
//		}else {
//			System.out.println((100-discount) + "折");
//		}
		
		System.out.println((discount%10 == 0?(100-discount)/10:(100-discount)) + "折");		
	}
}