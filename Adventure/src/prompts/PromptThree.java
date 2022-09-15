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
public class PromptThree {
    public static List<String> yesAnswers = Arrays.asList("yes", "yeah", "right");
    
    public PromptThree(String name, Scanner scanner) throws InterruptedException {
        
        System.out.println("> You run with the group and are faced with two hallways.");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("> Where do you go? Left or Right?");
        System.out.println("\t> Where do you go? Left or Right?\n");
        System.out.print("> Your choice: ");
        
        String choice = scanner.nextLine(); // Find new option
        
        if (yesAnswers.stream().noneMatch(it -> choice.contains(it))) { // Check if their choice isn't a yes type of answer in the list above
            System.out.println("You > Let's go right.");
            Thread.sleep(1000L); // Put a small 1 second break
            System.out.println("> You turn around a curb, 5 guards see you and start running to you.");
            Thread.sleep(1000L); // Put a small 1 second break
            System.out.println("Alien Guard > hsje jsjesl.");
            Thread.sleep(1000L); // Put a small 1 second break
            System.out.println("> You died.");
            return; // Stop the operation
        }
        
        System.out.println("> You and the rest of your new friends run with you and find a younger alien.");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("Random Man > You can't kill them. That's wrong they're just a kid!");
        new PromptFour(name, scanner); // Run the next prompt
    }
    
}
