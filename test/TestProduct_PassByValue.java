package uuu.etgt.test;

import uuu.etgt.entity.Product;

public class TestProduct_PassByValue {

	public static void main(String[] args) {
		Product p = new Product(1,
				"極速開發Java大型系統：Spring Boot又輕又快又好學", 880,12);
		p.setDescription("Java煩 ! Spring更煩 !!\r\n"
				+ "當所有Java工程師看到Python、PHP、Ruby這種輕量化語言佈建的高效快速時，\n"
				+ "深怕自己選擇了程式語言。但Spring Boot的出現，讓Java工程師重拾信心，\n"
				+ "數分鐘即建好框架，直接讀取SQL、NoSQL，充分利用ORM的特性，讓Java換上輕盈的腳步，\n"
				+ "讓你自由自在用Spring Boot完成各種大型專案。\n"
				+ "本書最大的重點就是實戰。");
		p.setPhotoUrl("https://im1.book.com.tw/image/getImage?i=https://www.books.com.tw/img/001/087/85/0010878538.jpg&w=187&h=187&v=5fce042f");
		p.setShelfDate("2020/12/21");
		p.setShelfDate((String)null);
		
		System.out.println(p.getId());//1
		System.out.println(p.getName()); //極速開發Java大型系...
		System.out.println(p.getUnitPrice());//880
		System.out.println(p.getStock());//12
		System.out.println(p.getDescription());//
		System.out.println(p.getPhotoUrl());//
		System.out.println(p.getShelfDate());
	}

}
