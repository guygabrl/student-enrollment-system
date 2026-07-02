package com.codewithgab;

import java.util.Scanner;

public class Enrollment {


    public static void main(String[] args) {
        String continueToInput = "YES";


      Scanner sc = new Scanner(System.in);
      Program programBSIT = new Program("BS in Information Technology",
              "Object Oriented Programming",
              "Rizals Work",
              "PE/Pathfit 3",
              "Data Stuctures and Algogrithm",
              "Platform Technology",
              "Readings in Philippine History",
              "Principles of Communication",
              7);
      Program programBSHM = new Program("BS in Hospitality Management",
              "Kitchen Essentials and Basic Food Preparation",
              "Fundamentals in Lodging Operations",
              "Fundamentals in Food Service Operations",
              "Bar and Beverage Management",
              "Ergonomics and Facilities Planning for the Hospitality Industry",
              "Applied Business Tools and Technologies",
              "Foreign Language 1 and 2", 7);

      Program[]programs = {programBSIT, programBSHM};
      SystemClass systemClass = new SystemClass("STI College" ,2017, 2, programs);

      do{
          System.out.println("=========================================");
          System.out.println("STI COLLEGE ADMISSION PORTAL");
          System.out.println("=========================================");
          System.out.println("PROGRAM CHOICES: BSHM, BSIT");
          System.out.println("IF YOU HAVE NO CHOICE IN MIND YOU CAN PRESS (ENTER) TO SEE ALL AVAILABLE COURSES");
          System.out.println("=========================================");
          System.out.print("Enter your choice of program: ");
          String choice = sc.nextLine();

          if(choice.equals("BSIT")){
              System.out.println("CONGRATULATIONS, YOU ARE OFFICIALLY ENROLLED");
              System.out.println(programBSIT.displayInfo());
          }
            else if(choice.equals("BSHM")){
              System.out.println("CONGRATULATIONS, YOU ARE OFFICIALLY ENROLLED");
              System.out.println(programBSHM.displayInfo());
          }
            else{
              System.out.println("\n");
              systemClass.displayInfo();
          }
          System.out.print("Would you like to enter your program again(YES/NO): ");
            continueToInput = sc.nextLine().toUpperCase();


      } while(continueToInput.equals("YES")); {
            System.out.println("THANK YOU FOR CHOOSING STI COLLEGE - PASAY EDSA!");
            System.out.println("HOPE TO SEE YOU SOON!");
        }



    }
}