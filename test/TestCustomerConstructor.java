package uuu.etgt.test;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

import uuu.etgt.entity.Customer;

public class TestCustomerConstructor{	
	public static void main(String[] args) {
		int i=Integer.parseInt("1");
		byte a = 1;
		System.out.println(a);
		Customer customer =  null;
		if(true) {
			customer = new Customer("A123123123","asdf1234","狄會貴");
//			customer = new Customer("A123123123","asdf1234",
//					"狄會貴", 'M', 
//					LocalDate.of(2002,1,15),"test01@uuu.com.tw");

			//customer.id=new String("A123123123");
			//customer.setGender("M".charAt(0));
			//Date d = new  GregorianCalendar(1999,7,5).getTime();
			//System.out.println(d);
			//customer.birthday = LocalDate.of(20000,1,24);
			//customer.setBirthday(LocalDate.now());
			//customer.setBirthday(2012,1,16);			
			//customer.setBirthday("2000-01-16");
			//customer.setEmail("test01@uuu.com.tw");			
		
			//System.out.println(customer.id);//
			System.out.println("id:"+customer.getId());
			//System.out.println(customer.password);//1234
			System.out.println("密碼:"+customer.getPassword());//1234
			System.out.println("姓名:"+customer.getName());//狄會貴
			System.out.println(customer.getGender());//M
			System.out.println(customer.getBirthday());//2021-04-12
			System.out.println(customer.getEmail());//test01@uuu.com.tw
			System.out.println(customer.getAddress());//
			System.out.println(customer.getPhone());//
			System.out.println(customer.isSubscribed());//false
			System.out.println(customer.getAge()+"歲");
		}
		i = 1;
		System.out.println(i);
	}
}