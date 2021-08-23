package uuu.etgt.test;

import java.util.logging.Level;
import java.util.logging.Logger;

import uuu.etgt.exception.ETGTException;
import uuu.etgt.service.CustomerService;

public class TestCustomerService_login {
	public static void main(String[] args) {
		CustomerService service = new CustomerService();
		//Customer c = service.login(null, null);
		//Customer c = service.login("A123456789", null);
		try {
			System.out.println(service.login("A123456798", "AAA9487"));
		}catch(ETGTException e) {			
			Logger.getLogger("詳細的錯誤呈現").log(Level.SEVERE, e.getMessage(),e);			
			//Servlet中是寫成:
			//this.log(e.getMessage(), e);
		}
		
		System.out.println("The End");
	}
}
