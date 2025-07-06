package Ex_09_Switch_Case;

import java.util.Scanner;

public class Lab072_Switch_without_break {

    public static void main(String[] args) {

        // Switch Case Program - Without break

        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> mon, 5 -> fri
        // 8 ? - Not allowed or error

        //int day = Integer.parseInt(args[0]); - CLI option

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7 : ");


        if (scanner.hasNextInt()) {

            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("It's Monday");
                    break;
                case 2:
                    System.out.println("It's Tuesday");
                    break;
                case 3:
                    System.out.println("It's Wednesday");
                    break;
                case 4:
                    System.out.println("It's Thursday");
                    break;
                case 5:
                    System.out.println("Its's Friday");
                    break;
                case 6:
                    System.out.println("It's Saturday");
                    break;
                case 7:
                    System.out.println("It's Happy Sunday");
                    break;
                default:
                    System.out.println("You're entering wrong number");
            }
            }
             else
            {
                System.out.println("Please enter integer only !!");
            }

        }
    }

