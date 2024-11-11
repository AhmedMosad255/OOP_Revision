/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package department.employee;

/**
 *
 * @author Ahmed
 */
public class HourlyEmployee extends Employee implements Displayable{
    
    private double houre_rate;
    private int number_of_hours;

    public HourlyEmployee() {
    }
    
    
    public HourlyEmployee(double houre_rate, int number_of_hours, String name, int SSN, String address, Gender gender) {
        super(name, SSN, address, gender);
        this.houre_rate = houre_rate;
        this.number_of_hours = number_of_hours;
    }

    public double getHoure_rate() {
        return houre_rate;
    }

    public void setHoure_rate(double houre_rate) {
        this.houre_rate = houre_rate;
    }

    public int getNumber_of_hours() {
        return number_of_hours;
    }

    public void setNumber_of_hours(int number_of_hours) {
        this.number_of_hours = number_of_hours;
    }
    
    
    
    

    @Override
    public double earnings() {
        return houre_rate * number_of_hours;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "houre_rate=" + houre_rate + ", number_of_hours=" + number_of_hours + '}';
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
