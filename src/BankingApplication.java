import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {


        BankAccount obj1 = new BankAccount("XYZ","BA0001");
        obj1.showMenu();

    }

}
class BankAccount
{
    int balance;
    int previousTransaction;
    String customername;
    String customerID;

    BankAccount(String cname,String cID)
    {
        customername = cname;
        customerID = cID;
    };

    void Deposit(int Amount)
    {
        if (Amount != 0)
        {
            balance = balance + Amount;
            previousTransaction = Amount;
        }
    }

    void withdraw(int Amount)
    {
        if (Amount != 0)
        {
            balance = balance - Amount;
            previousTransaction = -Amount;
        }
    }
    void GetpreviousTransaction()
    {
        if (previousTransaction > 0)
        {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("withdraw: " + Math.abs(previousTransaction));

        } else {
            System.out.println("No transaction found");
        }
    }
    void showMenu()
    {
        char option='\0';
        Scanner s = new Scanner(System.in);
        System.out.println("welcome "+customername);
        System.out.println("your ID is "+customerID);
        System.out.println("\n");
        System.out.println("A. check balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. previous transaction");
        System.out.println("E. exit");

        do {
            System.out.println("========================================");
            System.out.println("enter an option");
            System.out.println("=========================================");
            option = s.next().charAt(0);
            System.out.println("\n");
            switch (option) {
                case 'A':
                    System.out.println("_______________");
                    System.out.println("Balance = " + balance);
                    System.out.println("________________");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("_________________");
                    System.out.println("enter an amount to deposit:");
                    System.out.println("_____________________");
                    int amount = s.nextInt();
                    Deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("____________________");
                    System.out.println("enter an amount to withdraw:");
                    System.out.println("_____________________");
                    int amount2 = s.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("______________________");
                    GetpreviousTransaction();
                    System.out.println("______________________");
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("Invalid option!!. Please enter again");
                    break;
            }
        } while(option != 'E');
        System.out.println("Thank you for using our services");

    }
}



