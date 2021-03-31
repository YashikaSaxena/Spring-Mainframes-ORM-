package byType;

public class Employee {
	private String Emp_name;
	private Department dept;

	@Override
	public String toString() {
		return "Employee [Emp_name=" + Emp_name + ", dept=" + dept + "]";
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}


	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}


}
