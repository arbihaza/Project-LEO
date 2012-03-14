

/**
 * This is the main class for project LEO.
 * @author alan
 */
import java.util.*;
public class Core {
    /**
     * This method allows the ProjectLEO class to implement the core class.
     */
    public static void Core() {
}

/**
 * This method displays the intro information.
 */
public static void intro(){
        System.out.println("Welcome to the Project LEO compiler!");
        System.out.println("Please enter the code line by line.");
        System.out.println("Press enter after each line.");
}
/**
 * This method displays a tutorial for new users.
 */
public static void tutorial(){
    // TODO Insert tutorial
}
/**
 * This method sets up the compiler for compiling.
 */
public static void setup(){
    System.out.println("Please enter your name.");
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    System.out.println("You may now enter your code");
    
}
}

