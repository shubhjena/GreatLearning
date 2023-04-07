package Week2_OOPS.Lab_bankManagementTool.dao;

public class AccountNotFound extends RuntimeException{
    public AccountNotFound(String message) {
        super(message);
    }
}
