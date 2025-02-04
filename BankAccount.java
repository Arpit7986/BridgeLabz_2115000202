class BankAccount
{
    private static String bankName="HDFC Bank";
    private static int totalAccounts=0;
    private final int accountNumber;
    private String accountHolderName;
    public BankAccount(String accountHolderName,int accountNumber)
    {
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        totalAccounts++;
    }
    public static void getTotalAccounts()
    {
        System.out.println("Total Number of Accounts are "+totalAccounts);
    }
    public void displayDetails()
    {
        if(this instanceof BankAccount)
        {
            System.out.println("Bank Name : "+bankName);
            System.out.println("Account Holder Name : "+accountHolderName);
            System.out.println("Account Number :"+accountNumber);
            System.out.println();
        }
        else
        System.out.println("Invalid Account Instance");
    }
    public static void main(String args[])
    {
        BankAccount b1=new BankAccount("Ajay Jain", 101);
        BankAccount b2=new BankAccount("Arpit Jain",102);
        b1.displayDetails();
        b2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}