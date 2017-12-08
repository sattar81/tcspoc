package tcs.com;

public class EmployeeDetails {
	String name,Address,empNum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmpNum() {
		return empNum;
	}

	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}

	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		
		return "Name:"+name+" EmpNum:"+empNum+" Address:"+Address;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 

	}

}
