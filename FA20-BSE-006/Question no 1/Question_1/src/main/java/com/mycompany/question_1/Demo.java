/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.question_1.FirstExample;
import com.mycompany.question_1.SecondExample;
import com.mycompany.question_1.ThirdExample;;

/**
 *
 * @author techenclavecomputers
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        // Using the FirstExample class
        FirstExample.getInstance().setValue(42);
        System.out.println("value  of (FirstExample)= " + FirstExample.getInstance().getValue());
        FirstExample.destruct();

        // Using the SecondExample class
        SecondExample.getInstance().setValue(24);
        System.out.println("value of (SecondExample)= " + SecondExample.getInstance().getValue());

        //using third example
        ThirdExample instance = ThirdExample.getInstance();
        System.out.println("Instance: " + instance);
    }
}