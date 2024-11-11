/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package department.employee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ahmed
 */
public class Department {
    private int id;
    private String name;
    private List<Employee> employees;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
        this.employees = new ArrayList<Employee>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    
    public void removeEmployee(int index){
        employees.remove(index);
    }
    
    public int countEmployee(){
        return employees.size();
    }
    
    public void printAllBasicDetailsOfEmployee(){
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(
                    employees.get(i).getName() + "\n" +
                    employees.get(i).getSSN()+ "\n" +
                    employees.get(i).getGender()+ "\n" +
                    employees.get(i).getAddress()
            );
        }
    }
    
    public void printAllDepartmentDetails(){
        for (Employee employee : employees) {
            if(employee instanceof SalariedEmployee){
                ((SalariedEmployee) employee).displayAllDeatails();
            }
            if(employee instanceof HourlyEmployee){
                ((HourlyEmployee) employee).displayAllDeatails();
            }
            if(employee instanceof CommissionEmployee){
                ((CommissionEmployee) employee).displayAllDeatails();
            }
        }
    }
    
    
}
