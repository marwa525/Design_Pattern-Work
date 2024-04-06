/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question_1;

/**
 *
 * @author techenclavecomputers
 */
public class SecondExample {
    private static final SecondExample instance = new SecondExample();
    private int value;

    private SecondExample() {
        // Private constructor to prevent instantiation from outside
    }

    public static SecondExample getInstance() {
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value_) {
        value = value_;
    }

    
}