package com.exercise5switch.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables declaration
        byte numberMonth = 1;
        String month = "";

        //Construct object
        Scanner in = new Scanner(System.in);

        //Process
        while (numberMonth >= 0){
            //Input from user
            System.out.print("Write a number of the month: ");
            numberMonth = in.nextByte();
            //Process
            if(numberMonth > 0) {
                switch (numberMonth) {
                    case 1:
                        month = "Junuary";
                        break;
                    case 2:
                        month = "February";
                        break;
                    case 3:
                        month = "March";
                        break;
                    case 4:
                        month = "April";
                        break;
                    case 5:
                        month = "May";
                        break;
                    case 6:
                        month = "June";
                        break;
                    case 7:
                        month = "July";
                        break;
                    case 8:
                        month = "August";
                        break;
                    case 9:
                        month = "September";
                        break;
                    case 10:
                        month = "October";
                        break;
                    case 11:
                        month = "November";
                        break;
                    case 12:
                        month = "December";
                        break;
                    default:
                        month = "not valid!!";
                }
                System.out.println("The month is "+month);
            }
            else{
                System.out.println("The number is not valid!!");
            }
        }
    }
}
