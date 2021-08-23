package uuu.etgt.test;

import java.util.logging.Level;
import java.util.logging.Logger;

//import uuu.etgt.entity.BloodType;
import uuu.etgt.entity.Customer;
import uuu.etgt.exception.ETGTDataInvalidException;
import uuu.etgt.exception.ETGTException;
import uuu.etgt.service.CustomerService;

public class TestCustomerService_update {

	public static void main(String[] args) {
		CustomerService service = new CustomerService();
		
		try {
			Customer c = service.login("A123456798","aaa9487");
			System.out.println(c);
			
			c.setName("普通豬血糕");
			c.setBirthday("1990-05-12");
			c.setAddress("嘉義市中正路11號");
			c.setPhone("0987587587");
		    service.modify(c);
		    System.out.println("*****修改後*****");
			Customer c2 = service.login("A123456798","aaa9487");
			System.out.println(c2);
		} catch(ETGTException e) {
			Logger.getLogger("呈現詳細的錯誤訊息").log(Level.SEVERE, 
					e.getMessage(),e);
		} catch(ETGTDataInvalidException e) {
			System.err.println(e.getMessage());
		}
	}
}
