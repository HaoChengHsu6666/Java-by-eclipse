package uuu.etgt.test;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

import uuu.etgt.entity.Customer;

public class TestCustomer{	
	public static void main(String[] args) {
		int i=Integer.parseInt("1");
		byte a = 1;
		System.out.println(a);
		Customer customer =  null;
		if(true) {
			customer = new Customer();

			//customer.id=new String("A123123123");
			customer.setId("A123123123");
			//customer.password = "1234";
			customer.setPassword("asdf1234");
			customer.setName("狄會貴");
			customer.setGender(Customer.MALE);
			//customer.setGender('M');
			//Date d = new  GregorianCalendar(1999,7,5).getTime();
			//System.out.println(d);
			//customer.birthday = LocalDate.of(20000,1,24);
			customer.setBirthday(LocalDate.now());  //錯誤的日期
			customer.setBirthday(2012,1,16);		//錯誤的日期	
			customer.setBirthday("2000-01-16");
			customer.setEmail("test01@uuu.com.tw");			
		
			//System.out.println(customer.id);//
//			System.out.println(customer.getId());
//			//System.out.println(customer.password);//1234
//			System.out.println(customer.getPassword());//1234
//			System.out.println(customer.getName());//狄會貴
//			System.out.println(customer.getGender());//M
//			System.out.println(customer.getBirthday());//2021-04-12
//			System.out.println(customer.getEmail());//test01@uuu.com.tw
//			System.out.println(customer.getAddress());//
//			System.out.println(customer.getPhone());//
//			System.out.println(customer.isSubscribed());//false
//			System.out.println(customer.getAge()+"歲");
			System.out.println(customer);
		}
		i = 1;
		System.out.println(i);
	}
}