package com.jeevanandan.assignment1.employee;

public class Employee {
        private String name;
        private int eId;
        private double salary;
        
        
		public Employee(String name, int eId, double salary) {
			super();
			this.name = name;
			this.eId = eId;
			this.salary = salary;
			
			
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int geteId() {
			return eId;
		}


		public void seteId(int eId) {
			this.eId = eId;
		}


		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			this.salary = salary;
		}
        
        
        
        
}