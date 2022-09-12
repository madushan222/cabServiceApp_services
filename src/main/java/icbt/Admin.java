/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icbt;

/**
 *
 * @author shanr
 */
public class Admin {
    private String fName,lname,nic,dob,email,username,password;
    private int mobile,branchId,userId;
    
    public Admin() {
        this.fName = "";
        this.lname = "";
        this.nic = "";
        this.dob = "";
        this.email = "";
        this.username = "";
        this.password = "";
        this.mobile = 0;
        this.branchId = 0;
        this.userId = 0;
    }

    public Admin(String fName, String lname, String nic, String dob, String email, String username, String password, int mobile, int branchId, int userId) {
        this.fName = fName;
        this.lname = lname;
        this.nic = nic;
        this.dob = dob;
        this.email = email;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
        this.branchId = branchId;
        this.userId = branchId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    
    
    
}
