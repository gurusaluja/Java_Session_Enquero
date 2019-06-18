package com.gurusaluja;
import java.util.Scanner;

public class InputCalculator{

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long AVG = 0;
        int counter = 0;


        while(true){
            //System.out.println("Enter int number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                sum += number;
                counter ++;


            } else {

                break;
            }
            scanner.nextLine();
        }

        AVG = (long) Math.round((double) sum / counter);
        System.out.println(" SUM = " + sum + " AVG = " + AVG);
        scanner.close();
    }

}
