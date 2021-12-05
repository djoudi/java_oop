package dz.sms;

public class Oorredoo extends Provider{

	public Oorredoo(String url, String user, String pass) {
		this.connect(url, user, pass);
	}
	
	@Override
	public void sendSMS() {
		System.out.println("Send With OORREDDOO");
		
	}

	@Override
	public void connect(String url, String user, String pass) {
		System.out.println("Connected with Oorredoo");
		
	}

}
