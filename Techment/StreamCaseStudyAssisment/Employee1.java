package com.techment.StreamCaseStudyAssisment;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Collector;

class Department{
	
	private int departmentId;
    private String deparatmentNmae;
    private int managerId;
	public Department(int departmentId, String deparatmentNmae, int managerId) {
		super();
		this.departmentId = departmentId;
		this.deparatmentNmae = deparatmentNmae;
		this.managerId = managerId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDeparatmentNmae() {
		return deparatmentNmae;
	}
	public void setDeparatmentNmae(String deparatmentNmae) {
		this.deparatmentNmae = deparatmentNmae;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	
}

class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date hireDate;
	private String designation;
	private double salary;
	private int managerId;
	private Department deparatment;


	public Employee(int employeeId, String firstName, String lastName, String email, String phoneNumber, Date date,
			String designation, double salary, int managerId, Department deparatment) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = date;
		this.designation = designation;
		this.salary = salary;
		this.managerId = managerId;
		this.deparatment = deparatment;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public Department getDeparatment() {
		return deparatment;
	}
	public void setDeparatment(Department deparatment) {
		this.deparatment = deparatment;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", designation=" + designation
				+ ", salary=" + salary + ", managerId=" + managerId + ", deparatment=" + deparatment + "]";
	}
		
		
}

public class Employee1{
	
	public static void main(String args[])
	{
		
		ArrayList<Employee> employee=new ArrayList<Employee>();
		try {
			Department department1 = new Department(1001, "hr", 50);
			Department department2 = new Department(1002, "manager", 58);
			Department department3 = new Department(1003, "developer", 40);
			List<Department>department=new ArrayList<Department>();
			department.add(department1);
			department.add(department2);
			department.add(department3);
			List<Employee> employees = new ArrayList<Employee>();
			Employee employee1 = new Employee(1, "murthy", "rao", "murthy@gmail.com", "9630124572",
					(Date) new SimpleDateFormat("dd/MM/yyyy").parse("12/11/2020"), "senior hr", 25000, 100, department1);
			Employee employee2 = new Employee(2, "sanju", "sangi", "sanju@gmail.com", "7630124572",
					(Date) new SimpleDateFormat("dd/MM/yyyy").parse("20/02/2019"), "manager hr", 35000, 101, department2);
			Employee employee3 = new Employee(3, "raju", "yadav", "raju@gmail.com", "8630124572",
					(Date) new SimpleDateFormat("dd/MM/yyyy").parse("23/02/2014"), "developer hr", 45000, 102, department3);
			

			employees.add(employee1);
			employees.add(employee2);
			employees.add(employee3);
			
			Employee1 em = new Employee1();
			em.sumOfEmpSal(employees);
			em.countOfEmpInDepts(employees);
			em.empWithOutDept(employees);
			em.deptWithHighestCountEmp(employees);
			em.depWithOutEmp(employees);
			em.EmpReportingToManager(employees);
			em.empWithOutManager(employees);
			em.hiredEmpDetails(employees);
			em.seniorEmployee(employees );
			em.sortAllEmp(employees,department );
			em.IncreaseEmpSalary(employees);
			
			

			}
			
			catch(Exception e) {
				e.printStackTrace();
			}

		

		}

		void sumOfEmpSal(List<Employee> empList) {
			double employeeSal = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();

			System.out.println(employeeSal);
		}

		void countOfEmpInDepts(List<Employee> empList) {
			Map<Department,Long> empMap=empList.stream().collect(Collectors.groupingBy(Employee::getDeparatment,Collectors.counting()));
					

			System.out.println(empMap);
		}

		void empWithOutDept(List<Employee> empList) {
		 List<Employee>emp=empList.stream().filter(e->e.getDeparatment().getDepartmentId()==0).collect(Collectors.toList());
		System.out.println(emp);
		}
		void depWithOutEmp(List<Employee>empList) {
			empList.stream().filter(e->e.getManagerId()==0).forEach(System.out::println);
		}
		void seniorEmployee(List<Employee> empList) {
		      Date min=empList.stream().min(Comparator.comparing(Date::toEpochDay)).get();
			}
		void deptWithHighestCountEmp(List<Employee>empList) {
			Map<Department,Long> mapList=empList.stream().filter(e-> e.getDeparatment()!=null).collect(Collectors.groupingBy(Employee::getDeparatment,Collectors.counting()));
		
		for(Map.Entry<Department, Long>entry:mapList.entrySet()) {
			System.out.println("Department:"+entry.getKey().getDeparatmentNmae()+", count:"+entry.getValue());
		}
		}
		void EmpReportingToManager(List<Employee>empList) {
			
			empList.stream().forEach(e->System.out.println(e.getFirstName()+" "+e.getLastName()+"Reporting to"+e.getManagerId()));
			
		}
		void hiredEmpDetails(List<Employee>empLlist) {
			empLlist.stream().filter(e->e.getHireDate().getDay()==6).forEach(System.out::println);
		}
		void empWithOutManager(List<Employee>empList) {
			System.out.println("Employees without manager");
			empList.stream().filter(e->e.getManagerId()==0).forEach(System.out::println);
		}
		void IncreaseEmpSalary(List<Employee>empList) {
			empList.stream().map(e->"name"+e.getFirstName()+e.getSalary()+"salary increased by 15%"+(e.getSalary()+e.getSalary()*0.15)).forEach(System.out::println);
		}
		void sortAllEmp(List<Employee>empList,List<Department>deptList) {
			System.out.println("sort employees by id");
			empList.stream().sorted(Comparator.comparingInt(Employee::getEmployeeId)).forEach(System.out::println);
			System.out.println("Sort by department id");
			deptList.stream().sorted(Comparator.comparingInt(Department::getDepartmentId)).forEach(System.out::println);
			System.out.println("Sort by Employees Name");
			empList.stream().sorted(Comparator.comparing(Employee::getFirstName)).forEach(System.out::println);
			
		}
		
	}

