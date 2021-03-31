package byName;

import java.util.List;

public class Employee {
	private List<String> names;

	@Override
	public String toString() {
		return "Employee [names=" + names + "]";
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}
}
