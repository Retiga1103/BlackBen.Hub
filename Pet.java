/**
 * The Pet interface defines the common behavior for all virtual pets
 * in the Virtual Pet Simulator.
 * <p>
 * Any class that implements this interface must provide
 * a menu method that allows the user to interact with the pet.
 * </p>
 */
public interface Pet {

    /**
     * Displays the pet's interaction menu.
     * <p>
     * Implementing classes define their own menu options
     * and behavior for interacting with the pet.
     * </p>
     */
    void menu();
}
