/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author techenclavecomputers
 */
public class Phone implements IProduct {
    private double price;

    @Override
    public String getName() {
        return "Apple TouchPad";
    }

    @Override
    public boolean setPrice(double price) {
        this.price = price;
        return true;
    }
}
