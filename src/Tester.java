/**
 * The Tester class contains the main method to test WordGames methods.
 *
 * @author Giovanni
 */
public class Tester {
    public static void main(String[] args) {
        // Create a new WordGames object
        WordGames wordGames = new WordGames();

        // Test the addHelloWord method
        String helloWordResult = wordGames.addHelloWord("world");
        System.out.println("addHelloWord result: " + helloWordResult);

        // Test the getFullName method
        String fullNameResult = wordGames.getFullName("John", "Doe");
        System.out.println("getFullName result: " + fullNameResult);
    }
}