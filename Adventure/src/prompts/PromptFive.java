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
public class PromptFive {
    public static List<String> yesAnswers = Arrays.asList("jump", "go", "yes");
    
    public PromptFive(String name, Scanner scanner) throws InterruptedException {
        
        System.out.println("> What do you do?");
        System.out.println("\t> 'Jump' or 'Stay'?\n");
        System.out.print("> Your choice: ");
        
        String choice = scanner.nextLine(); // Find new option
        
        if (yesAnswers.stream().noneMatch(it -> choice.contains(it))) { // Check if their choice isn't a yes type of answer in the list above
            System.out.println("You > Let them capture us.");
            Thread.sleep(1000L);
            System.out.println("> The Alien Guards come and kill you and Drake.");
            Thread.sleep(1000L);
            System.out.println("> You died.");
            return; // Stop the operation
        }
        
        System.out.println("> You and the group jumps into the ocean below.");
        Thread.sleep(1000L);
        System.out.println("> One of the kids die, you and 82 others live.");
        System.out.println("> You successfully rescued the prisoners and lived. Congratulations " + name);
    }
    
}
