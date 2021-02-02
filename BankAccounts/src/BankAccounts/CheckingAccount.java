package BankAccounts;

public class CheckingAccount extends BankAccount {
    //initialization and declaration of the private double fee
    private double fee= 0;
    //CheckingAccount constructor
    public CheckingAccount(String name, double amount, double fee){
        //calls the constructor of the super class which is BankAccount
        super(name, amount);
        //sets the fee of the instance object equal to the fee that is passed as a parameter
        this.fee = fee;
        //set the account number for this new account as the same
        // numerical string as the parent account appended with -CA
        this.setAccountNumber(super.getAccountNumber()+"-CA");
    }
    //public method withdraw that returns a boolean
    public boolean withdraw(double amount) {
        //if the amount is over a 100 adds the fee to the withdrawal amount and calls the withdraw of the super
        if (amount > 100) {
            return(super.withdraw(this.fee+amount));
        }
        //otherwise it just uses the withdraw of the super without adding the fee
        else {
            return(super.withdraw(amount));
        }
    }
}

