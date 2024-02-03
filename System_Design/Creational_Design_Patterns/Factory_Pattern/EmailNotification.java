package Creational_Design_Patterns.Factory_Pattern;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an e-mail notification");
    }
}
