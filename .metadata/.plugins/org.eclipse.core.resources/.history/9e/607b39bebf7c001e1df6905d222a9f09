package ifelse;

import java.util.Scanner;

class Student {
    int numberOfClasses;
    int numberofClassesAttend;
    int percentofClasses;

    void userInput() {
        Scanner s = new Scanner(System.in);
        
        while (true) {
            System.out.println("Number of classes held");
            numberOfClasses = s.nextInt();
            if (numberOfClasses > 365) {
                System.out.println("Please enter a valid number of classes held (less than or equal to 365).");
            } else {
                break; // Exit the loop if valid input is provided.
            }
        }

        System.out.println("Number of classes attended");
        numberofClassesAttend = s.nextInt();
    }

    void calculate() {
        percentofClasses = (numberofClassesAttend * 100) / numberOfClasses;
    }

    void print() {
        if (percentofClasses < 75) {
            System.out.println("Sorry! You're not allowed to sit in the exam. Your Attendance % is: " + percentofClasses);
        } else {
            System.out.println("Hurray! You're allowed to sit in the exam. Your Attendance % is: " + percentofClasses);
        }
    }
}

public class Student_Exam_Scenario {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.userInput();
        s1.calculate();
        s1.print();
    }
}
