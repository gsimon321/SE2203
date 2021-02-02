package BankAccounts;


public class SavingsAccount extends BankAccount{
    //initializes and declares all of the appropriate variables that are needed in the class
    private double rate;
    private int savingsNumber = 0;
    private String accountNumber;
    //constructor for the SavingsAccount Class
    public SavingsAccount(String name, double amount, double rate){
        //calls the constructor of the super class and sets the the name and the amount
        super(name,amount);
        //sets the rate of the SavingsAccount class as the rate that was passed as a parameter
        this.rate = rate;
        //sets the account number as the same thing as the parent but appended with a -S and the specific savings number
        this.accountNumber =super.getAccountNumber()+"-S"+this.savingsNumber;
    }
    public SavingsAccount(SavingsAccount oldAccount, double amount){
        //calls the super constructor to make a new SavingsAccount out of an old account
        super(oldAccount,amount);
        //sets the account number as the same thing as the parent but appended with a -S and the specific savings number
        this.accountNumber =super.getAccountNumber()+"-S"+(this.savingsNumber+1);
    }
    //deposits the interest that is charged on the account based on the rate of the account
    public void postInterest(){
        super.deposit(this.rate*getBalance());
    }
    //gets the account number of this specific account not the parent
    public String getAccountNumber(){
        return(this.accountNumber);
    }


}
