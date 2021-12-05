package dz.sms;

public class Mobilis extends Provider{

	
	public Mobilis(String url, String user, String pass) {
		this.connect(url, user, pass);
	}
	@Override
	public void sendSMS() {
		System.out.println("Send With Mobilis");
		
	}

	@Override
	public void connect(String url, String user, String pass) {
		System.out.println("Connected with Mobilis");
		
	}

}
