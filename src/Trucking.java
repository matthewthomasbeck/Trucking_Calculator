/********************************************************************************/
/* This code and its associated files were created at the instruction of        */
/* professors at the University of Texas at San Antonio during my time as a     */
/* student at the university. I, as a student, was not responsible for the idea */
/* behind this code (i.e. project guidelines, functionality, and end purpose),  */
/* but I, Matthew Thomas Beck, can confirm that myself and any project partners */
/* (if applicable) were the ones responsible for writing it.                    */
/********************************************************************************/





/************************************************************/
/*************** IMPORT / CREATE DEPENDENCIES ***************/
/************************************************************/


/********** IMPORT UTILITIES **********/

import java.util.*; // import utilities for scanner or anything else that may be useful


/******************************************************/
/*************** TRUCKING PRIMARY CLASS ***************/
/******************************************************/





public class Trucking { // declare main class to be used to take user input and then display data with it

    public static void main(String[] args) { // declare main function to be called

        /********** INITIALIZE VARIABLES **********/

        /***** declare authorship *****/

        // code to show this was written par moi
        System.out.println("Spring 2024 - CS1083 - Section 001 - Project 1 – Trucking - written by Matthew Beck\n");

        /***** set initial constants *****/

        Scanner scnr = new Scanner(System.in); // declare scanner for data input
        int milesMonday = 0; // miles for money
        int milesTuesday = 0; // miles for tuesday
        int milesWednesday = 0; // miles for wednesday
        int milesThursday = 0; // miles for thursday
        int milesFriday = 0; // miles for friday
        int milesSaturday = 0; // miles for saturday
        int milesSunday = 0; // miles for sunday
        int firstDay = 0; // First day of the month
        int holidayFirst = 0; // first holiday
        int holidaySecond = 0; // second holiday
        int holidayThird = 0; // third holiday
        boolean isValid; // flag to throw if input invalid
        int milesPerMonth = 0; // miles driven all month
        int currentDate = 1; // current day in the month

        /********** FIND DAILY MILES **********/

        /***** monday miles *****/

        isValid = false; // initialize as false

        do { // loop for input validation

            System.out.print("Miles driven on Monday: "); // ask for input

            if (scnr.hasNextInt()) { // if input valid...

                milesMonday = scnr.nextInt(); // set miles

                isValid = true; // throw flag to break loop

            } else { // if input invalid...

                System.out.println("Please enter an integer."); // throw error message

                scnr.next(); // consume bad input
            }

        } while (!isValid); // repeat until input valid

        /***** tuesday miles *****/

        isValid = false; // initialize as false

        do { // loop for input validation

            System.out.print("Miles driven on Monday: "); // ask for input

            if (scnr.hasNextInt()) { // if input valid...

                milesTuesday = scnr.nextInt(); // set miles

                isValid = true; // throw flag to break loop

            } else { // if input invalid...

                System.out.println("Please enter an integer."); // throw error message

                scnr.next(); // consume bad input
            }

        } while (!isValid); // repeat until input valid

        /***** wednesday miles *****/

        isValid = false; // initialize as false

        do { // loop for input validation

            System.out.print("Miles driven on Monday: "); // ask for input

            if (scnr.hasNextInt()) { // if input valid...

                milesWednesday = scnr.nextInt(); // set miles

                isValid = true; // throw flag to break loop

            } else { // if input invalid...

                System.out.println("Please enter an integer."); // throw error message

                scnr.next(); // consume bad input
            }

        } while (!isValid); // repeat until input valid

        /***** thursday miles *****/

        isValid = false; // initialize as false

        do { // loop for input validation

            System.out.print("Miles driven on Monday: "); // ask for input

            if (scnr.hasNextInt()) { // if input valid...

                milesThursday = scnr.nextInt(); // set miles

                isValid = true; // throw flag to break loop

            } else { // if input invalid...

                System.out.println("Please enter an integer."); // throw error message

                scnr.next(); // consume bad input
            }

        } while (!isValid); // repeat until input valid

        /***** friday miles *****/

        isValid = false; // initialize as false

        do { // loop for input validation

            System.out.print("Miles driven on Monday: "); // ask for input

            if (scnr.hasNextInt()) { // if input valid...

                milesFriday = scnr.nextInt(); // set miles

                isValid = true; // throw flag to break loop

            } else { // if input invalid...

                System.out.println("Please enter an integer."); // throw error message

                scnr.next(); // consume bad input
            }

        } while (!isValid); // repeat until input valid

        /***** saturday miles *****/

        isValid = false; // initialize as false

        do { // loop for input validation

            System.out.print("Miles driven on Monday: "); // ask for input

            if (scnr.hasNextInt()) { // if input valid...

                milesSaturday = scnr.nextInt(); // set miles

                isValid = true; // throw flag to break loop

            } else { // if input invalid...

                System.out.println("Please enter an integer."); // throw error message

                scnr.next(); // consume bad input
            }

        } while (!isValid); // repeat until input valid

        /***** sunday miles *****/

        isValid = false; // initialize as false

        do { // loop for input validation

            System.out.print("Miles driven on Monday: "); // ask for input

            if (scnr.hasNextInt()) { // if input valid...

                milesSunday = scnr.nextInt(); // set miles

                isValid = true; // throw flag to break loop

            } else { // if input invalid...

                System.out.println("Please enter an integer."); // throw error message

                scnr.next(); // consume bad input
            }

        } while (!isValid); // repeat until input valid

        /********** FIND FIRST DAY **********/

        /***** first day *****/

        isValid = false; // initialize as false

        do { // loop for input validation

            // ask user for input
            System.out.print("First day of the month (0-Mon, 1-Tue, 2-Wed, 3-Thu, 4-Fri, 5-Sat, 6-Sun): ");

            if (scnr.hasNextInt()) { // if input integer...

                firstDay = scnr.nextInt(); // set first day

                if (firstDay >= 0 && firstDay <= 6) { // if input valid...

                    isValid = true; // throw flag to break loop

                } else { // if input invalid...

                    System.out.println("Please enter an integer from 0-6."); // throw error message
                }

            } else { // if input not integer...

                System.out.println("Please enter an integer from 0-6."); // throw error message

                scnr.next(); // consume bad input
            }

        } while (!isValid); // repeat until input valid

        /********** FIND HOLIDAYS **********/

        /***** first holiday *****/

        isValid = false; // initialize as false

        do { // loop for input validation

            System.out.print("First holiday (day of the month): "); // ask user for input

            if (scnr.hasNextInt()) { // if input is an integer...

                holidayFirst = scnr.nextInt(); // set first holiday

                if (holidayFirst >= 1 && holidayFirst <= 30) { // if input valid...

                    isValid = true; // Set flag to true for valid input

                } else { // if input valid...

                    System.out.println("Please enter an integer from 1-30."); // throw error message
                }

            } else { // if input not integer...

                System.out.println("Please enter an integer from 1-30."); // throw error message

                scnr.next(); // consume bad input
            }

        } while (!isValid); // repeat until input valid

        /***** second holiday *****/

        isValid = false; // initialize as false

        do { // loop for input validation

            System.out.print("Second holiday (day of the month): "); // ask user for input

            if (scnr.hasNextInt()) { // if input is an integer...

                holidaySecond = scnr.nextInt(); // set first holiday

                if (holidaySecond >= 1 && holidaySecond <= 30) { // if input valid...

                    isValid = true; // Set flag to true for valid input

                } else { // if input valid...

                    System.out.println("Please enter an integer from 1-30."); // throw error message
                }

            } else { // if input not integer...

                System.out.println("Please enter an integer from 1-30."); // throw error message

                scnr.next(); // consume bad input
            }

        } while (!isValid); // repeat until input valid

        /***** third holiday *****/

        isValid = false; // initialize as false

        do { // loop for input validation

            System.out.print("Third holiday (day of the month): "); // ask user for input

            if (scnr.hasNextInt()) { // if input is an integer...

                holidayThird = scnr.nextInt(); // set first holiday

                if (holidayThird >= 1 && holidayThird <= 30) { // if input valid...

                    isValid = true; // Set flag to true for valid input

                } else { // if input valid...

                    System.out.println("Please enter an integer from 1-30."); // throw error message
                }

            } else { // if input not integer...

                System.out.println("Please enter an integer from 1-30."); // throw error message

                scnr.next(); // consume bad input
            }

        } while (!isValid); // repeat until input valid

        /********** PRINT TABLE **********/

        /***** print table header *****/

        // print table header
        System.out.println("Week\tMonday\tTuesday\tWednesday\tThursday\tFriday\tSaturday\tSunday\tTotal/Week");

        currentDate = currentDate - firstDay; // set current day based on the first day

        /***** loop each week *****/

        for (int i = 0; i < 5; i++) { // loop through every week

            System.out.printf("%d\t", i + 1); // print week num

            int milesPerWeek = 0; // reset miles for the week

            /***** loop each day *****/

            for (int j = 0; j < 7; j++) { // loop through each day

                if (currentDate <= 0 || currentDate > 30) { // if current day outside range...

                    System.out.print("\t\t0-0\t"); // print nothing for invalid day

                } else { // if current day within range...

                    boolean isHoliday = false; // set flag for holiday

                    // if current day is a holiday...
                    if (currentDate == holidayFirst || currentDate == holidaySecond || currentDate == holidayThird) {

                        isHoliday = true; // throw flag for holiday
                    }

                    if (isHoliday) { // if holiday flag has been thrown...

                        System.out.printf("\t\t%d-0\t", currentDate); // print holiday info

                    } else { // if holiday has not been thrown...

                        if (j % 7 == 0) { // if first day of week...

                            milesPerWeek += milesMonday; // add day to week total

                            System.out.printf("\t\t%d-%d\t", currentDate, milesMonday); // print monday info

                        } else if (j % 7 == 1) { // if second day of week...

                            milesPerWeek += milesTuesday; // add day to week total

                            System.out.printf("\t\t%d-%d\t", currentDate, milesTuesday); // print tuesday info

                        } else if (j % 7 == 2) { // if third day of week...

                            milesPerWeek += milesWednesday; // add day to week total

                            System.out.printf("\t\t%d-%d\t", currentDate, milesWednesday); // print wednesday info

                        } else if (j % 7 == 3) { // if fourth day of week...

                            milesPerWeek += milesThursday; // add day to week total

                            System.out.printf("\t\t%d-%d\t", currentDate, milesThursday); // print thursday info

                        } else if (j % 7 == 4) { // if fifth day of week...

                            milesPerWeek += milesFriday; // add day to week total

                            System.out.printf("\t\t%d-%d\t", currentDate, milesFriday); // print friday info

                        } else if (j % 7 == 5) { // if sixth day of week...

                            milesPerWeek += milesSaturday; // add day to week total

                            System.out.printf("\t\t%d-%d\t", currentDate, milesSaturday); // print saturday info

                        } else { // if seventh day of week...

                            milesPerWeek += milesSunday; // add day to week total

                            System.out.printf("\t\t%d-%d\t", currentDate, milesSunday); // print sunday info
                        }
                    }
                }

                currentDate += 1; // increment date
            }

            milesPerMonth += milesPerWeek; // add week to month total

            System.out.printf("\t\tW%d-%d\n", i + 1, milesPerWeek); // print week total
        }

        System.out.println("Total Miles Driven: " + milesPerMonth); // print month total
    }
}