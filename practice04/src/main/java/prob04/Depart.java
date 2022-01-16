package prob04;

import javax.management.remote.SubjectDelegationPermission;

public class Depart extends Employee {
	
	private String department;		// 부서 

	public Depart(String name, int salary, String department) {
		setName(name);
		super.setSalary(salary);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void getInformation() {
		System.out.println( "이름:" + getName() + " 연봉:" + getSalary() + " 부서:" + department );
	}
	
	
}
