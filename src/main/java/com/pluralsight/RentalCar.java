package com.pluralsight;

import java.util.Scanner;

public class RentalCar {
    public static void main(String[] args) {

        Scanner theScanner = new Scanner(System.in);
        System.out.print("Please select pickup date : ");
        String pickupDate = theScanner.nextLine();

        System.out.print("Write the number of days for the rental   : ");
        int rentalDays = theScanner.nextInt();
        theScanner.nextLine();
        System.out.print("Choose whether you want an electronic toll tag at $3.95/day (yes/no) : ");
        String tollTag = theScanner.nextLine();

        System.out.print("Choose whether you want a GPS at $2.95/day (yes/no) : ");
        String gps = theScanner.nextLine();
        // theScanner.nextLine();
        System.out.print("Choose whether you want roadside assistance at $3.95/day (yes/no) : ");
        String roadAssistance = theScanner.nextLine();

        System.out.print("What is your current age? : ");
        int age = theScanner.nextInt();

        double basicCarRental = rentalDays * 29.99;


        double totalCost = basicCarRental;

        if (tollTag.equalsIgnoreCase("yes")) {
            double tollTagCost = rentalDays * 3.95;
            totalCost += tollTagCost;

        }
//                else{
//                    totalCost = basicCarRental;
//                }

        if (gps.equalsIgnoreCase("yes")) {
            double gpsCost = rentalDays * 2.95;
            totalCost += gpsCost;

        }
//         else{
//            totalCost = basicCarRental;
//        }

            if (roadAssistance.equalsIgnoreCase("yes")) {
                double roadAssistanceCost = rentalDays * 3.95;
                totalCost  += roadAssistanceCost;

        }
//            else{
//            totalCost = basicCarRental;
//        }

             if (age < 25) {
                    double surchargeCost = basicCarRental * 0.3;
                    totalCost  += surchargeCost;

        }
//                else{
//            totalCost = basicCarRental;
//        }

                    System.out.println("Your total cost on date " + pickupDate + "is" + totalCost);
                }
            }



