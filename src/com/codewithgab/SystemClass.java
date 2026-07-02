package com.codewithgab;

public class SystemClass {

    String schoolName;
    int yearOfClass;
    int semester;
    Program[] programs;

    SystemClass(String schoolName,
                int yearOfClass,
                int semester,
                Program[] programs){
      this.schoolName = schoolName;
      this.yearOfClass = yearOfClass;
      this.semester = semester;
      this.programs = programs;
    }

    void displayInfo(){
        System.out.println(this.schoolName + this.yearOfClass + "\n" + this.semester + "nd Semester");
        System.out.println("Courses Available: ");
        for(Program program : programs){
            System.out.println(program.displayInfo());
        }

    }

    }


