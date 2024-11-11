/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package department.employee;

/**
 *
 * @author Ahmed
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Department d1 = new Department(1, "Information Technongy");
        
        SalariedEmployee se = new SalariedEmployee(5000, 200, 50, "Ahmed", 1111111, "alex", Gender.MALE);
        
        d1.addEmployee(se);
        
        HourlyEmployee he = new HourlyEmployee(10.5, 50, "mohamed", 1111111, "cairo", Gender.MALE);
        
        d1.addEmployee(he);
        
        System.out.println(d1.countEmployee());
        
//        d1.printAllBasicDetailsOfEmployee();
        
        d1.printAllDepartmentDetails();
        
        se.displayEarnings();
    }
    
}
