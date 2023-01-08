package Week2.Lab_bankManagementTool.beans;

public class Customer {
    private Account account;
    private String firstName, lastName, email;

    //constructor
    public Customer(Account account, String firstName, String lastName, String email) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    //getters & setters
    public Account getAccount() {
        return account;
    }

    //toString
    @Override
    public String toString() {
        return "Customer{" +
                "\nAccount " + account.toString() +
                ",\nName='" + firstName +' '+ lastName +'\'' +
                ",\nEmail='" + email + '\'' +
                '}';
    }
}
