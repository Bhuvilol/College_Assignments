
class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
}
class Employee extends Person{
	int eid;
	double salary;
	Employee(String name,int age, int eid, double salary) {
		super(name, age);
		this.eid = eid;
		this.salary= salary;
	}
	void empDisplay() {

		System.out.println("Employee Id : "+eid);
		System.out.println("Employer's name : "+name);
		System.out.println("Employer's age : "+age);
		System.out.println("In hand Salary of "+name+" : "+salary);
	}
}
public class Q5 {

	public static void main(String[] args) {

		System.out.println("Details of employee :");
		Employee e1 = new Employee("Bhabesh", 21, 23412101, 70000);
		e1.empDisplay();
	}

}










//output
// Details of employee :
// Employee Id : 23412101
// Employer's name : Bhabesh
// Employer's age : 21
// In hand Salary of Bhabesh : 70000.0
