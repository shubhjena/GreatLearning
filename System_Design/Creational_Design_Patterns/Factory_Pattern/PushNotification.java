package Creational_Design_Patterns.Factory_Pattern;

public class PushNotification implements Notification{
    @Override
    public void notifyUser(){
        System.out.println("Sending a push notification");
    }
}
