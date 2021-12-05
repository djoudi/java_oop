package dz.sms;

public class Djizzy extends Provider{

	
	public Djizzy(String url, String user, String pass) {
		this.connect(url, user, pass);
	}
	@Override
	public void sendSMS() {
		System.out.println("Send With Djizzy");
		
	}

	@Override
	public void connect(String url, String user, String pass) {
		System.out.println("Connected with Djizzy");
		
	}

	
}
