/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adventure;

import java.util.Scanner;
import prompts.PromptOne;

/**
 *
 * @author Hassan
 */
public class Adventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        final Scanner scanner = new Scanner(System.in); // Start the keyboard
        System.out.println("> Insert name...");
        System.out.print("\tName: ");
        
        String name = scanner.nextLine(); // Get the persons name
        
        System.out.println("> Confirmed. Welcome " + name);
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.print("> Would you like to begin?\n\t> ");
        
        String confirmation = scanner.nextLine(); // Get their confirmation
        
        if (!confirmation.equalsIgnoreCase("yes")) { // If they answer yes do this
            System.out.println("> Okay then, loser. Bye");
            return; // End this
        }
        
        System.out.println("> LOADING...");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("> It's 2042, Elon Musk was recently exposed that he is infact an alien");
        Thread.sleep(3000L); // Put a small 3 second break
        System.out.println("> Since then the U.S. Military has captured and arrested him.");
        Thread.sleep(3000L); // Put a small 3 second break
        System.out.println("> In retaliation, the alien civilization from the Draco II galaxy has threatened to invade the planet.");
        Thread.sleep(3000L); // Put a small 3 second break
        System.out.println("> The alien society gave us until November 4th 2042 to release Elon Musk or we'll suffer severe concequences. The military denied.");
        Thread.sleep(3000L); // Put a small 3 second break
        System.out.println("> It is now December 2nd 2042 and billions of people have been killed or captured by the alien civilization.");
        Thread.sleep(3000L); // Put a small 3 second break
        System.out.println("> The rest of humans remain on the planet, hiding, running from the enivtable. There are approximately 1,000 of us left.");
        Thread.sleep(3000L); // Put a small 3 second break
        System.out.println("> You, " + name + " are one of them.");
        Thread.sleep(3000L); // Put a small 3 second break
        
        for (int i = 0; i < 20; i++) { // Put a big space for 20 lines
            System.out.println("");
        }
        
        System.out.println("Drake > Psst... " + name + " over here...");
        Thread.sleep(3000L); // Put a small 3 second break
        System.out.println("> An alien is guarding one of their motherships docked on the Los Angeles bay.");
        Thread.sleep(3000L); // Put a small 3 second break
        System.out.println("Drake > Should we take him out? There's no way we can get around him we're trapped...");
        
        new PromptOne(name, scanner); // Start the next one
    }
    
}
