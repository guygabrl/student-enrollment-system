package com.codewithgab;

public class Program {

    String nameofProgram;
    String subject1;
    String subject2;
    String subject3;
    String subject4;
    String subject5;
    String subject6;
    String subject7;
    int numOfSubjects;

    Program(String nameofProgram,
            String subject1,
            String subject2,
            String subject3,
            String subject4,
            String subject5,
            String subject6,
            String subject7,
            int numOfSubjects){
        this.nameofProgram = nameofProgram;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
        this.subject5 = subject5;
        this.subject6 = subject6;
        this.subject7 = subject7;
        this.numOfSubjects = numOfSubjects;
    }

    String displayInfo(){
        return this.nameofProgram +
                " (com.codewithgab.Program)" + "\n"
                + this.subject1 + "\n"
                + this.subject2 + "\n"
                + this.subject3 + "\n"
                + this.subject4 + "\n"
                + this.subject5 + "\n"
                + this.subject6 + "\n" + this.subject7 + "\n"
                + "\n" + "Total Subjects: " + this.numOfSubjects + "\n" ;

    }






}
