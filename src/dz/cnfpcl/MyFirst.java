package dz.cnfpcl;

import dz.cf.Comp;
import dz.cf.RH;

import dz.cf.DB;

public class MyFirst {

	public static void main(String[] args) {
		//System.out.println("Welcom To CNFPCL");
		
	/*	OS windows = new OS();
		
		windows.name = "Windows 11";
		windows.version =  10.25f;
		windows.year = 2018;
		
		windows.start();*/
		
	/*
	 * Linux l = new Linux();
	 * 
	 * l.start2();
	 * 
	 * Windows w = new Windows();
	 * 
	 * w.start2();
	 * 
	 * MAC m = new MAC();
	 */
		
	/*
	 * RH rh = new RH(); //rh.desc();
	 * 
	 * Comp comp = new Comp();
	 * 
	 * comp.desc();
	 */
		
		//RH rh = new RH(5); 
		
		DB dbwithoutdbname = new DB("localhost","root","root");
		
		DB dbwithdbname = new DB("localhost","root","root","dbcnfpcl");
		
		DB connect = new DB("localhost","root","root");
		connect = new DB("localhost","root","root","dbcnfpcl");
		//rh.desc();
		
		
		
	

	}

}
