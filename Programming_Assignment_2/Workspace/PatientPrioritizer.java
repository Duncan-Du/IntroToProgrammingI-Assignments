public class PatientPrioritizer {

    // add your code


    // Takes in an integer input.
    // Returns true if the integer has 5 digits, and false otherwise.
    public static boolean fiveDigits(int val) {
        val = val / 10000; // get first digit
        if (val == 0) { // has less than 5 digits
            return false;
        } else if (val / 10 == 0) { // has 5 digits
            return true;
        } else { // has more than 5 digits
            return false; 
        }
        // NOTE: the above can be written with improved "boolean zen" as follows: 
        // return val != 0 && val / 10 == 0;
    }
}
