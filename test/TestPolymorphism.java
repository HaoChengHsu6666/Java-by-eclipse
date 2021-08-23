package uuu.etgt.test;

import java.time.LocalDate;

import uuu.etgt.entity.Customer;
import uuu.etgt.entity.Product;
import uuu.etgt.entity.VIP;

public class TestPolymorphism {
	public static void main(String[] args) {
		
		Customer c = new VIP();
		c.setId("A123456789");
		c.setName("狄會貴");
		System.out.println(c.toString());
		if(c instanceof VIP) {
			((VIP)c).setDiscount(10);
			System.out.println(((VIP)c).getDiscountString());
		}
		
		Object s = "Hello"; //()"Hello";//polymorphism declaration
		String str = new String("Hello"); //normal declaration
		
		//System.out.println(s.length());//compile-time error
		int i = 1;		
		
		if(s instanceof String) {
			String s1 = (String)s;//將s轉型為String s1
			System.out.println(s1.length());//轉型為String後才能使用s1.length()來讀取長度為5			
			
			System.out.println(((String)s).length());
		}
				
		System.out.println(str.length());//5
		
		System.out.println(s.toString());//Hello
		System.out.println(str.toString()); //Hello
		
		
		s = LocalDate.of(0, 1, 10);//西元前1年1月10號(iso 8601)
		LocalDate date1 = LocalDate.of(0, 1, 10);//西元前1年1月10號
		if(s instanceof LocalDate) {
			System.out.println(((LocalDate)s).getYear());
		}
		
		System.out.println(date1.getYear());
		
	}

}
