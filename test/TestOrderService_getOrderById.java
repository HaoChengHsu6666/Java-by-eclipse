package uuu.etgt.test;

import java.util.List;

import uuu.etgt.entity.Customer;
import uuu.etgt.entity.Order;
import uuu.etgt.exception.ETGTException;
import uuu.etgt.service.CustomerService;
import uuu.etgt.service.OrderService;

public class TestOrderService_getOrderById {

	public static void main(String[] args) {
		
		CustomerService cService = new CustomerService();
		OrderService oService = new OrderService();
		
			Customer member;
			try {
				member = cService.login("M207912668", "mmm9487");
				Order order = oService.getOrderById("39", member);
				System.out.println(order);
			} catch (ETGTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
