package uuu.etgt.test;

import uuu.etgt.entity.Product;
import uuu.etgt.service.ProductService;

public class TestProduct_PassByValue2 {

	public static void main(String[] args) {
		Product p = new Product();		
		System.out.println(p.getId());//1
		System.out.println(p.getName()); //極速開發Java大型系...
		System.out.println(p.getUnitPrice());//880
		System.out.println(p.getStock());//12
		System.out.println(p.getDescription());//
		System.out.println(p.getPhotoUrl());//null
		System.out.println(p.getShelfDate());//null
		
		ProductService service = new ProductService();
		service.addPrice(p.getUnitPrice());
		
		System.out.println(p.getUnitPrice()); //880
		
		service.addPrice(p);
		//p.setUnitPrice(newPrice);
		
		System.out.println(p.getUnitPrice()); //890		
	}
}
