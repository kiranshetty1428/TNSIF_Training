package org.tnsif.acc.c2tc.interfacedemo;
@FunctionalInterface
interface Notification{
	void notifyuser(String message);
}
class EmailNotification implements Notification
{

	@Override
	public void notifyuser(String message) {
		System.out.println("Sending mail"+message);
		
	}
	
}
class SMSNotification implements Notification{

	@Override
	public void notifyuser(String message) {
		System.out.println("Sending SMS"+message);
		
	}
	
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Notification email =new EmailNotification();
	    email.notifyuser("meetng at 10am");
	    
		Notification sms = new SMSNotification();
		sms.notifyuser("Assignment Uploded");

	}

}
