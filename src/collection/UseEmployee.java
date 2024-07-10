package collection;
import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		Employee employee1=new Employee("ashok",12,"executive",80000,"male");
		Employee employee2=new Employee("arun",13,"developer",90000,"male");
		Employee employee3=new Employee("vijay",15,"developer",70000,"male");
		Employee employee4=new Employee("jeeva",15,"executive",800000,"male");
		Employee employee5=new Employee("nisha",16,"developer",100000,"female");
		Employee employee6=new Employee("oviya",17,"executive",60000,"female");
		ArrayList<Employee>employees=new ArrayList<>();
		ArrayList<Employee>highsalary=new ArrayList<>();
	        employees.add(employee1);
	        employees.add(employee2);
	        employees.add(employee3);
	        employees.add(employee4);
	        employees.add(employee5);
	        employees.add(employee6);
	        for(int i=employees.size()-1;i>=0;i--) {
	        	System.out.println(employees.get(i));
	        }
	        employees.forEach(e->{if(e.getRole().equals("developer")&&e.getGender().equals("male")) {
	        	System.out.println("Details : "+e);
	        	
	        }
	        }
	        	);
	        
	        employees.forEach(e->{if(e.getSalary()>70000) {
	        	highsalary.add(e);
	        
	        
	        }
	        
	    });
	        highsalary.forEach(e->{ {
	        	highsalary.add(e);
	        
	        
	        }
	        
	    });
	}
}
		
	
	


class Employee{
	private String name;
	private int id ;
	private String role;
	private int salary;
	private String gender;
	public Employee(String name, int id, String role, int salary, String gender) {
		super();
		this.name = name;
		this.id = id;
		this.role = role;
		this.salary = salary;
		this.gender = gender;
	}
	
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", role=" + role + ", salary=" + salary + ", gender=" + gender
				+ "]";
	}
}
