package uuu.etgt.test;

import java.time.LocalDate;

import uuu.etgt.entity.Customer;

public class TestCustomerForMemoryDrawing{	
	public static void main(String[] args) {
		System.out.println(args.length);
		int i;
		i = 1;
		int j = i;
		i++;
		System.out.println(i);//2
		System.out.println(j);//1
		
		Customer customer = new Customer();
		//customer.id = new String("A123456789");
		customer.setId("A123456789");
		//customer.password = "asdf1234";
		customer.setPassword("asdf1234");
		customer.setName("狄會貴");
		customer.setGender("M".charAt(0));
		customer.setBirthday(LocalDate.parse("2000-10-13"));		
		customer.setEmail("test01@uuu.com.tw");			
	
		//System.out.println(customer.id);//A123456789
		System.out.println(customer.getId());//A123456789
		//System.out.println(customer.password);
		System.out.println(customer.getPassword());//asdf1234
		System.out.println(customer.getName());//狄會貴
		System.out.println(customer.getGender());//
		System.out.println(customer.getBirthday());//null
		System.out.println(customer.getEmail());//test01@uuu.com.tw
		System.out.println(customer.getAddress());//
		System.out.println(customer.getPhone());	 //null
		System.out.println(customer.isSubscribed());//false
		System.out.println(customer.getAge());//21
		System.out.println(customer);
		
	}
}