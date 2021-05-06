
public class Employee {

	
	  String name;
	  int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee(String name, int id) {
		super();
		this.name=name;
		this.id = id;
	}
	  
}

class Abc{
	
	void m1(Employee emp) {
		System.out.println("Emp");
	}
	void m1(Object obj) {
		System.out.println("Object");
	}
	

}
