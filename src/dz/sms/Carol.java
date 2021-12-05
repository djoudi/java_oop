package dz.sms;

public class Carol extends Provider {

	
	public Carol(String url,String user,String pass,String token) {
		this.connect(url, user, pass, token);
	}
	@Override
	public void sendSMS() {
		System.out.println("Send With Carol");

	}

	@Override
	public void connect(String url, String user, String pass) {
		// TODO Auto-generated method stub
		
	}
	
	public void connect(String url,String user,String pass,String token) {
		System.out.println("Connected With Carol.");
	}

}
