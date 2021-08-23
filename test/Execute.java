package uuu.etgt.test;

class Person{
	String name="anonymity";
	public Person(String n) {name=n;}
}
class Employee extends Person{
	String empID="E00";
	public Employee(String id){super(id);}
	//public Employee(String id){super(id);}
}
public class Execute {
	public static void main(String[] args) {
		Employee em = new Employee("E01");
		System.out.println(em.empID);
		System.out.println(em.name);
	}
}
