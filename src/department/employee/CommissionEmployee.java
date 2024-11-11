/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package department.employee;

/**
 *
 * @author Ahmed
 */
public class CommissionEmployee extends Employee implements Displayable{
    
    private double gross_sales;
    private double commission_rate;

    public CommissionEmployee() {
    }

    public CommissionEmployee(double gross_sales, double commission_rate, String name, int SSN, String address, Gender gender) {
        super(name, SSN, address, gender);
        this.gross_sales = gross_sales;
        this.commission_rate = commission_rate;
    }

    public double getGross_sales() {
        return gross_sales;
    }

    public void setGross_sales(double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public double getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;
    }
    
    

    @Override
    public double earnings() {
        return gross_sales * commission_rate;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" + "gross_sales=" + gross_sales + ", commission_rate=" + commission_rate + '}';
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
