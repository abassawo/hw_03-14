package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/7/15.
 */
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner gameInput = new Scanner(System.in);
        int Portal;

        System.out.println("You are trapped in an alternate universe, and you need to solve some clues to escape");
        System.out.print("\nPortal 1 requires you to " +
                "solve a logic game to move to the next level." + "\nPortal 2 requires you to solve a mystery" +
                "\nPortal 3 requires you to solve a riddle " + "\nPortal 4 is unknown " +
                "\nWhich portal would you like to enter?");
        Portal = gameInput.nextInt();
        System.out.println("You chose " + Portal);


    }
}
