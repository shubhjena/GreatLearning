package Creational_Patterns.Factory_Design_Pattern;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}
