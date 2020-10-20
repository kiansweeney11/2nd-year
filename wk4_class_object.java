// week4 classes and objects finished default constructor
public class BankAccount
{
    double balance;
    public BankAccount(double bal)
    {
        balance = bal;
    }
    public BankAccount()
    {
        balance = 100.00;
    }
    public void withdraw(double value)
    {
        balance = balance - value;
    }
    public void deposit(double value)
    {
        balance = balance + value;
    }
    public String toString()
    {
        return("The balance is " + balance);
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double value)
    {
        balance = value;
    }
}