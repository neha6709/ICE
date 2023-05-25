
package helloworld;

import java.util.Scanner;


/**
 *
 * @author Neha
 */
public class HelloWorld {

    
    public static void main(String[] args) {
       
    String name;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter name:" );
    name = sc.nextLine();
    char[] revString = new char[name.length()]; // Create a char array of the same length as the word
    for (int i = 0; i < name.length(); i++) {
        revString[i] = name.charAt(i); // Store each character in the array
    }
    for (int i = revString.length - 1; i >= 0; i--) {
        System.out.print(revString[i]); // Iterate backwards over the array and print each character
        System.out.println("Neha");
        System.out.println("N");
    }
}
}
