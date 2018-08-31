package com.company;


import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the PV student account generator");

            Scanner keyboardInput = new Scanner(System.in);
            System.out.println("Enter student first name");
            String fName = keyboardInput.next();
            System.out.println("Enter student last name");
            String lName = keyboardInput.next();

            String studentID = studentRandomID.randID();

            System.out.println("Your srudent ID is now being generated.");
            fName = fName.toLowerCase();
            lName = lName.toLowerCase();
            String newStudentID = fName.substring(0, 1) + lName.substring(0, 1) + studentID.substring(studentID.length() - 3);
            System.out.println("Your student ID is:  " + newStudentID);
            
    }


}
