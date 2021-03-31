package byName;

import java.util.List;

public class Department {
	private String Dept_name;
	private List<Employee> details;





	@Override
	public String toString() {
		return "Department [Department_name=" + Dept_name + ", details=" + details + "]";
	}

	public List<Employee> getDetails() {
		return details;
	}

	public void setDetails(List<Employee> details) {
		this.details = details;
	}

	public String getDept_name() {
		return Dept_name;
	}

	public void setDept_name(String dept_name) {
		Dept_name = dept_name;
	}

}
