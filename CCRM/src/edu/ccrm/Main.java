package edu.ccrm;

import edu.ccrm.cli.CCRMConsole;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Campus Course & Records Manager (CCRM)");
        CCRMConsole console = new CCRMConsole();
        console.run();
        System.out.println("Thank you for using CCRM. Goodbye!");
    }
}


