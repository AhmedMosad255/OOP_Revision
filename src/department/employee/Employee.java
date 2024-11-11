/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package department.employee;

enum Gender{MALE, FEMALE}
public abstract class Employee {
    private String name;
    private int SSN;
    private String address;
    private Gender gender;

    public Employee() {
    }

    public Employee(String name, int SSN, String address, Gender gender) {
        this.name = name;
        this.SSN = SSN;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    
    public abstract double earnings();

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", SSN=" + SSN + ", address=" + address + ", gender=" + gender + '}';
    }
    
    
      
    
    
}
