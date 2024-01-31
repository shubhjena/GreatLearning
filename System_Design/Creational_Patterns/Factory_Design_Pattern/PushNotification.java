package Creational_Patterns.Factory_Design_Pattern;

public class PushNotification implements Notification{
    @Override
    public void notifyUser(){
        System.out.println("Sending a push notification");
    }
}
