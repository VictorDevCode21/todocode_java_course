package com.todocode.course;

public class LogicExersice {
    public void showExercise () {
        //  Exchange values of num1 and num2
        System.out.println("\nLogic Exercise");

        int num1 = 35;
        int num2 = 20;

        int aux;

        System.out.println("--------Before---------");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        aux = num2;
        num2 = num1;
        num1 = aux;

        System.out.println("-------After---------");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);


    }
}
