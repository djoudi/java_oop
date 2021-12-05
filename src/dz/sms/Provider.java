package dz.sms;

public abstract class Provider {
   String user;
   String pass;
   String url;
   
   public abstract void sendSMS();
   
   public abstract void connect(String url,String user,String pass );
   
   
}
