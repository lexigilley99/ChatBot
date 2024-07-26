package org.example;

import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greetUser();
        String name = getUserInput(scanner);
        repeatName(name);
        guessAge(scanner);
        countToNumber(scanner);
        testProgrammingKnowledge(scanner);

        scanner.close();
    }

    private static void greetUser() {
        System.out.println("Hello! world.");
    }

    private static String getUserInput(Scanner scanner) {
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    private static void repeatName(String name) {
        System.out.println("Nice to meet you, " + name + "!");
    }

    private static void guessAge(Scanner scanner) {
        System.out.println("Let's play a game. I will guess your age.");
        System.out.print("Enter the sum of the digits of your age: ");
        int sumOfDigits = scanner.nextInt();

        int age = sumOfDigits * 2;  // This is a simple guessing method for demonstration
        System.out.println("I guess your age is: " + age);
    }

    private static void countToNumber(Scanner scanner) {
        System.out.print("Enter a number and I will count to it: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    private static void testProgrammingKnowledge(Scanner scanner) {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What is the correct syntax to output 'Hello World' in Java?");
        System.out.println("1. echo 'Hello World'");
        System.out.println("2. Console.WriteLine('Hello World')");
        System.out.println("3. System.out.println('Hello World')");
        System.out.println("4. printf('Hello World')");

        boolean correct = false;
        while (!correct) {
            System.out.print("Enter the number of your answer: ");
            int answer = scanner.nextInt();

            if (answer == 3) {
                System.out.println("Correct! Well done.");
                correct = true;
            } else {
                System.out.println("Incorrect. Try again.");
            }
        }
    }
}
