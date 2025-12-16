import java.util.Random;
import java.util.Scanner;

/**
 * The TRex class represents a powerful and dangerous virtual T-Rex pet.
 * <p>
 * The T-Rex has hunger, mood, energy, and life status. Poor management
 * of its stats may result in the T-Rex becoming hostile or dying.
 * </p>
 */
public class TRex implements Pet {

    /** The name of the T-Rex */
    private String name;

    /** Hunger level of the T-Rex */
    private int hunger;

    /** Mood level of the T-Rex */
    private int mood;

    /** Energy level of the T-Rex */
    private int energy;

    /** Indicates whether the T-Rex is alive */
    private boolean alive;

    /** Random object for future random behavior */
    private Random rand;

    /**
     * Constructs a new T-Rex with default statistics.
     *
     * @param name the name given to the T-Rex
     */
    public TRex(String name) {
        this.name = name;
        hunger = 40;
        mood = 70;
        energy = 60;
        alive = true;
        rand = new Random();
    }

    /**
     * Feeds the T-Rex.
     * <p>
     * Feeding reduces hunger, slightly improves mood,
     * and decreases energy.
     * </p>
     */
    public void feed() {
        System.out.println(name + " eats a giant cow! Yum!");
        hunger -= 20;
        mood += 5;
        energy -= 5;
        checkStats();
    }

    /**
     * Allows the T-Rex to play.
     * <p>
     * Playing increases mood but raises hunger and
     * significantly decreases energy.
     * </p>
     */
    public void play() {
        System.out.println(name + " runs around and almost steps on you!");
        mood += 15;
        hunger += 10;
        energy -= 20;
        checkStats();
    }

    /**
     * Allows the T-Rex to rest.
     * <p>
     * Resting restores energy but increases hunger
     * and slightly decreases mood.
     * </p>
     */
    public void rest() {
        System.out.println(name + " takes a huge nap.");
        energy += 25;
        hunger += 10;
        mood -= 5;
        checkStats();
    }

    /**
     * Makes the T-Rex roar.
     * <p>
     * Roaring boosts mood but reduces energy.
     * </p>
     */
    public void roar() {
        System.out.println(name + " ROARS loudly! The ground shakes!");
        mood += 10;
        energy -= 10;
        checkStats();
    }

    /**
     * Prints the current statistics of the T-Rex.
     */
    public void printStats() {
        System.out.println("\n--- " + name + "'s Stats ---");
        System.out.println("Hunger: " + hunger);
        System.out.println("Mood: " + mood);
        System.out.println("Energy: " + energy);
        System.out.println("Alive: " + alive);
        System.out.println("--------------------\n");
    }

    /**
     * Checks whether the T-Rex is alive.
     *
     * @return true if the T-Rex is alive, false otherwise
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * Ensures all stats remain within valid ranges and
     * handles dangerous conditions.
     * <p>
     * If hunger becomes too high, the T-Rex dies.
     * If energy becomes critically low, the T-Rex
     * becomes aggressive.
     * </p>
     */
    private void checkStats() {
        if (hunger < 0) hunger = 0;
        if (hunger > 100) hunger = 100;
        if (mood < 0) mood = 0;
        if (mood > 100) mood = 100;
        if (energy < 0) energy = 0;
        if (energy > 100) energy = 100;

        if (hunger >= 90) {
            System.out.println(name + " is starving and EATS YOU!");
            alive = false;
        }

        if (energy <= 10 && alive) {
            System.out.println(name + " is exhausted and goes on a rampage!");
            mood += 10;
            hunger += 15;
        }
    }

    /**
     * Displays the T-Rex interaction menu and processes user choices.
     * <p>
     * The menu continues until the user quits or the T-Rex dies.
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
            System.out.println("4. Roar (special)");
            System.out.println("5. Quit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            if (choice == 1) feed();
            else if (choice == 2) play();
            else if (choice == 3) rest();
            else if (choice == 4) roar();
            else if (choice == 5) System.out.println("Exiting menu...");
            else System.out.println("Invalid choice.");

            printStats();
        }

        if (!alive) {
            System.out.println(name + " is no longer alive.");
        }
    }
}
