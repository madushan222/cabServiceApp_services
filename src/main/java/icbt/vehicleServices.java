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
@WebService(serviceName = "vehicleServices")
public class vehicleServices {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "addCategory")
    public boolean addCategory(@WebParam(name = "vehicle") Vehicle catogery){
        DBVehicle util = new DBVehicle();
        return util.addCategory(catogery);
    }
    
    @WebMethod(operationName = "getCategories")
    public List<Vehicle> getCategories(){
        DBVehicle util = new DBVehicle();
        return util.getCategories();
    }
    
   @WebMethod(operationName = "deleteCategory")
    public boolean deleteCategory(@WebParam(name = "typeId") int typeId){
        DBVehicle util = new DBVehicle();
        return util.deleteCategory(typeId);
    }
}
