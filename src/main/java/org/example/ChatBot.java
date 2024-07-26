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
        tellStory(name);

        scanner.close();
    }

    private static void greetUser() {
        System.out.println("Hello!");
    }

    private static String getUserInput(Scanner scanner) {
        System.out.print("Please enter your name: ");
        return scanner.nextLine();
    }

    private static void repeatName(String name) {
        System.out.println("Nice to meet you, " + name + "!");
    }

    private static void guessAge(Scanner scanner) {
        System.out.println("Let's play a game. I will guess your age.");
        System.out.print("Enter the sum of the digits of your age: ");
        int sumOfDigits = scanner.nextInt();

        int age = (sumOfDigits * 9) % 100;  // Improved guessing method
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
        System.out.println("Which of the following is used to declare a class in Java?");
        System.out.println("1. int");
        System.out.println("2. class");
        System.out.println("3. void");
        System.out.println("4. public");

        boolean correct = false;

        while (!correct) {
            System.out.print("Your answer choice is : ");
            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 2:
                    System.out.println("Correct! Well done.");
                    correct = true;
                    break;
                default:
                    System.out.println("Incorrect. Try again.");
                    break;
            }
        }
    }

    private static void tellStory(String name) {
        System.out.println("Let me tell you a story about you, " + name + ".");
        System.out.println("Once upon a time, there was a person named " + name + " who was curious and eager to learn.");
        System.out.println(name + " met a chatbot that could guess ages, count numbers, and test programming knowledge.");
        System.out.println("Through this journey, " + name + " discovered the joy of learning and the fun of interacting with chatbot.");
        System.out.println("And they lived happily ever after, coding and exploring new skills.");
    }
}
