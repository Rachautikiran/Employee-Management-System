package com.kiran.inheritance;



public class Employee {

    String name;
    int employeeId;
    double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("=============================");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);


    }


    public static void main(String[] args) {
        Developer developer = new Developer("Kiran", 101,50000.0);
        Tester tester = new Tester("Raj",102,60000.0);
        developer.displayEmployeeDetails();
        developer.writeCode();


        tester.displayEmployeeDetails();
        tester.testApplication();


    }


}
//test
class Developer extends Employee{
   public Developer(String name, int employeeId,double salary){
       super(name,employeeId,salary);
   }
   public void writeCode(){
       System.out.println("Developer is writing code");
   }
}
class Tester extends  Employee{

    public Tester(String name, int employeeId,double salary){
        super(name,employeeId,salary);
    }
    public void testApplication(){
        System.out.println("Testing application");
    }

}






































































































