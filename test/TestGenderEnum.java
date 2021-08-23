package uuu.etgt.test;

import uuu.etgt.entity.Gender;

public class TestGenderEnum {

	public static void main(String[] args) {

//		System.out.println(Gender.MALE.toString());//MALE
//		System.out.println(Gender.MALE.ordinal());//0
//		System.out.println(Gender.MALE.name());//MALE
//		System.out.println(Gender.MALE.getCode());//F
		
		System.out.println(Gender.values().length);
		for(int i=0;i<Gender.values().length;i++) {
			System.out.println(Gender.values()[i].toString());//MALE
			System.out.println(Gender.values()[i].ordinal());//0
			System.out.println(Gender.values()[i].name());//MALE
			System.out.println(Gender.values()[i].getCode());//F

		}
	
	}

}
