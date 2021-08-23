package uuu.etgt.test;

import java.time.LocalDate;

import uuu.etgt.entity.Customer;
import uuu.etgt.entity.Outlet;
import uuu.etgt.entity.Product;
import uuu.etgt.entity.VIP;

public class TestEqualOperator {

	public static void main(String[] args) {
		System.out.println("1==1.0: "+(1==1.0)); //true
		System.out.println(true==false); //false
		
		//參考型別String物件的==
		System.out.println("Hello" == "Hello"); //true
		System.out.println("Hello" == new String("Hello")); //false
		System.out.println("\"Hello\".equals(new String(\"Hello\")): " +
								"Hello".equals(new String("Hello")));//true
		
		//參考型別LocalDate物件的==
		System.out.println(
				LocalDate.parse("2000-12-05")==LocalDate.of(2000, 12, 5)); //false
		System.out.println(
				LocalDate.parse("2000-12-05").equals(LocalDate.of(2000, 12, 5))); //true

		
		//參考型別Customer物件的==
		Customer c = new Customer();
		//c.id="A123456789";
		c.setId("A123456789");
		c.setName("狄會貴");
		//c.password="asdf1234";
		c.setPassword("asdf1234");
		c.setGender('M');
		c.setEmail("test01@uuu.com.tw");
		c.setBirthday(LocalDate.parse("2000-12-05"));
		
		Customer c1 = new Customer();
		//c1.id="A123456789";
		c1.setId(new String("A123456789"));
		c1.setName("狄會貴");
		//c1.password="asdf1234";
		c1.setPassword("asdf1234");
		c1.setGender('M');
		c1.setEmail("test01@uuu.com.tw");
		c1.setBirthday(LocalDate.parse("2000-10-05"));
		
		System.out.println(c==c1); //false	
		System.out.println("c.equals(c1): " + c.equals(c1)); //true
		//System.out.println(c.birthday=="2000-12-01"); //無法編譯
		c1 = c;
		
		System.out.println(c==c1); //true
		System.out.println("c.equals(c1): " + c.equals(c1)); //true		
		
		VIP v = new VIP();
		v.setId("A123456789");
		
		System.out.println(c1==v); //false
		System.out.println("c1.equals(v): " + c1.equals(v)); //true
		System.out.println(c1==v); //false
		System.out.println("v.equals(c1): " + v.equals(c1)); //true
		
		Product p = new Product();	
		p.setId(1);
		p.setName("極速開發Java大型系統：Spring Boot又輕又快又好學");
		p.setUnitPrice(880);
		p.setStock(12);
		
		Product p2 = new Product();	
		p2.setId(1);
		p2.setName("極速開發Java大型系統：Spring Boot又輕又快又好學");
		p2.setUnitPrice(880);
		p2.setStock(12);
		
		System.out.println(p==p2); //false
		System.out.println(p.equals(p2)); //true
		
		Outlet outlet = new Outlet();
		outlet.setId(1);
		outlet.setName("極速開發Java大型系統：Spring Boot又輕又快又好學");
		outlet.setUnitPrice(880);
		outlet.setStock(12);
		outlet.setDiscount(21);
		System.out.println(p==outlet); //false
		System.out.println(p.equals(outlet)); //false

		Outlet outlet1 = new Outlet();
		outlet1.setId(1);
		outlet1.setName("極速開發Java大型系統：Spring Boot又輕又快又好學");
		outlet1.setUnitPrice(880);
		outlet1.setStock(12);
		outlet1.setDiscount(21);
		System.out.println(outlet==outlet1); //false
		System.out.println(outlet.equals(outlet1)); //true
		System.out.println(outlet.hashCode());
	}
//	
//	public static String test() {
//		return "Hello";
//	}
}
