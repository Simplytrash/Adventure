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
public class PromptFour {
    public static List<String> yesAnswers = Arrays.asList("yes", "blast");
    
    public PromptFour(String name, Scanner scanner) throws InterruptedException {
        
        System.out.println("> What do you want to do?");
        System.out.println("\t> 'Blast Him' or 'Keep running'?\n");
        System.out.print("> Your choice: ");
        
        String choice = scanner.nextLine(); // Find new option
        
        if (yesAnswers.stream().noneMatch(it -> choice.contains(it))) { // Check if their choice isn't a yes type of answer in the list above
            System.out.println("> You leave the kid and keep running.");
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
        
        System.out.println("> You blast the kid. He's now dead.");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("Everyone > Gasps");
        System.out.println("Drake > What? You killed him!");
        System.out.println("Random Woman > He's just a kid!");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("You > Sometimes the hardest choices require the strongest wills.");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("Drake > Fine, where to next?");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("You > We're close to the door.");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("> You and the group approach the door, open it and notice you're high in the sky.");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("Random Man > What do we do? We're to high up!");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("Alien Guards > ehwhs owks wowjdk.");
        System.out.println("> Alien Guards are running in you and the groups direction. They are far away however will be there in a matter of seconds!");
        Thread.sleep(1000L); // Put a small 1 second break
        System.out.println("Drake > Do we jump?");
        Thread.sleep(1000L); // Put a small 1 second break
        new PromptFive(name, scanner); // Start next prompt
    }
    
}
