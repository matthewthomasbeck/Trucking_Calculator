/**********************************************************************************/
/* This code and its associated files were created at the instruction of          */
/* professors at the University of Texas at San Antonio during my time as a       */
/* student at the university. I, as a student, was not responsible for the idea   */
/* behind this code (i.e. project guidelines, functionality, and end purpose),    */
/* but I, Matthew Thomas Beck, can confirm that myself and any project partners   */
/* (if applicable) were the ones responsible for writing it.                      */
/**********************************************************************************/





/************************************************************/
/*************** IMPORT / CREATE DEPENDENCIES ***************/
/************************************************************/


/********** IMPORT UTILITIES **********/

// import utilities for scanner or anything else that may be useful
import java.util.*;





/******************************************************/
/*************** TRUCKING PRIMARY CLASS ***************/
/******************************************************/





public class Trucking { // main class to be used to take user input and then display data with it

    /***** create dependencies *****/

    static Scanner scnr = new Scanner(System.in); // import scanner as class variable


    /********** MAIN FUNCTION **********/

    public static void main(String[] args) { // main function to be called

        /***** create dependencies *****/

        /***** initial print *****/

        // print class and student credentials
        System.out.println("Spring 2024 - CS1083 - Section 001 - Project 1 – Trucking - written by Matthew Beck\n");

        /***** request input *****/

        input(); // call input to request data from the user
    }


    /********** INPUT FUNCTION **********/

    private static void input() { // input function to take user input

        /***** create dependencies *****/

        // used to hold day names
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] days = {0, 1, 2, 3, 4, 5, 6}; // used to hold mon-sun days
        int[] miles = new int[7]; // used to hold miles for each day
        int i, j; // dummy looping variables
        boolean isValid; // used to ensure user input is correct
        int firstDay = 0; // used to find first day, pre-initialized to monday
        String[] holidayOrder = {"First", "Second", "Third"}; // used for holiday Order
        int[] holidays = new int[3]; // used to store holidays
        boolean isRepeated; // used to tell if a day has been repeated or not

        /***** collect miles for each day of the week *****/

        for (i = 0; i < days.length; i++) { // loop 7 times for each day of the week

            isValid = false; // initially set to false for loop

            do { // loop to ask the user for data until correct data is inputted

                System.out.print("Miles driven on " + dayNames[i] + ": "); // prompt user for miles driven data

                if (scnr.hasNextInt()) { // if user correctly inputs data...

                    miles[i] = scnr.nextInt(); // collect miles data

                    isValid = true; // break the loop

                } else { // if user incorrectly inputs data...

                    System.out.println("Please enter an integer."); // ask user for an integer

                    scnr.next(); // take invalid input to avoid infinite loop
                }

            } while (!isValid); // loop so long as isValid is false
        }

        /***** ask for the first day of the month *****/

        do { // loop to ask the user for data until correct data is input

            isValid = false; // initially set to false for loop

            // prompt user for first day of the month
            System.out.print("First day of the month: (0-Mon, 1-Tue, 2-Wed, 3-Thu, 4-Fri, 5-Sat, 6-Sun): ");

            if (scnr.hasNextInt()) { // if user correctly inputs data...

                firstDay = scnr.nextInt(); // collect miles data

                if (firstDay >= 0 && firstDay <= 6) { // if correct day int is entered...

                    isValid = true; // break the loop

                } else { // if user input incorrect...

                    System.out.println("Please enter an integer from 0-6."); // ask user for a valid integer
                }

            } else { // if user incorrectly inputs data...

                System.out.println("Please enter an integer from 0-6."); // ask user for a valid integer

                scnr.next(); // take invalid input to avoid infinite loop
            }

        } while (!isValid); // loop so long as isValid is false

        /***** find holidays *****/

        for (i = 0; i < holidays.length; i++) { // loop 3 times for maximum amount of holidays

            isValid = false; // initially set to false for loop

            do { // loop to ask the user for data until correct data is inputted
                System.out.print(holidayOrder[i] + " holiday (day of the month): "); // prompt user for holiday day

                if (scnr.hasNextInt()) { // if user correctly inputs integer...

                    holidays[i] = scnr.nextInt(); // collect holidays data

                    if (holidays[i] >= 1 && holidays[i] <= 30) { // if user input correct day...

                        isRepeated = false; // initially set to false for loop

                        for (j = 0; j < i; j++) { // loop through previous holidays

                            if (holidays[i] == holidays[j]) { // if day has been repeated...

                                isRepeated = true; // throw repeated flag

                                // prompt user to enter a new date
                                System.out.println("Please enter a date that has not already been entered.");

                                break; // stop the process to proceed
                            }
                        }

                        if (!isRepeated) { // if day has not been repeated...

                            isValid = true; // correct input has been entered, proceed
                        }

                    } else { // if user input an incorrect date...

                        System.out.println("Please enter an integer from 1-30."); // prompt user to enter valid date
                    }
                } else { // if user incorrectly inputs data...

                    System.out.println("Please enter an integer from 1-30."); // ask user for a valid integer

                    scnr.next(); // take invalid input to avoid infinite loop
                }

            } while (!isValid); // loop so long as isValid is false
        }

        /***** print collected data *****/

        output(miles, firstDay, holidays); // call output to print collected data
    }

    /********** OUTPUT FUNCTION **********/

    private static void output(int[] miles, int firstDay, int[] holidays) { // function to print collected data

        System.out.println(firstDay);
    }
}