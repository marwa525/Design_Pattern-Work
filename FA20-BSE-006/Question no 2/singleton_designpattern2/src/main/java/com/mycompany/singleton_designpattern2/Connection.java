/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singleton_designpattern2;

/**
 *
 * @author techenclavecomputers
 */

public class Connection {
	private static Connection instance;
	private Connection(){
		
	}
	public static Connection getInstance(){
		if(instance == null){
			instance = new Connection();
		}
		return instance;
	}
	public void getData(){
		System.out.println("This is the data retrieved from the DB");
	}

}
