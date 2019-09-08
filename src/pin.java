/* Starting code for Assignment 1
 * Student: Jose Soto
 * CISC 3115
 * Brooklyn College, Fall 2019
 */

import java.util.Scanner;

public class pin {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        int tries = 0;
        int maxattempts = 4;

        System.out.println("WELCOME TO THE BANK OF BC.");
        System.out.println("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();
        tries++;

        while ( entry != pin && tries < maxattempts )
        {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.println("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
            tries++;
        }

        if ( entry == pin )
            System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        else if ( tries >= maxattempts )
            System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
    }
}


