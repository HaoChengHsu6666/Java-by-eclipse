package uuu.etgt.test;

import java.util.logging.Level;
import java.util.logging.Logger;

//import uuu.etgt.entity.BloodType;
import uuu.etgt.entity.Customer;
import uuu.etgt.exception.ETGTDataInvalidException;
import uuu.etgt.exception.ETGTException;
import uuu.etgt.service.CustomerService;

public class TestCustomerService_register {

	public static void main(String[] args) {
		Customer c = new Customer();
		try {
			c.setId("A123456707");
			c.setPassword("asdf1234");
			c.setName("朱雪");
			c.setGender(Customer.MALE);
			c.setEmail("test081@uuu.com.tw");
			c.setBirthday("2000-05-12");
			c.setAddress("台北市復興北路101號3F");
			c.setPhone("0987654888");
			c.setSubscribed(true);
//			c.setBloodType(BloodType.A);
			
			CustomerService service = new CustomerService();
				service.register(c);
			
			Customer c2 = service.login("A123456707", "asdf1234");
			System.out.println(c2);
		} catch(ETGTException e) {
			Logger.getLogger("呈現詳細的錯誤訊息").log(Level.SEVERE, 
					e.getMessage(),e);
		} catch(ETGTDataInvalidException e) {
			System.err.println(e.getMessage());
		}
	}
}
