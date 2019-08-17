package com.zxd.Beans;

public class Emp {
	private String empno;
	private String name;
	private int age;
	private int salary;
	private String hiredate;
	
	public Emp(String empno, String name, Integer age, Integer salary, String hiredate) {
		super();
		this.empno = empno;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.hiredate = hiredate;
	}
	public Emp() {
		super();
	}

	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
}
