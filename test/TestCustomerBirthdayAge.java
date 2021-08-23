package uuu.etgt.test;

import java.time.LocalDate;

import uuu.etgt.entity.Customer;

public class TestCustomerBirthdayAge {

	public static void main(String[] args) {
		//LocalDate.now()
		//LocalDate.of(2000,3,5)
		//LocalDate.parse("2000-01-15")
		Customer c = new Customer();
		
		//c.id="A123123123";
		c.setId(new String("A123123123"));
		c.setName("John");
		
		c.setBirthday(LocalDate.parse("1989-05-15"));
		
		//計算Customer物件c的年齡
//		if(c.birthday!=null) {
//			int thisYear = LocalDate.now().getYear();
//			//System.out.println(thisYear);		
//			int birthYear = c.birthday.getYear();
//			//System.out.println(birthYear);
//			int age = thisYear-birthYear;
//			System.out.println(age + "歲");
//		}else {
//			System.out.println("沒有客戶c的生日，無法計算年齡");			
//		}
		
		System.out.println(c.getAge() + "歲");
		
		//return;
	}

}
