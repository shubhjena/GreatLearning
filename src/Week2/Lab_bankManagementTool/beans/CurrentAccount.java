package Week2.Lab_bankManagementTool.beans;

public class CurrentAccount extends Account{

    float transFee;
    CurrentAccount(double bal, long accNo){
        super.setAccNum(accNo);
        super.deposit(bal);

//            void applyTransferFee(){
//
//        }
    }
}
