package jcu.assignment.utilityapp;

import java.util.Scanner;
import android.view.View;
import android.widget.TextView;

public class Main {
    //get use input through input_text
    //print result through output_text
    //add working spinner
    //code spinner options

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
    }

    public int convertUnit(int i) {
        int number = i;
        int conversionType;
        conversionType = getUnitTypes();

        int totalNumber;
        totalNumber = number * conversionType;

        System.out.println(number);
        System.out.println(conversionType);
        System.out.println(totalNumber);

        int result = totalNumber;
        return result;
    }

//    public int checkNumber(int i) {
//        return i == number;
//    }

    public static int getUnitTypes() {
        int result = 2;
        return result;
    }
}
