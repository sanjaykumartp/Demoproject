package com.estuate;

import javax.persistence.*;

@Entity //Schema

@Table (name = "employee") //Table Name
public class Employee {
	
	

	//Mapping
	@Id @Column(name="empId")		private int empId;	//PrimaryKey
	@Column(name="empName")		private String empName;
	@Column(name="dob")			private String dob; 
	@Column(name="designation")	private String designation ;
	@Column(name="deptNo")		private int deptNo;
	@Column(name="salary")		private double salary;
	
	public Employee() {
		super();
		
	}
	
	public Employee(int empId, String empName, String dob, String designation, int deptNo, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dob = dob;
		this.designation = designation;
		this.deptNo = deptNo;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empId;
	}
	@Override
	public boolean equals(Object obj) {
		Employee ref = (Employee)obj;
		return this.empId==ref.empId;
	}
	@Override
	public String toString() {
		String details = "Employee id = "+ empId+ "\nEmployee name = "+ empName +"\nEmployee Date of Birth = "+dob+"\nDesignation = "+ designation +"\nSalary = "+salary;
		return details;
	}
	
}
// changes are made done 