/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package department.employee;

public class SalariedEmployee extends Employee implements Displayable{
    
    
    private double salary;
    private double bouns;
    private double deductions;

    public SalariedEmployee() {
    }

    public SalariedEmployee(double salary, double bouns, double deductions, String name, int SSN, String address, Gender gender) {
        super(name, SSN, address, gender);
        this.salary = salary;
        this.bouns = bouns;
        this.deductions = deductions;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }
    
    
    

    @Override
    public double earnings() {
        return salary + bouns - deductions;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "salary=" + salary + ", bouns=" + bouns + ", deductions=" + deductions + '}';
    }

    @Override
    public void displayAllDeatails() {
        System.out.println(super.toString());
        System.out.println(toString());
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void displayEarnings() {
        System.out.println(earnings());
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
