package com.bridgelabz;

public class SampleHarmonic {
    public static void main(String[] args) {

        double n=10,i;
        double sum=0;
        for( i=1;i<=n;i++)
        {
            sum=sum+(1/i);
        }
        System.out.println("Harmonic value = "+sum);
    }
}

