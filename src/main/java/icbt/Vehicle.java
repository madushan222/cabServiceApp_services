/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icbt;

/**
 *
 * @author shanr
 */
public class Vehicle {
    private String category;
    private int typeId;
    
    public Vehicle() {
        this.category = "";
        this.typeId = 0;
    }
    
    public Vehicle(String category, int typeId) {
        this.category = category;
        this.typeId = typeId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
    
}
