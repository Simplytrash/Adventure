/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prompts;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hassan
 */
public class PromptTwo {
    public static List<String> yesAnswers = Arrays.asList("yes", "yeah", "y");
    
    public PromptTwo(String name, Scanner scanner) throws InterruptedException {
        
        System.out.println("> You approach one of the cells containing humans in the prison part of the ship.");
        System.out.println("Drake > It's sealed tight. How can we unlock it.");
        System.out.println("> You reach into your backpack and pull out a small crowbar");
        System.out.println("Drake > Woah when did you get that? Dude it's going to make tons of sound.");
        System.out.println("");
        System.out.println("\t> Use the crowbar? Yes or No?\n");
        System.out.print("> Your choice: ");
        
        String choice = scanner.nextLine();
        
        if (yesAnswers.stream().noneMatch(it -> choice.contains(it))) { // Check if their choice isn't a yes type of answer in the list above
            System.out.println("> The mission is to free the people, just do it. Mission failed.");
            return; // Stop the operation
        }
        
        System.out.println("> You insert the crowbar, you and Drake pull hard and eventually opens it.");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("Random Woman > Thank you for saving us. What now?");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("You > Uhh I think we sho-");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("> A siren activates, the room goes red");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("Alien on Comms > nsne jsosjejs jrjksm.");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("Elder Man > They just told them where we are!");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("Drake > How do you know what they just said?");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("Elder Man > I understand their language I've been hearing it for months.");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("You > We need to leave. Now!");
        Thread.sleep(1000L); // Put a small 1 second break
        new PromptThree(name, scanner); // Start the next prompt
    }
    
}
