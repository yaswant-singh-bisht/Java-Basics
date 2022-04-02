package javaBasicsInheritance;
//If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.

class Address {
	String address1, city, state, country;

	public Address(String address1, String city, String state, String country) {
		this.address1 = address1;
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

class Employee {
	int id; 
	String name; 
	Address address;

	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		System.out.println(id + ", " + name + ", " + address.address1 + ", " + address.city + ", " + address.state + ", " + address.country);
	}
}

public class AggregationClass {
	public static void main(String[] args) {
		Address add1 = new Address("1919 gallows rd ste 400", "Vienna", "Virginia", "United States");
		Address add2 = new Address("228 Park Ave S", "New Rochelle", "New York", "United States");
		
		Employee emp1 = new Employee(3056, "Yaswant Bisht", add1);
		Employee emp2 = new Employee(2175, "Vipul Himanshu", add2);
		
		emp1.display();
		emp2.display();
		
	}

}
