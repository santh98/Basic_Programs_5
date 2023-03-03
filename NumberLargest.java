package com.bridgelabz;

public class NumberLargest {
    public static void main(String[] args) {
        double n1 = -9.5, n2 = 8.7, n3 = 4.5;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}

