package com.goutam.ATM_Project;

import org.springframework.stereotype.Component;

import java.util.Scanner;
import static java.lang.System.exit;

@Component
public class ATM
{
    private short pin=(short)5869;
    private float balance;
    Scanner scan = new Scanner(System.in);

    public void checkPin()
    {
        System.out.print("Enter your PIN : ");
        short pin = scan.nextShort();
        if(this.pin==pin)
        {
            menu();
        }
        else
        {
            System.out.println("Wrong PIN");
            checkPin();
        }
    }

    public void menu()
    {
        System.out.print("1. Check A/C Balance  ");
        System.out.println("2. Withdraw Money");
        System.out.print("3. Deposit Money  ");
        System.out.println("4. changePIN");
        System.out.println("5. Exit");
        System.out.print("Enter your Choice : ");
        byte ch = scan.nextByte();
        switch(ch)
        {
            case 1: checkBalance();
                break;
            case 2: withdrawMoney();
                break;
            case 3: depositMoney();
                break;
            case 4: changePIN();
                break;
            case 5: exit(0);
        }
    }
    public void checkBalance()
    {
        System.out.println("Your Current Balance :"+balance);
        menu();
    }

    public void withdrawMoney()
    {
        System.out.println("Enter Amount to Withdraw ");
        float amount = scan.nextFloat();
        if(amount<=balance)
        {
            balance = balance - amount;
            System.out.println("Money Withdrawl Successful");
        }
        else
        {
            System.out.println("Insufficient Funds");
        }
        menu();
    }

    public void depositMoney()
    {
        System.out.println("Enter Amount to Deposit ");
        float amount = scan.nextFloat();
        balance = balance + amount;
        menu();
    }

    public void changePIN()
    {
        System.out.print("Enter your Current PIN: ");
        short currentPin = scan.nextShort();
        System.out.print("Enter New PIN: ");
        short newPin = scan.nextShort();
        if(currentPin==pin)
        {
            pin=newPin;
            System.out.println("PIN changed successful");
        }
        else
        {
            System.out.println("Wrong PIN");
        }
        menu();
    }
}

