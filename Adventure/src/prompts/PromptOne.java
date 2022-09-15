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
public class PromptOne {
    public static List<String> yesAnswers = Arrays.asList("yes", "yeah", "do it", "take him out", "him out", "out");
    
    public PromptOne(String name, Scanner scanner) throws InterruptedException {
        
        System.out.println("> What do you want to do?");
        System.out.println("\t> Take him out or not?\n");
        System.out.print("> Your choice: ");
        
        String choice = scanner.nextLine(); // Get their choice
        
        if (yesAnswers.stream().noneMatch(it -> choice.contains(it))) { // Check if their choice isn't a yes type of answer in the list above
            System.out.println("Drake > Okay let's just go.");
            Thread.sleep(1000L); // Put a small 1 second break
            System.out.println("> You trip over a rock and make a loud thud.");
            Thread.sleep(1000L); // Put a small 1 second break
            System.out.println("Alien Guard > bst jeskd oeso?");
            Thread.sleep(1000L); // Put a small 1 second break
            System.out.println("Drake > Oh no...");
            Thread.sleep(1000L); // Put a small 1 second break
            System.out.println("> Five guards run to the Alien Guard. They move into your position");
            Thread.sleep(1000L); // Put a small 1 second break
            System.out.println("Alien Guard > jms riwkso wdkwkd.");
            Thread.sleep(1000L); // Put a small 1 second break
            System.out.println("> The guards kill you and Drake.");
            return; // Stop the operation
        }
        
        System.out.println("> You take out the guard and grab his weapon going un-noticed.");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("Drake > Wow man, good stuff.");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("> You walk aboard the mothership and hide in one of the hallways");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("Drake > What next?");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("You > We free the people.");
        
        new PromptTwo(name, scanner);
    }
    
}
