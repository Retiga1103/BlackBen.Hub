import java.util.Scanner;

/**
 * The Dragon class represents a powerful virtual dragon pet.
 * <p>
 * The dragon has health, energy, happiness, and a life state.
 * Users can feed, play, rest, or use the dragon's special
 * Fire Lab ability to interact with it.
 * </p>
 */
public class Dragon implements Pet {

    /** The name of the dragon */
    private String name;

    /** Dragon's health level */
    private int health;

    /** Dragon's energy level */
    private int energy;

    /** Dragon's happiness level */
    private int happiness;

    /** Indicates whether the dragon is alive */
    private boolean alive;

    /**
     * Constructs a new Dragon pet with default statistics.
     *
     * @param name the name given to the dragon
     */
    public Dragon(String name) {
        this.name = name;
        health = 80;
        energy = 80;
        happiness = 80;
        alive = true;
    }

    /**
     * Feeds the dragon.
     * <p>
     * Feeding increases energy and happiness, then
     * validates the dragon's stats.
     * </p>
     */
    public void feed() {
        System.out.println(name + " devours a whole goat!");
        energy += 15;
        happiness += 5;
        checkStats();
    }

    /**
     * Allows the dragon to play.
     * <p>
     * Playing increases happiness but decreases energy.
     * </p>
     */
    public void play() {
        System.out.println(name + " plays by flying around and doing loops!");
        happiness += 15;
        energy -= 10;
        checkStats();
    }

    /**
     * Allows the dragon to rest.
     * <p>
     * Resting restores energy but slightly decreases happiness.
     * </p>
     */
    public void rest() {
        System.out.println(name + " curls up on a pile of gold and sleeps.");
        energy += 25;
        happiness -= 5;
        checkStats();
    }

    /**
     * Launches the Dragon's special Fire Lab ability.
     * <p>
     * The user combines two elements to produce a
     * powerful mystical result.
     * </p>
     */
    public void fireLab() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== FIRE LAB ===");
        System.out.println("Choose two elements to combine:");
        System.out.println("(fire, smoke, ember, ash, lightning, frost)");

        System.out.print("First element: ");
        String e1 = scanner.nextLine().toLowerCase();

        System.out.print("Second element: ");
        String e2 = scanner.nextLine().toLowerCase();

        if ((e1.equals("fire") && e2.equals("smoke")) || (e1.equals("smoke") && e2.equals("fire"))) {
            System.out.println("Result: " + name + " creates a FIRE TORNADO!");
        } 
        else if ((e1.equals("ember") && e2.equals("ash")) || (e1.equals("ash") && e2.equals("ember"))) {
            System.out.println("Result: DRAGON EXPLOSION BURSTS!");
        } 
        else if ((e1.equals("lightning") && e2.equals("fire")) || (e1.equals("fire") && e2.equals("lightning"))) {
            System.out.println("Result: MEGA DRAGON BLAST!");
        }
        else {
            System.out.println("Something mystical happens!");
        }

        happiness += 10;
        energy -= 10;
        checkStats();
    }

    /**
     * Prints the dragon's current statistics including
     * health, energy, happiness, and life status.
     */
    public void printStats() {
        System.out.println("\n--- " + name + "'s Stats ---");
        System.out.println("Health: " + health);
        System.out.println("Energy: " + energy);
        System.out.println("Happiness: " + happiness);
        System.out.println("Alive: " + alive);
        System.out.println("--------------------\n");
    }

    /**
     * Ensures all dragon stats stay within valid ranges.
     * <p>
     * Stats are clamped between 0 and 100, and the dragon
     * is marked dead if health reaches zero.
     * </p>
     */
    private void checkStats() {
        if (health < 0) health = 0;
        if (health > 100) health = 100;

        if (energy < 0) energy = 0;
        if (energy > 100) energy = 100;

        if (happiness < 0) happiness = 0;
        if (happiness > 100) happiness = 100;

        if (health <= 0) alive = false;
    }

    /**
     * Displays the dragon's interaction menu and processes user choices.
     * <p>
     * The menu continues until the dragon dies or the user quits.
     * </p>
     */
    @Override
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (alive && choice != 5) {
            System.out.println("\nWhat do you want " + name + " to do?");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Rest");
            System.out.println("4. Fire Lab (special)");
            System.out.println("5. Quit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) feed();
            else if (choice == 2) play();
            else if (choice == 3) rest();
            else if (choice == 4) fireLab();
            else if (choice == 5) System.out.println("Exiting menu...");
            else System.out.println("Invalid choice.");

            printStats();
        }

        if (!alive) {
            System.out.println(name + " has perished...");
        }
    }
}
