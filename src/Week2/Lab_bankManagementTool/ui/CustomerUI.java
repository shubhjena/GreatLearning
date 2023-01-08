package Week2.Lab_bankManagementTool.ui;

import Week2.Lab_bankManagementTool.beans.Account;
import Week2.Lab_bankManagementTool.beans.CurrentAccount;
import Week2.Lab_bankManagementTool.beans.Customer;
import Week2.Lab_bankManagementTool.beans.SavingAccount;
import Week2.Lab_bankManagementTool.dao.CustomerDaoImpl;

import java.util.Scanner;

public class CustomerUI {
    public static void customerMain(CustomerDaoImpl customerDao) {
        Account account;
        String firstName, lastName, email;
        int ch;
        long accountNo;
        double amount;
        Scanner sc = new Scanner(System.in);
        //Customer
        try {
            do {
                System.out.print("""
                                                
                        ---Customer---
                        1. Create new account
                        2. Deposit Cash
                        3. Withdraw Cash
                        4. Balance Enquiry
                        5. View Account Info
                        9. Cancel
                                                           
                        Your choice:\s""");
                ch = Integer.parseInt(sc.nextLine());
                switch (ch) {
                    case 1: //Create new account
                        System.out.print("""
                                Select Account Type:
                                1. Savings Account
                                2. Current Account
                                                                
                                Enter here:""");
                        int type = Integer.parseInt(sc.nextLine());
                        account = ((type == 1) ? new SavingAccount() : (type == 2) ? new CurrentAccount() : null);
                        System.out.print("Enter first name:");
                        firstName = sc.nextLine();
                        System.out.print("Enter last name:");
                        lastName = sc.nextLine();
                        System.out.print("Enter emailId:");
                        email = sc.nextLine();
                        System.out.println("Account Created Successfully. Your account number is "
                                +customerDao.createAccount(new Customer(account, firstName, lastName, email)));
                        break;
                    case 2: //Deposit Cash
                        System.out.print("Enter your account number:");
                        accountNo = Long.parseLong(sc.nextLine());
                        System.out.print("Enter amount to deposit:");
                        amount = Double.parseDouble(sc.nextLine());
                        if (customerDao.depositMoney(accountNo, amount))
                            System.out.println("Cash deposited successfully.");
                        break;
                    case 3: //Withdraw Cash
                        System.out.print("Enter your account number:");
                        accountNo = Long.parseLong(sc.nextLine());
                        System.out.print("Enter amount to withdraw:");
                        amount = Double.parseDouble(sc.nextLine());
                        if (customerDao.withdrawMoney(accountNo, amount))
                            System.out.println("Cash withdrawn successfully.");
                        break;
                    case 4: //Balance Enquiry
                        System.out.print("Enter your account number:");
                        accountNo = Long.parseLong(sc.nextLine());
                        System.out.println("Your Account Balance is INR " + customerDao.checkBalance(accountNo));
                        break;
                    case 5: //View Account Info
                        System.out.print("Enter your account number:");
                        accountNo = Long.parseLong(sc.nextLine());
                        customerDao.viewAccountInfo(accountNo);
                    case 9: //Cancel
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } while (ch != 9) ;
        }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Account directory limit reached. Contact admin team.");
        }catch (NullPointerException e){
            System.out.println("Account does not exist!");
        }catch (Exception e){
            e.getMessage();
        }
    }
}
