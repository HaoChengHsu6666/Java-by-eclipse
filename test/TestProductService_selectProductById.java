package uuu.etgt.test;

import java.util.List;

import uuu.etgt.entity.Product;
import uuu.etgt.exception.ETGTException;
import uuu.etgt.service.ProductService;

public class TestProductService_selectProductById {

	public static void main(String[] args) {
		ProductService service = new ProductService();
		try {
//			List<Product> list = service.getAllProducts();
//			System.out.println(list);
			
			System.out.println(
			   service.getProductById("7"));
		} catch (ETGTException e) {			
			e.printStackTrace();
		}		
	}
}
