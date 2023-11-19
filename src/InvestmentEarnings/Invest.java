package InvestmentEarnings;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.*;

public class Invest {
    public static void main(String[] args){
        Scanner reader = new Scanner (System.in);

        System.out.println("Enter the buying price: ");
        double buyingPrice = reader.nextDouble();
        System.out.println("Enter the closing price: ");
        double closingPrice = reader.nextDouble();

        DecimalFormat df = new DecimalFormat("0.00");

        int day = 1;

        while(true){
            System.out.println("Enter the closing price for day " + day + " (any negative value to leave: )");
            closingPrice = reader.nextDouble();

            if(closingPrice < 0) break;
            double earnings = closingPrice - buyingPrice;
            if (earnings>0){
                System.out.println("After day " + day + " ,you earned " + df.format(earnings) + " per share");

            }
            else if(earnings < 0){
                System.out.println("After day " + day + " you lost " + df.format((-earnings)) + " per share");
            }
            else{
                System.out.println("After day " + day + ", you have no earnings per share");
            }
            day+=1;
        }
        reader.close();
    }
}
