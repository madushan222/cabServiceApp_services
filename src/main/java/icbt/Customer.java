/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icbt;

/**
 *
 * @author shanr
 */
public class Customer extends Admin {
    private String address1,address2;

    public Customer() {
    }

    public Customer(String fName, String lname, String nic, String dob, String email, String username, String password, int mobile, int branchId, int userId) {
        super(fName, lname, nic, dob, email, username, password, mobile, branchId, userId);
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    
    
}
