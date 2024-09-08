package com.todocode.course;
import com.todocode.course.exercises.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Now it is working xd ");

        DataTypes dataTypes = new DataTypes();
        dataTypes.showDataTypes();

        Operators operators = new Operators();
        operators.showOperators();

        LogicExersice logicExercise = new LogicExersice();
        logicExercise.showExercise();

        Conditionals conditionals = new Conditionals();
        conditionals.showConditionals();

        Conditionals_Exercise conditionalsExercise = new Conditionals_Exercise();
        conditionalsExercise.showExercise();

    }
}




