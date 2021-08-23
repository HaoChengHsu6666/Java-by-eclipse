package uuu.etgt.test;

import java.util.List;

import uuu.etgt.entity.Customer;
import uuu.etgt.entity.Order;
import uuu.etgt.exception.ETGTException;
import uuu.etgt.service.CustomerService;
import uuu.etgt.service.OrderService;

public class TestOrderService_getOrderHistory {

	public static void main(String[] args) {
		CustomerService cService = new CustomerService();
	
		Customer member;
		try {
			member = cService.login("A123456798", "aaa9487");
			
			OrderService oService = new OrderService();
			List<Order> list = oService.getOrderHistory(member.getId());
			System.out.println(list);
		}catch (ETGTException e) {
			e.printStackTrace();
		}
	}	

}
