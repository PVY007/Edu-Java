class BankAccount
{
    String account_holder_name;
    double balance;
    void deposit (double amount)
    {
        balance=balance+amount;
        System.out.println("Deposited : "+amount);
    }
    void Withdraw (double amount)
    {
        if(amount<=balance)
        {
            balance=balance-amount;
            System.out.println("Withdrawn : "+amount);
        }
        else
        {
            System.out.println("Insufficient Balance ");
        }
    }
    void CheckBalance()
    {
        System.out.println("Account Holder: "+account_holder_name);
        System.out.println("Balance : "+balance);
    }
    public static void main(String[] args)
    {
        BankAccount b = new BankAccount();
        b.account_holder_name="Asha";
        b.balance=5000;
        b.deposit(2000);
        b.Withdraw(1500);
        b.CheckBalance();
    }
}

