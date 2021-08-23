package uuu.etgt.test;

import uuu.etgt.entity.Customer;
import uuu.etgt.entity.VIP;

public class TestVIP {

	public static void main(String[] args) {
		VIP vip = new VIP("A223456781", "asdf1234", "林梅莉");
		
		//vip.setId("A223456781");
		System.out.println(vip.getId());		
		//vip.setName("林梅莉");
		vip.setBirthday(2000, 10, 10);
		System.out.println(vip.getName());
		
		vip.setDiscount(10);
		System.out.println(vip.getDiscount());
		System.out.println(vip);
		
		System.out.println(((Customer)vip).checkId("test"));
	}

}
