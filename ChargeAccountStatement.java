/**
 * Yogin Patel
 * 8/2/15
 * Charge Account Statement 1.2
 */

import java.util.Scanner;
import java.text.NumberFormat;
public class ChargeAccountStatement
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter the previous balance on the account: ");
        double initialBalance=scan.nextDouble();
        System.out.println();
        System.out.print("Please enter the total amount of additional charges: ");
        double charges=scan.nextDouble();
        System.out.println();
        double minimumPayment=0;
        double interest;
        if (initialBalance==0)
        {
            interest=0;
        }
        else
        {
            interest=(initialBalance+charges)*.18;
        }
        double newBalance=interest+charges+initialBalance;
        if (newBalance<50 && newBalance>0)
        {
            minimumPayment=initialBalance+charges+interest;
        }
        else if (newBalance>=50 && newBalance<=300)
        {
            minimumPayment=50;
        }
        else if (newBalance>300)
        {
            minimumPayment=(initialBalance+charges+interest)*.2;
        }
        System.out.println("\n\n");
        System.out.println("CS CARD International Statement");
        System.out.println("===============================");
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("Previous Balance:\t"+money.format(initialBalance));
        System.out.println("Additional Charges:\t"+money.format(charges));
        System.out.println("Interest:\t\t"+money.format(interest));
        System.out.println("New Balance:\t\t"+money.format(charges+initialBalance+interest));
        System.out.println("Minimum Payment:\t"+money.format(minimumPayment));
    }
}
        