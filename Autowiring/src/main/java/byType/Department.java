package byType;

public class Department {
	private String name;

	@Override
	public String toString() {
		return "Department [Department_name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
