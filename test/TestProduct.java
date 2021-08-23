package uuu.etgt.test;

import java.time.LocalDate;

import uuu.etgt.entity.Product;

public class TestProduct {

	public static void main(String[] args) {
		Product p = new Product();		
		System.out.println(Product.class.getName());
//		System.out.println("p.getId():"+p.getId());//0
//		System.out.println("p.getName():"+p.getName());//null
//		System.out.println(p.getUnitPrice());//0.0
//		System.out.println(p.getStock());//0
//		System.out.println(p.getDescription());//
//		System.out.println(p.getPhotoUrl());//null
//		System.out.println(p.getShelfDate());//null
		System.out.println("p:" + p);
		System.out.println("Hello".toString());
		System.out.println(LocalDate.now().plusYears(10000).toString());
		
		p.setId(1);
		p.setName("極速開發Java大型系統：Spring Boot又輕又快又好學");
		p.setUnitPrice(880);
		p.setStock(12);
		
		Product p1 = new Product(1,
			"極速開發Java大型系統：Spring Boot又輕又快又好學",
			880, 12);
		//System.out.println("p1.getId():"+p1.getId());//1
		//System.out.println("p1.getName():"+p1.getName());//極速開發Java大型系統：Spring Boot又輕又快又好學
		//System.out.println(p1.getUnitPrice());//880.0
//		System.out.println(p1.getStock());//0
//		System.out.println(p1.getDescription());//
//		System.out.println(p1.getPhotoUrl());//null
//		System.out.println(p1.getShelfDate());//null
		System.out.println("p1:" + p1);
		
		Product p2 = new Product(2,
				"Java最強入門邁向頂尖高手之路：王者歸來(第二版)全彩版",1000);
		System.out.println(p2.getId());//2
		System.out.println(p2.getName());//Java最強入門邁向頂尖高手之路：王者歸來(第二版)全彩版
		System.out.println(p2.getUnitPrice());//1000.0
		System.out.println(p2.getStock());//0
		System.out.println(p2.getDescription());//null
		System.out.println(p2.getPhotoUrl());//null
		System.out.println(p2.getShelfDate());//null

	}

}
