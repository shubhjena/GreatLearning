package Creational_Patterns.Factory_Design_Pattern;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an e-mail notification");
    }
}
