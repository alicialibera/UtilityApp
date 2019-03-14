package jcu.assignment.utilityapp;

import java.util.ArrayList;
import java.util.List;

public class UnitTypes {
    List<String> getUnitTypes(String spinner) {
        List<String> units = new ArrayList<String>();
        if (spinner.equals("A")) {
            units.add("2");
        }
        return units;
    }
}