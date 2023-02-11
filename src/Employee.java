import java.io.Serializable;

public class Employee implements Serializable{
	private String name;
	private int empID;
	private long CNIC;
	private String designation ,department;
	
	public Employee(String name, int empID, long CNIC, String designation, String department) {
		this.name = name;
		this.empID = empID;
		this.CNIC = CNIC;
		this.designation = designation;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public long getCNIC() {
		return CNIC;
	}
	public void setCNIC(long cNIC) {
		CNIC = cNIC;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empID=" + empID + ", CNIC=" + CNIC + ", designation=" + designation
				+ ", department=" + department + "]";
	}
}
