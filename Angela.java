import java.util.Scanner;
import java.util.Random;

/**
 * The Angela class represents a virtual pet named Angela.
 * <p>
 * Angela implements the Pet interface and allows the user
 * to interact with her through various commands such as
 * playing, feeding, resting, talking, and viewing stats.
 * </p>
 */
public class Angela implements Pet {

    /** The name of the pet */
    private String name;

    /** Represents Angela's health level */
    private int health;

    /** Represents Angela's energy level */
    private int energy;

    /** Represents Angela's happiness level */
    private int happiness;

    /** Random object used for triggering random events */
    private Random rand;

    /**
     * Constructs a new Angela pet with default stats.
     *
     * @param name the name given to Angela
     */
    public Angela(String name) {
        this.name = name;
        this.health = 80;
        this.energy = 80;
        this.happiness = 80;
        this.rand = new Random();
    }

    /**
     * Displays Angela's command menu and processes user input.
     * <p>
     * The menu allows the user to interact with Angela until
     * the user types "quit".
     * </p>
     */
    @Override
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        String command = "";

        System.out.println("You adopted Angela! Commands: play, feed, rest, stats, talk, quit");

        while (!command.equals("quit")) {
            System.out.print("> ");
            command = scanner.nextLine().toLowerCase();

            if (command.equals("play")) {
                play();
            } else if (command.equals("feed")) {
                feed();
            } else if (command.equals("rest")) {
                rest();
            } else if (command.equals("stats")) {
                showStats();
            } else if (command.equals("talk")) {
                talk();
            } else if (!command.equals("quit")) {
                System.out.println("Unknown command.");
            }
        }

        System.out.println("Goodbye from Angela!");
    }

    /**
     * Allows Angela to play.
     * <p>
     * Playing decreases energy, increases happiness,
     * and may trigger a random event.
     * </p>
     */
    public void play() {
        System.out.println(name + " is playing!");
        energy -= 10;
        happiness += 15;
        randomEvent();
    }

    /**
     * Feeds Angela.
     * <p>
     * Feeding increases energy and health and may
     * trigger a random event.
     * </p>
     */
    public void feed() {
        System.out.println("You feed " + name + ".");
        energy += 20;
        health += 10;
        randomEvent();
    }

    /**
     * Allows Angela to rest.
     * <p>
     * Resting increases energy and slightly increases health.
     * </p>
     */
    public void rest() {
        System.out.println(name + " is resting...");
        energy += 30;
        health += 5;
    }

    /**
     * Triggers a random event that may positively or negatively
     * affect Angela's stats.
     */
    private void randomEvent() {
        int chance = rand.nextInt(100);

        if (chance < 30) {
            System.out.println("Random Event: " + name + " found a toy! Happiness +10");
            happiness += 10;
        } else if (chance < 50) {
            System.out.println("Random Event: " + name + " tripped a bit. Health -5");
            health -= 5;
        }
    }

    /**
     * Allows the user to talk to Angela.
     * <p>
     * Angela repeats whatever the user types.
     * </p>
     */
    public void talk() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Say something to Angela: ");
        String userInput = scanner.nextLine();
        System.out.println(name + " repeats: \"" + userInput + "\"");
    }

    /**
     * Displays Angela's current statistics including
     * health, energy, and happiness.
     */
    public void showStats() {
        System.out.println("---- " + name + "'s Stats ----");
        System.out.println("Health: " + health);
        System.out.println("Energy: " + energy);
        System.out.println("Happiness: " + happiness);
        System.out.println("------------------------");
    }
}
