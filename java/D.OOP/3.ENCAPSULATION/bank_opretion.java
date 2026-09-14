package bank;
import java.util.Scanner;

public class bank_opretion
{
    // private data

    private int accountNo;
    private String holderName;
    private String phone;
    private double bal;
    private int pin;

    static Scanner sc = new Scanner(System.in);


    public void setAccNo(int acc)
    {
        accountNo = acc;
        System.out.println("Set successfully..");
    }

    public int getAccNo()
    {
        return accountNo;
    }


    public void setHolderName(String Name)
    {
        holderName = Name;
        System.out.println("Set successfully");
    }

    public String getHolderName()
    {
        return holderName;
    }


    public void setPhoneNo(String pno)
    {
        if(pno.length() != 10)
        {
            System.out.println("Invalid phone Number!!!!");
            return;
        }

        phone = pno;

        System.out.println("Set successfully..");
    }

    public String getPhone()
    {
        return phone;
    }


    public void SetPin()
    {
        int PIN;

        System.out.println("Enter 4 digit PIN:");

        PIN = sc.nextInt();

        if(PIN < 1000 || PIN > 9999)
        {
            System.out.println("Enter only 4 digit PIN!!");
            return;
        }

        pin = PIN;

        System.out.println("PIN set successfully..");
    }


    public void deposite()
    {
        double amt;

        System.out.println("Enter amount to deposit:");

        amt = sc.nextDouble();

        if(amt <= 0)
        {
            System.out.println("Invalid deposit Amount!!!");
            return;
        }

        if(amt > 50000)
        {
            System.out.println("Deposit limit is 50000!!!!");
            return;
        }

        bal += amt;

        System.out.println(amt + " Deposit Successfully..");
    }


    public void withdraw()
    {
        double amt;
        int enterdPin;

        System.out.println("Enter amount to Withdraw:");

        amt = sc.nextDouble();

        System.out.println("Enter PIN:");

        enterdPin = sc.nextInt();

        if(enterdPin != pin)
        {
            System.out.println("Wrong PIN!!!");
            return;
        }

        if(amt <= 0)
        {
            System.out.println("Invalid Amount!!!");
            return;
        }

        if(amt > bal)
        {
            System.out.println("Insufficient balance!!");
            return;
        }

        bal = bal - amt;

        System.out.println(amt + " Withdraw successfully..");
    }


    public void checkBalance()
    {
        int enterdPin;

        System.out.println("Enter PIN:");

        enterdPin = sc.nextInt();

        if(enterdPin != pin)
        {
            System.out.println("Wrong PIN!!!");
            return;
        }

        System.out.println("Available balance: ₹" + bal);

        if(bal < 1000)
        {
            System.out.println("LOW BALANCE!!");
        }
        else if(bal < 2000)
        {
            System.out.println("GOOD AMOUNT");
        }
        else if(bal < 5000)
        {
            System.out.println("VERY GOOD AMOUNT");
        }
        else
        {
            System.out.println("RICH PERSON");
        }
    }


    void changePin()
    {
        int changePin;
        int oldPin;

        System.out.println("Enter Old PIN:");
        oldPin = sc.nextInt();

        if(oldPin != pin)
        {
            System.out.println("Old PIN is incorrect!");
            return;
        }

        System.out.println("Enter New PIN:");
        changePin = sc.nextInt();

        if(changePin < 1000 || changePin > 9999)
        {
            System.out.println("Enter only 4 digit PIN!!");
            return;
        }

        pin = changePin;

        System.out.println("PIN Change successfully..");
    }


    void showDetails()
    {
        System.out.println("\n-------- BANK OF MAHARASHTRA ------------");

        System.out.println("\n--------- Account Details -------------");

        System.out.println("Account Number: " + accountNo);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Phone: " + phone);
        System.out.println("Balance: " + bal);

        System.out.println("\n--------- END -------------");
    }


    public static void main(String[] args)
    {
        bank_opretion bank = new bank_opretion();

        int ch;

        do
        {
            System.out.println("\n1. Set Account Number");
            System.out.println("2. Set Holder Name");
            System.out.println("3. Phone Number");
            System.out.println("4. Set PIN");
            System.out.println("5. Deposit");
            System.out.println("6. Withdraw");
            System.out.println("7. Check Balance");
            System.out.println("8. Change PIN");
            System.out.println("9. Show Details");
            System.out.println("10. Exit");

            System.out.println("Enter your choice:");

            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    bank.setAccNo(993);
                    break;

                case 2:
                    bank.setHolderName("Amol");
                    break;

                case 3:
                    bank.setPhoneNo("9021359528");
                    break;

                case 4:
                    bank.SetPin();
                    break;

                case 5:
                    bank.deposite();
                    break;

                case 6:
                    bank.withdraw();
                    break;

                case 7:
                    bank.checkBalance();
                    break;

                case 8:
                    bank.changePin();
                    break;

                case 9:
                    bank.showDetails();
                    break;

                case 10:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(ch != 10);
    }
}