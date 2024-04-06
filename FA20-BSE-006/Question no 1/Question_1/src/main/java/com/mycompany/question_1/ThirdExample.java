/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question_1;

/**
 *
 * @author techenclavecomputers
 */
public class ThirdExample {
    private static volatile ThirdExample instance = null;

    private ThirdExample() {}

    public static ThirdExample getInstance() {
        if (instance == null) {
            synchronized(ThirdExample.class) {
                if (instance == null) {
                    instance = new ThirdExample();
                }
            }
        }
        return instance;
    }
}