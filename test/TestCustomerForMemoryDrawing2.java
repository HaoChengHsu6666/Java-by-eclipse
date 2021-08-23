package uuu.etgt.test;

import java.time.LocalDate;

import uuu.etgt.entity.Customer;

public class TestCustomerForMemoryDrawing2{	
	public static void main(String[] args) {		
		int i;
		i = 1;
		int j = i;
		i++;
		System.out.println(i);//2
		System.out.println(j);//1
		
		Customer customer = new Customer();
		//customer.id = new String("A123456789");
		customer.setId(new String("A123456789"));
		//customer.password = "asdf1234";
		customer.setPassword("asdf1234");
		customer.setName("狄會貴");
		customer.setGender("M".charAt(0));
		customer.setBirthday(LocalDate.of(2020,10,3));		
		customer.setBirthday(LocalDate.parse("2000-10-03"));
		customer.setEmail("test01@uuu.com.tw");			
	
		System.out.println("*****以下為customer物件的內容:*****");
		//System.out.println(customer.id);//A123456789
		System.out.println(customer.getId());//A123456789
		//System.out.println(customer.password);//asdf1234
		System.out.println(customer.getPassword());//asdf1234
		System.out.println(customer.getName());//狄會貴
		System.out.println(customer.getGender());//
		System.out.println(customer.getBirthday());//2000-10-13
		System.out.println(customer.getEmail());//test01@uuu.com.tw
		System.out.println(customer.getAddress());//
		System.out.println(customer.getPhone());	 //null
		System.out.println(customer.isSubscribed());//false
		System.out.println(customer);
		
		System.out.println("*****以下為customer 2 物件的內容:*****");
		
		//Customer customer2 = customer;	//沒有建立新的物件，與customer參考到同一個物件
		
		Customer customer2 = new Customer();//建立新的物件
		//customer2.name = customer.name; 			
		//customer2.gender = customer.gender;		
		//customer2.password = customer.password; 			
		//customer2.birthday = customer.birthday; 			
		//customer2.address = customer.address;		
		//customer2.phone = customer.phone;		
		//customer2.subscribed = customer.subscribed; 			
		
		//customer2.id = "A123123123";
		customer2.setId("A223456781");
		customer2.setName("Mary");
		customer2.setGender('H');
		customer2.setEmail("test02@uuu.com.tw");
		//System.out.println(customer2.id);//A123123123
		System.out.println(customer2.getId());//A223456781
		//System.out.println(customer2.password);//asdf1234
		System.out.println(customer2.getPassword());
		System.out.println(customer2.getName());//狄會貴
		System.out.println(customer2.getGender());//
		System.out.println(customer2.getBirthday());//2000-10-13
		System.out.println(customer2.getEmail());//test02@uuu.com.tw
		System.out.println(customer2.getAddress());//
		System.out.println(customer2.getPhone());	 //
		System.out.println(customer2.isSubscribed());//false
		System.out.println(customer2);
		
		System.out.println("*****以下為customer物件的內容:*****");
		//System.out.println(customer.id);//A123456789
		System.out.println(customer.getId());//A223456781
		//System.out.println(customer.password);//asdf1234
		System.out.println(customer.getPassword());//asdf1234
		System.out.println(customer.getName());//狄會貴
		System.out.println(customer.getGender());//
		System.out.println(customer.getBirthday());//2000-10-13
		System.out.println(customer.getEmail());//test01@uuu.com.tw
		System.out.println(customer.getAddress());//
		System.out.println(customer.getPhone());	 //null
		System.out.println(customer.isSubscribed());//false
		System.out.println(customer);
	}
}