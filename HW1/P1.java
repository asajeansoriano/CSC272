import java.io.File;
import java.util.*;

public class P1 {

    private double value;
    private String fromUnit;
    private String toUnit;
    //String dictionary where the key is the unit and the value is the conversion factor
    static HashMap<String, Double> length = new HashMap<String, Double>();
    static HashMap<String, Double> mass = new HashMap<String, Double>();
    static HashMap<String, Double> volume = new HashMap<String, Double>();


    public static void main(String[] args) {
        //meters is the base unit for length
        length.put("meters", 1.0);
        length.put("inches", 39.37008);
        length.put("feet", 3.28084);
        length.put("yards", 1.09361);
        length.put("miles", 0.000621371);
        //gram is the base unit for mass
        mass.put("grams", 1.0);
        mass.put("ounces", 0.035274);
        mass.put("pounds", 0.00220462);
        mass.put("tons", 0.0000011023);
        //liter is the base unit for volume
        volume.put("liters", 1.0);
        volume.put("gallons", 0.2641720524);
        volume.put("pints", 2.11338);

        //take in question from user input
        System.out.println("Please enter the question you would like to convert: ");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();
        //remove the ? at the end of the question
        question = question.substring(0, question.length() - 1);

        //split the question into three parts: value, fromUnit, toUnit
        // For example: "How many inches are in 2 meters?"
        // value = 2, fromUnit = "meters", toUnit = "inches"
        String[] questionSplit = question.split(" ");
        //convert the value to a double
        double value = Double.parseDouble(questionSplit[5]);
        //convert the fromUnit to a string
        String fromUnit = questionSplit[6];
        //convert the toUnit to a string
        String toUnit = questionSplit[2];
        //convert the value from the fromUnit to the toUnit
        double convertedValue = convert(fromUnit, toUnit, value);
        System.out.println(convertedValue);
        input.close();
    }

    private static boolean isSameProperty(String fromUnit, String toUnit) {
        //check length, mass, and time to see if FromUnit and ToUnit are in the same category
        if (length.containsKey(fromUnit) && length.containsKey(toUnit)) {
            return true;
        } else if (mass.containsKey(fromUnit) && mass.containsKey(toUnit)) {
            return true;
        } else if (volume.containsKey(fromUnit) && volume.containsKey(toUnit)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static double convert(String fromUnit, String toUnit, double value) {
        if (!isSameProperty(fromUnit, toUnit)) {
            //if the units are not in the same category, return error message
            System.out.println("Error: invalid conversion");
            return -1;
        }
        
        // if the fromUnit is the base unit
        if (fromUnit.equals("meters")) {
            return value * length.get(toUnit);
        } else if (fromUnit.equals("grams")) {
            return value * mass.get(toUnit);
        } else if (fromUnit.equals("liters")) {
            return value * volume.get(toUnit);
        }

        //if the toUnit is the base unit
        if (toUnit.equals("meters")) {
            return value / length.get(fromUnit);
        } else if (toUnit.equals("grams")) {
            return value / mass.get(fromUnit);
        } else if (toUnit.equals("liters")) {
            return value / volume.get(fromUnit);
        }

        //if neither the fromUnit nor the toUnit is the base unit
        if (length.containsKey(fromUnit) && length.containsKey(toUnit) && !toUnit.equals("meters") && !fromUnit.equals("meters")) {
            return value * length.get(toUnit) / length.get(fromUnit);
        }
        if (mass.containsKey(fromUnit) && mass.containsKey(toUnit) && !toUnit.equals("grams") && !fromUnit.equals("grams")) {
            return value * mass.get(toUnit) / mass.get(fromUnit);
        }
        if (volume.containsKey(fromUnit) && volume.containsKey(toUnit) && !toUnit.equals("liters") && !fromUnit.equals("liters")) {
            return value * volume.get(toUnit) / volume.get(fromUnit);
        }

        return -1;
    }
    
    

    
}
