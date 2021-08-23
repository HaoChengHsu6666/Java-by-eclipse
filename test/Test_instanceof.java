package uuu.etgt.test;

import uuu.etgt.entity.Customer;
import uuu.etgt.entity.VIP;

public class Test_instanceof {

	public static void main(String[] args) {
		Object o = new Object();
		Customer c = new Customer();
		VIP vip = new VIP();
		
		System.out.println(o instanceof Object); //true
		System.out.println(c instanceof Object); //true
		System.out.println(vip instanceof Object); //true
		
		System.out.println(o instanceof Customer); //false
		System.out.println(c instanceof Customer); //true
		System.out.println(vip instanceof Customer); //true
		
		System.out.println(o instanceof VIP); //false
		System.out.println(c instanceof VIP); //false
		System.out.println(vip instanceof VIP); //true

	}

}
