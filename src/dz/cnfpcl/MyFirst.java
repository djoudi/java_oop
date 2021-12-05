package dz.cnfpcl;

import dz.cf.Comp;
import dz.cf.RH;
import dz.sms.CNFPCL;
import dz.sms.Carol;
import dz.sms.Djizzy;
import dz.sms.Mobilis;
import dz.sms.Oorredoo;
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
		
		/*
		 * DB dbwithoutdbname = new DB("localhost","root","root");
		 * 
		 * DB dbwithdbname = new DB("localhost","root","root","dbcnfpcl");
		 * 
		 * DB connect = new DB("localhost","root","root"); connect = new
		 * DB("localhost","root","root","dbcnfpcl");
		 */
		//rh.desc();
		
		
		Mobilis m = new Mobilis("htttps:api.mobilis.dz/v2", "user1", "pass1");
		
		m.sendSMS();
		
Oorredoo o = new Oorredoo("htttps:api.Oorredoo.dz/v2", "user2", "pass2");
		
		o.sendSMS();
		
Carol c = new Carol("htttps:api.Oorredoo.dz/v2", "user2", "pass2","54545dfds5f4d5ds4f5ds4f5ds");
		
		c.sendSMS();
		
		
Djizzy d = new Djizzy("htttps:api.djizzy.dz/v2", "user2", "pass2");
		
		CNFPCL cp = new CNFPCL();
		cp.
	

	}

}
