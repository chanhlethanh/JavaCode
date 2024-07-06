package Lesson1;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BasicHandleCode {
    public static void main(String[] args) {
        byte age = 30;
        Date now = new Date();
        long viewsCount = 123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        System.out.println(viewsCount);
        System.out.println(now);
//Point
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
//String
        String message = "c:\\Windows\\...";

        System.out.println(message.trim());
        System.out.println(message);
//Arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 1;

        int[] numberx = {2, 3, 4, 6, 7, 1};
        Arrays.sort(numberx);
        System.out.println(numberx.length);
        System.out.println(Arrays.toString(numberx));
        System.out.println(Arrays.toString(numbers));

        int[][] numberz = {{1, 2, 3}, {4, 5, 6}};
        numberz[0][0] = 1;
        System.out.println(Arrays.deepToString(numberz));
//Constance
        final float PI = 3.14F;
//Arithmetic Expression
        double result = (double) 10 / (double) 3;
        System.out.println(result);
        int x = 1;
        x += 2;
        System.out.println(x);
//Order of Operations
        int z = (10 + 3) * 2;
        System.out.println();
//Casting
//Implicit casting
        String j = "1.1";
        double i = Double.parseDouble(j) + 2;
        System.out.println(i);
//The Math Class
        int resultz = (int) (Math.random() * 100);
        System.out.println(resultz);
//Formatting Numbers
        String resultc = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(resultc);
//Reading Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Your name: " + name);
    }

}
