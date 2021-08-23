package uuu.etgt.test;

import java.util.Iterator;

class Animal{
	public void bark() {System.out.println("叫");}
}

class Dog extends Animal{
	public void bark() {System.out.println("汪");}
}

class Cat extends Animal{
	public void bark() {System.out.println("喵");}
}


public class TryBark {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[2];
		animals[0] = new Dog();
		animals[1] = new Cat();
				for(int i=0 ; i<animals.length; i++) {
					animals[i].bark();
				}
	}

}
