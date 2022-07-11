import java.io.File;
import java.util.*;

// Metric Conversions
// User should specify names of units as strings

public class P1 {
    

    
    public class MetricConverter {
        private double value;
        private String fromUnit;
        private String toUnit;
        //String dictionary where the key is the unit and the value is the conversion factor
        //meters is the base unit for length
        static HashMap<String, Double> length = new HashMap<String, Double>();
        //gram is the base unit for mass
        static HashMap<String, Double> mass = new HashMap<String, Double>();
        //seconds is the base unit for time
        static HashMap<String, Double> time = new HashMap<String, Double>();


        public static void main(String[] args) {
            //create file input steam to read from file length_conversions.txt
            Scanner file = new Scanner(new File("length_conversions.txt"));
        }

        private static boolean isSameProperty(String fromUnit, String toUnit) {
            //check length, mass, time, and temperature to see if FromUnit and ToUnit are in the same list
            if (Arrays.asList(length).contains(fromUnit) && Arrays.asList(length).contains(toUnit)) {
                return true;
            } else if (Arrays.asList(mass).contains(fromUnit) && Arrays.asList(mass).contains(toUnit)) {
                return true;
            } else if (Arrays.asList(time).contains(fromUnit) && Arrays.asList(time).contains(toUnit)) {
                return true;
            }
            return false;
            
        }
        
        public static double convert(String fromUnit, String toUnit, double value) {
            //remove "s" from the end of the unit name
            if (fromUnit.endsWith("s")) {
                fromUnit = fromUnit.substring(0, fromUnit.length() - 1);
            }
            //if it is "inches" remove "es" from the end of the unit name
            if (fromUnit.endsWith("es")) {
                fromUnit = fromUnit.substring(0, fromUnit.length() - 2);
            }
            //if fromUnit is "feet", change it to "foot"
            if (fromUnit.equals("feet")) {
                fromUnit = "foot";
            }
            if (!isSameProperty(fromUnit, toUnit)) {
                //if the units are not in the same list, return error message
                System.out.println("Error: invalid conversion");
                return -1;
            }

            
            
        }
    }
    
    
}
