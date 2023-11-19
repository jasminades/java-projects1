package StudentSelection;

import java.util.Scanner;

public class Selection {
    public static void main(String[] args){
        System.out.println("Enter the number of students: ");
        Scanner reader = new Scanner (System.in);

        int studentsNum = reader.nextInt();
        String[] student = new String[studentsNum];
        int[] age = new int[studentsNum];

        Scanner scanName = new Scanner(System.in);
        Scanner scanAge = new Scanner(System.in);

        for(int i=0 ; i < studentsNum ; i++){
            System.out.println("Enter student name: ");
            student[i] = scanName.nextLine();

            System.out.println("Enter age: ");
            age[i] = scanAge.nextInt();

        }
        for(int i=0 ; i< studentsNum ; i++){
            if(age[i] >= 15){
                System.out.println(student[i] + " can recieve a vaccine");
                System.out.println(student[i] + " is " + age[i] + " years old!");
            }
        }
        reader.close();
        scanName.close();
        scanAge.close();



    }
}
