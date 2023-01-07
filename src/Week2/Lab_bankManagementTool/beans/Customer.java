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

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //toString

    @Override
    public String toString() {
        return "Customer{" +
                "Account=" + account.toString() +
                ", Name='" + firstName +' '+ lastName +'\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}
