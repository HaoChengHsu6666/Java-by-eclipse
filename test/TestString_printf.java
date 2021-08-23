package uuu.etgt.test;

import java.time.LocalDate;

public class TestString_printf {
	
	public static final char MALE='M';
	public static final char FEMALE='F'; 
	public static void main(String[] args) {
		String dateString = null;
		
		if(dateString!=null && dateString.length()>0) {
			LocalDate date = LocalDate.parse(dateString);
			System.out.println(date);
		}else{
			System.err.println("生日字串不得為null或空字串:" + dateString);
		}
		System.out.println(dateString!=null?"dateString長度為"+dateString.length()
										   :"dateString為null");
		char gender = 'N';
		if (gender == MALE || gender == FEMALE) {
			System.out.println("客戶性別為:"+gender);
		} else {
			System.err.printf("性別資料不正確:%s，必須%s(男),%s(女)\n",gender,MALE,FEMALE);
			// TODO:第13章 改成 throw exception
		}
		System.out.println("The End");
	}

}
