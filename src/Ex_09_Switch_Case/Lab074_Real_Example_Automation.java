package Ex_09_Switch_Case;

import java.util.Scanner;

public class Lab074_Real_Example_Automation {

    public static void main(String[] args) {

        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

        // String browser  = args[0];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name : ");
        String browser = scanner.next(); // Method use for string .next
        browser = browser.toLowerCase(); // lower(Chrome, CHROME, CHrome) == chrome

        switch(browser) {

            case "chrome" :
                System.out.println("Staring the chrome !!");
                System.out.println(" TC_01 ");
                System.out.println(" TC_02 ");
                System.out.println(" .... ");
                break;
            case "firefox" :
                System.out.println("Starting firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firefox(); // Selenium Code
                break;
            case "edge" :
                System.out.println("Execute the edge browser code");
                break;
            default :
                System.out.println("I don't have any idea which browser is this !?");
        }
    }
}
