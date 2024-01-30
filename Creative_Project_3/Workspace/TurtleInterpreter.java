import java.util.*;
import java.io.*;

public class TurtleInterpreter {
    public static void main(String[] args) throws FileNotFoundException {
        // comment out line 8 and uncomment line 9 once you have completed
        // your instructions file for your Task 3 picture
        Scanner fileScan = new Scanner(new File("instructions.txt"));
        // Scanner fileScan = new Scanner(new File("my_picture_instructions.txt"));
        Turtle t = new Turtle();

        while (/* TODO: Fill in with appropriate condition */) {

            // TODO: Read in line from file and make Scanner over it
            //       Read in the first token from new Scanner and store 
            //       it in the variable 'String command'

            if (command.equals("Forwards")) { 
                double distance = lineScan.nextDouble(); // Read in param
                t.forward(distance); // Go forwards by distance
            } else if (command.equals("Backwards")) {
                // TODO: Read in parameter and execute "Backwards" command

            } else if () {
                // TODO: Implement remaining commands by extending this conditional structure
                //       Make sure to also deal with invalid commands as noted in spec

            }
        }
    }
}
