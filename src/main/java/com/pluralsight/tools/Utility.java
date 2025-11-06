package com.pluralsight.tools;

import java.util.Scanner;

 public class Utility {
    //this class is for our scanner/prompts, etc.
    public String userStringInput(String prompt){
        Scanner scanner = new Scanner(System.in);

        System.out.print(prompt+": ");
        String userString = scanner.nextLine().trim();

        return userString;

    }

    public int userIntInput(String prompt){
        Scanner scanner = new Scanner(System.in);

        System.out.print(prompt+": ");
        int userInt = scanner.nextInt();
        scanner.nextLine();//CRLF

        return userInt;
    }

    public void menuOption(String option,int choice){
        System.out.printf("[%d] %s",choice,option);
        System.out.println();
    }

    public void exitApp(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("System Exiting");
        scanner.close();
        System.exit(0);
    }

}
