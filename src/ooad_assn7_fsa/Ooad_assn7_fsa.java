/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooad_assn7_fsa;

import java.util.Scanner;

/**
 *
 * @author aishwariyatalathi
 */
public class Ooad_assn7_fsa {

    static boolean isfinalstate = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        System.out.println("\n****Finite State Automata Implementation****\n");
        do {
            choice = 0;
            String input = "";
            System.out.println("Enter a String->");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            System.out.println("\n~~~~States Traversed~~~~");
            Context context = new Context();
            // String s = "aabcab";
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'a') {
                    context.Handle_a();
                }
                if (input.charAt(i) == 'b') {
                    context.Handle_b();
                }
                if (input.charAt(i) == 'c') {
                    context.Handle_c();
                }
            }
            String current_state = context.getState();
            if ((current_state.equals("Concrete4")) || (current_state.equals("Concrete5")) || (current_state.equals("Concrete6"))) {
                System.out.println("\nString " + input + " is accepted!");
            } else {
                System.out.println("\nString " + input + " is not accepted!");
            }
            System.out.println("\nPress 1 To Continue.");
            choice = scanner.nextInt();
        } while (choice == 1);
    }
}
