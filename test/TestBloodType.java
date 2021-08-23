//package uuu.etgt.test;
//
//import java.text.NumberFormat;
//import java.util.Locale;
//
//import uuu.etgt.entity.BloodType;
//import uuu.etgt.entity.Customer;
//
//public class TestBloodType {
//	public static void main(String[] args) {
//		Customer c = new Customer();
//		c.setId("A123456789");
//		c.setName("狄會貴");
//		c.setBloodType(BloodType.AB);
//		System.out.println(c.getBloodType());
//		
//		System.out.println(BloodType.O);
//		System.out.println(BloodType.O.name());
//		System.out.println(BloodType.O.ordinal());
//
//		System.out.println(BloodType.A);
//		System.out.println(BloodType.A.name());
//		System.out.println(BloodType.A.ordinal());
//	
//		System.out.println(BloodType.B);
//		System.out.println(BloodType.B.name());
//		System.out.println(BloodType.B.ordinal());
//
//		System.out.println(BloodType.AB);
//		System.out.println(BloodType.AB.name());
//		System.out.println(BloodType.AB.ordinal());		
//		
//		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
//		nf.setMaximumFractionDigits(4);
//		System.out.println(nf.format(5.17654321));
//		System.out.println(nf.getClass().getName());
//		
//		
//		
//	}
//}
