package BranchSalesPerformance;

import java.io.File;
import java.util.Scanner;

public class Performance {
    public static void main(String[] args) throws Exception{
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter file name, including the extension: ");
        String fileName = reader.nextLine();

        File myFile = new File(fileName);


        reader = new Scanner(myFile);

        double yearlySum=0;
        double[] quarterlySum = new double[4];
        int count = 0;

        while(reader.hasNextDouble()){
            double sales = reader.nextDouble();
            yearlySum += sales;
            int quarter = count % 4;
            quarterlySum[quarter] += sales;
            count++;

        }
        System.out.println(yearlySum);
        for(int i=0 ; i<4 ; i++){
            System.out.println(quarterlySum[i]);
        }
    }
}
