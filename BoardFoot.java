// Import scanner class to get input.
import java.util.Scanner;

/** .
* This calculates .
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-03-03
*/

// Creating class
public final class BoardFoot {

    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private BoardFoot() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */

    public static void main(final String[] args) {

        // Declare and initialize variables
        String widthString = "";
        String heightString = "";
        double width = 0;
        double height = 0;
        double lengthResult = 0;

        // Welcome and get user input
        System.out.print("Calculates the length for a board foot");
        System.out.println(" with given width and height. ");
        System.out.println("Please enter a width(in): ");

        // Create scanner object
        Scanner scanner = new Scanner(System.in);

        // Assign user input to variable
        widthString = scanner.nextLine();

        // Get height
        System.out.println("Please enter a height(in): ");

        // Assign user input to variable
        heightString = scanner.nextLine();

        // try converting height to double
        try {

            // Try casting input to double and assigning to variable
            height = Double.parseDouble(heightString);

            // Check if guess is out of range
            if (height < 0) {

                // If out of range tell user
                System.out.println(height + " cannot be negative");

                // Otherwise try casting width
            } else {

                // Try casting width to double
                try {
                    width = Double.parseDouble(widthString);

                    // Check if number is negative
                    if (width < 0) {

                        // Tell user number is negative
                        System.out.println("No negative width: " + width);

                        // Call function to calculate length
                    } else {
                        lengthResult = calculateLength(width, height);

                        // Print result to user
                        System.out.print("The length of a board with ");
                        System.out.print("a width of " + width + "in and a");
                        System.out.print("height of " + height + "in is ");
                        System.out.format("%.2f", lengthResult);
                        System.out.println("in");
                    }

                    // Catch invalid width and tell user
                } catch (NumberFormatException error) {
                    System.out.println("Please enter a valid input. "
                            + error.getMessage());
                }
            }

            // Catch invalid height and tell user
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid input. "
                    + error.getMessage());
        }

        // Close scanner
        scanner.close();
    }
    // Function to calculate length
    public static double calculateLength(final double width,
             final double height) {
        // Declare volume
        double volume = 144;

        // Calculate length and return
        return volume / (width * height);
    }
}
