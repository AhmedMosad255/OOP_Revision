/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package department.employee;

/**
 *
 * @author Ahmed
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double base;

    public BasePlusCommissionEmployee(double base, double gross_sales, double commission_rate, String name, int SSN, String address, Gender gender) {
        super(gross_sales, commission_rate, name, SSN, address, gender);
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double earnings() {
        return super.earnings() + base;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
