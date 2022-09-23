/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author sshiril
 */
import java.util.*;

public class scannerclass {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]) {
        // TODO code application logic here
        
        

    // creates an object of Scanner
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your name: ");

    // takes input from the keyboard
    String name = input.nextLine();
    //System.out.println("hello");
            

    // prints the name
    System.out.println("My name is " + name);

    // closes the scanner
    Scanner.close();
  
        
        
    }
}
