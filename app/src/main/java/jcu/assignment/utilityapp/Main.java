package jcu.assignment.utilityapp;

public class Main {
    //get spinner variables
    //test variable to find equation match
    //use equation

    public int checkNumber(int i) {
        int number = i;
        return number;
    }

    public static String getEquation(String spinner) {
        String equation;
        if (spinner.equals("grams to tab")) {
            equation = "3";
        } else {
            equation = "1";
        }
        return equation;
    }

    public static int calculateResult(int i, int e) {
        int unitType = i;
        int equation = e;

        int result = unitType * equation;
        return result;
    }
}
