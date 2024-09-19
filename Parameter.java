package com.index;

class Employee{  //instance variable
	String emp_name;
	int emp_salary;
	int emp_bonse;   //variable initialized
	
	void insert(String n,int s,int b) {
		emp_name=n;
		emp_salary=s;
		emp_bonse=b;
	}
	void PrintDetails(String mon) {
		System.out.println("Employee name: " +emp_name);
		System.out.println("salary: " +emp_salary);
		
		if(mon==("december")) {
			System.out.println("bonus: " +(emp_bonse*2));
		}
		else {
			System.out.println("bonse " +emp_bonse);
		}
	}
}
public class Parameter {    //main class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.insert("sharan",14000,2000);
		emp1.PrintDetails("december");
		
		Employee emp2=new Employee();
		emp2.insert("Divya",16000,1000);
		emp2.PrintDetails("june");
	}

}
