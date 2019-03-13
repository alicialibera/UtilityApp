package jcu.assignment.utilityapp;

import java.util.Scanner;

public class Main {
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

        int result = totalNumber;
        return result;
    }

    public static int getUnitTypes() {
        int result = 2;
        return result;
    }
}
