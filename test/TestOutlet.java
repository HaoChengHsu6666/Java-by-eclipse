package uuu.etgt.test;

import uuu.etgt.entity.Outlet;

public class TestOutlet {

	public static void main(String[] args) {
		int i = 1;
		char k='k';
		Outlet outlet = new Outlet();
		outlet.setId(1);
		outlet.setName("Java最強入門邁向頂尖高手之路：王者歸來(第二版)全彩版");
		outlet.setUnitPrice(1000);//指派定價
		outlet.setDiscount(21); 
		outlet.setStock(10);
		
		//Object
		outlet.setPhotoUrl("https://im1.book.com.tw/image/getImage?"
				+ "i=https://www.books.com.tw/img/001/087/31/0010873110.jpg"
				+ "&v=5f7c475b&w=140&h=140");
		outlet.setDescription("本書講解完整的Java內容，共有32個章節，"
				+ "以約407張彩色圖解說明，677個彩色程式實例，講解了下列知識：\n"
				+ "□完整解說物件導向程式設計\n□類別與物件□物件建構與封裝\n□繼承與多形\n"
				+ "□程式異常處理...\n");
		outlet.setShelfDate("2020-10-15");

		//outlet = null;
		
//		System.out.println(outlet.getId());//2
//		System.out.println(outlet.getName());//Java最強入門邁向頂尖高手之路：王者歸來(第二版)全彩版
//		System.out.println(outlet.getUnitPrice());//售價:790
//		System.out.println(outlet.getStock());//10
//		System.out.println(outlet.getDescription());//這本Java書將是國內講...
//		System.out.println(outlet.getPhotoUrl());//https://...
//		System.out.println(outlet.getShelfDate());//2020-10-15
//		System.out.println(outlet.getDiscount());//折扣21% off
//		System.out.println(outlet.getDiscountString());//79折
//		System.out.println(outlet.getListPrice());//查定價
		System.out.println(outlet);
	}

}
