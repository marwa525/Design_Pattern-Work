/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question_3;

public class Demo {

    public static void main(String[] args) {
        // Create multiple threads to access the Configuration singleton
        Thread thread1 = new Thread(() -> {
            Configuration config = Configuration.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + config.getValue("mode"));
        });

        Thread thread2 = new Thread(() -> {
            Configuration config = Configuration.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + config.getValue("font-size"));
        });

        Thread thread3 = new Thread(() -> {
            Configuration config = Configuration.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + config.getValue("font-type"));
        });

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

