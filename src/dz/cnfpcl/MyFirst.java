package dz.cnfpcl;

import dz.cf.Comp;
import dz.cf.RH;
import dz.drb.ApiLang;
import dz.drb.English;
import dz.drb.Franch;
import dz.drb.Lang;
import dz.sms.CNFPCL;
import dz.sms.Carol;
import dz.sms.Djizzy;
import dz.sms.Mobilis;
import dz.sms.Oorredoo;
import dz.cf.DB;

public class MyFirst {
	
	   
	public static void main(String[] args) {
	       
		/*
		 * Mobile mb = new Mobile("SamSung", "Noir", 5454564545004545522L);
		 * mb.setModel("LG"); mb.setSerial(2454454545484545L);
		 * System.out.println(mb.getModel()); System.out.println(mb.getSerial());
		 */
		 Lang en = new English();
		 
		 Lang fr = new Franch();
		 
		 ApiLang api = new ApiLang();
		 api.start(en);

	}
	
	
	
}
