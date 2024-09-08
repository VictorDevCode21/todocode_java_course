package com.todocode.course;

public class Conditionals {
    public void showConditionals() {
        // Conditional if
        int num = 10;
        int num2= 12;

        if (num < num2) {
            System.out.println("num is lesser than num2");
        }
        // Conditional else
        else {
            System.out.println("num is greater than num2");
        }

        if (num > 10) {
            System.out.println("num is greater than 10");
        }
        //  Conditional else if
        else if (num == 10) {
            System.out.println("num is equal to ten");
        } else {
            System.out.println("num is lesser than 10");
        }

        // Switch Structure

        int day = 6;
        String dayName;

        switch (day) {
            case 1: dayName = "Monday";
            break;

            case 2: dayName = "Tuesday";
            break;

            case 3: dayName = "Wednesday";
            break;

            case 4: dayName = "Thursday";
            break;

            case 5: dayName = "Friday";
            break;

            case 6: dayName = "Saturday";
            break;

            case 7: dayName = "Sunday";
            break;

            default: dayName = "selected day is not valid";
        }
        System.out.println("The selected day is: " + dayName);

    }
}
