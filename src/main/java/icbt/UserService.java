/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package icbt;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author shanr
 */
@WebService(serviceName = "UserService")
public class UserService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "addAdmin")
    public boolean addAdmin(@WebParam(name = "admin") Admin admin){
        DBUtil util = new DBUtil();
        return util.addAdmin(admin);
    }
    
    @WebMethod(operationName = "getAdmins")
    public List<Admin> getAdmins(){
        DBUtil util = new DBUtil();
        return util.getAdmins();
    }
    
    @WebMethod(operationName = "deleteAdmin")
    public boolean deleteAdmin(@WebParam(name = "userId") int userId){
        DBUtil util = new DBUtil();
        return util.deleteAdmin(userId);
    }
    
    @WebMethod(operationName = "getAdmin")
    public Admin getAdmin(@WebParam(name = "userId") int userId){
        DBUtil util = new DBUtil();
        return util.getAdmin(userId);
    }
    
    @WebMethod(operationName = "updateAdmin")
    public boolean updateAdmin(@WebParam(name = "admin") Admin admin){
        DBUtil util = new DBUtil();
        return util.updateAdmin(admin);
    }
            
}
