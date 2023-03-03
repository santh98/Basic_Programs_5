package com.bridgelabz;

import javax.swing.text.Utilities;
import java.util.Scanner;

import static java.lang.System.in;

public class SumThree {
    public static void main(String[] args) {
        Utilities utility = new Utilities();
        System.out.println("Enter the number of integer :");
        int number = utility.readInt();
        int[] arr = new int[number];
        System.out.println("Enter the integers :");
        for (int i = 0; i < number; i++) {
            arr[i] = utility.readInt();
        }
        int distinctCount = 0;
        for (int i = 0; i < number - 2; i++)
            for (int j = i + 1; j < number - 1; j++)
                for (int k = j + 1; k < number; k++)
                    if ((arr[i] + arr[j] + arr[k]) == 0) {
                        distinctCount++;
                        System.out.println("(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");

                    }

        System.out.println("Total distinct triples : " + distinctCount);

    }
}
