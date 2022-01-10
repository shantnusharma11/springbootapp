package user.department.sprinboot.user.customer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String gender;
	private int age;
	private String food;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getFood() {
		return food;
	}


	public void setFood(String food) {
		this.food = food;
	}


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(Long  id, String name, String gender, int age, String food) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.food = food;
	}
	public Customer(int i, String string, int j, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}


}
