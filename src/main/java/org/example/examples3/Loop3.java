package org.example.examples3;

import java.util.Scanner;

public class Loop3 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number: ");


        int num;
        while ((num = Integer.parseInt(kb.nextLine())) != 0) {
            int countOfDigits = getDigitsCount(num);

            System.out.printf("The number of digits %d is : %d%n", num, countOfDigits);
            System.out.print("Enter a number");

        }

        System.out.println("The number of digits 0 is :1 ");

    }

    public static int getDigitsCount(int num) {
        if (num == 0)
            return 1;

        int count = 0;
        while (num != 0) {
            ++count;
            num /= 10;
        }
        return count;
    }
}
