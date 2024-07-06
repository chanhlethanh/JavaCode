package Lesson2;

import java.util.Scanner;

public class NewBasicHandleCode {
    public static void main(String[] args) {
//"And" Operator
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);
//"Or" Operator
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);
//If Statements
        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        } else if (temp > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");
//Simplifying If Statements
//        int income = 120_000;
//        boolean hasHighIncomex = (income > 100_000);
//The Ternary Operator
        int income = 120_000;
        String className = income > 100_000 ? "Economy" : "First";
//Switch Statements
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're an moderator");
                break;
            default:
                System.out.println("You're a guest");
        }
//Excercise: FizzBuzz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        if (number % 5 == 0) {
            if (number % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        } else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
//For Loops
        for (int i = 0; i < 5; i++)
            System.out.println("Hello World " + i);
//While Loops
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("Input: ");
            input = sc.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
//Do...While Loops
//        Scanner sc = new Scanner(System.in);
//        String input = "";
//        do {
//            System.out.println("Input: ");
//            input = sc.next().toLowerCase();
//            System.out.println(input);
//        } while (!input.equals("quit"));
//For-Each Loop
//In Constrast
        String[] fruits = {"Apple", "Mango", "Orange"};
//        for (int i = fruits.length ; i > 0; i--)
//            System.out.println(fruits[i]);
        for (String fruit : fruits)
            System.out.println(fruit);
    }
}
