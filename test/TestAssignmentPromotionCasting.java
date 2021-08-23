package uuu.etgt.test;

public class TestAssignmentPromotionCasting {
	public static void main(String[] args) {
		byte c = 1;
		int i = 100;
		char a = 'a';
		short s = 2300;
		boolean b = true;
		//i = (int)b; //boolean無法指派給其他型別
		//b = (boolean)i; //其他型別無法指派給boolean
		
		i = a; //'a': 97
		System.out.println(i);//i
		System.out.println(a);//i
		
		i = 70000;
		a = (char)(i+1); //70001
		System.out.println((int)a);
		
		long l = 12000L;
		
		a = (char)s;
		a = (char)c;
		
		long m = (long)1f;
	}

}
