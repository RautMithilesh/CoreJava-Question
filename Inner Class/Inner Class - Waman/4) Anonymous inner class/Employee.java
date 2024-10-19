class Employee {
    int salary;
    void setSalary(int salary) {
        System.out.println("setting salary of normal employee");
        this.salary = salary;
    }
    void printSalary() {
        System.out.println(this.salary);
    }
    public static void main(String args[]) {
        
		Employee abhishek = new Employee();
		abhishek.setSalary(50000);
        abhishek.printSalary();

        Employee onkar = new Employee();
		onkar.setSalary(50000);
        onkar.printSalary();
		
        // here mayur is employee having of extra 2000 salary
		Employee mayur = new Employee(){
			void setSalary(int salary){
				System.out.println("Setting salary of mayur(special employee)");
                this.salary = salary + 2000;
                // here 2000 is extra only for employee mayur
			}
		};
		mayur.setSalary(50000);
		mayur.printSalary();
	}
}


