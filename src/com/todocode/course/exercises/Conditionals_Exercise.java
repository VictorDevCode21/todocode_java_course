package com.todocode.course.exercises;
import java.util.Scanner;

public class Conditionals_Exercise {
    public void showExercise () {
        System.out.println("---------Conditionals Exercise-------------");

        double salary = 0;
        int category;

        System.out.println("Enter the type of category: ");
        Scanner keyboard = new Scanner(System.in);

        category = keyboard.nextInt();

        if (category == 1) {
            salary = 15890 + (15890*0.10);
        } else if (category == 2 ) {
            salary = 25630.89;
        } else if (category == 3) {
            salary = 35560.20 - (35560.20 * 0.11);
        } else {
            System.out.println("Incorrect category selected, please try again.");
        }

        System.out.println("The salary for you is based on category, your category is: " + category +  " and your salary is: " +  salary);

    }
}
