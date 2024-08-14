package demo;

public class Employee {
	int empId;
	String empName;
	int empsalary;
	String email;
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, int salary, String email) {
		// TODO Auto-generated constructor stub
		this.empId = empId;
		this.empName =empName;
		this.empsalary = salary;
		this.email = email;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return empsalary;
	}

	public void setSalary(int salary) {
		this.empsalary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Emolyee [empId=" + empId + ", salary=" + empsalary + ", empName=" + empName + ", email=" + email + "]";
	}
	
}
