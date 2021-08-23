package uuu.etgt.test;

import uuu.etgt.entity.Product;
import uuu.etgt.exception.ETGTException;
import uuu.etgt.service.ProductService;
	

public class TestProductService_getRealTimeStock {
	public static void main(String[] args) {
	
	ProductService pService = new ProductService();

	Product p1;

	try {
		p1 = pService.getProductById("1");
		Product p14 = pService.getProductById("14");
		Product p11 = pService.getProductById("11");
		Product p7 = pService.getProductById("7");
		
		System.out.println(p1.getName()+"庫存:"+pService.getRealTimeStock(p1, null, null));
		
		System.out.println(p14.getName()+","+p14.getFlavorList().get(2).getFlavorName()
				+"庫存:"+pService.getRealTimeStock(p14, p14.getFlavorList().get(2), null));
		
		System.out.println(p11.getName()+","+p14.getFlavorList().get(0).getFlavorName()
				+"M庫存:"+pService.getRealTimeStock(p14, p14.getFlavorList().get(0), "M"));

		System.out.println(p7.getName()+","+p14.getFlavorList().get(0).getFlavorName()
				+"M庫存:"+pService.getRealTimeStock(p14, p14.getFlavorList().get(0), "M"));
		
	}catch(ETGTException e) {
		e.printStackTrace();
	}
 }
}
