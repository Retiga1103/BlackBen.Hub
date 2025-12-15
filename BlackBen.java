import java.util.Scanner;

/**
 * The BlackBen class is the main driver for the Virtual Pet Simulator.
 * <p>
 * It allows the user to choose between different types of pets,
 * name them, and interact with them using polymorphism.
 * </p>
 */
public class BlackBen {

    /**
     * The main method runs the Virtual Pet Simulator program.
     * <p>
     * It displays a menu, accepts user input, creates pet objects
     * based on user choice, and launches each pet's interaction menu.
     * </p>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // <-- Add this line to declare Scanner

        // Stores the user's menu choice
        int choice = 0;

        System.out.println("Welcome to the Virtual Pet Simulator!");

        /**
         * Main loop that continues running until the user chooses to quit.
         */
        while (choice != 6) {

            // Display pet selection menu
            System.out.println("\nWhich pet do you want to interact with?  MAKE SURE TO PUT A NUM");
            System.out.println("1. T-Rex");
            System.out.println("2. Angela");
            System.out.println("3. Ben");
            System.out.println("4. Tom");
            System.out.println("5. Dragon");
            System.out.println("6. Quit");
            System.out.print("Enter choice: ");

            // Read numeric choice from user
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline

            // Polymorphic reference to a Pet object
            Pet pet = null;

            // Stores the name of the pet
            String name;

            /**
             * Create a pet object based on the user's choice.
             */
            if (choice == 1) {
                System.out.print("Name your T-Rex: ");
                name = scanner.nextLine();
                pet = new TRex(name);

            } else if (choice == 2) {
                System.out.print("Name your Angela: ");
                name = scanner.nextLine();
                pet = new Angela(name);

            } else if (choice == 3) {
                System.out.print("Name your Ben: ");
                name = scanner.nextLine();
                pet = new Ben(name);

            } else if (choice == 4) {
                System.out.print("Name your Tom: ");
                name = scanner.nextLine();
                pet = new Tom(name);

            } else if (choice == 5) {
                System.out.print("Name your Dragon: ");
                name = scanner.nextLine();
                pet = new Dragon(name);

            } else if (choice == 6) {
                // Exit the program
                System.out.println("Thanks for playing! Goodbye!");
                break;

            } else {
                // Handle invalid menu choices
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            /**
             * Launch the selected pet's interaction menu.
             */
            if (pet != null) {
                pet.menu();
            }
        }

        // Close scanner resource
        scanner.close();
    }
}
