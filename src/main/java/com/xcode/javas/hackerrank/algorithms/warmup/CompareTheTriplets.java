package com.xcode.javas.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by jarvis on 18/10/16.
 */
class CompareTheTriplets
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int alice=0;
        int bob=0;
        if(a0>b0)
            alice++;
        else if(a0<b0)
            bob++;
        if(a1>b1)
            alice++;
        else if(a1<b1)
            bob++;
        if(a2>b2)
            alice++;
        else if(a2<b2)
            bob++;
        System.out.println(alice+" "+bob);
    }
}


        /*
            Sample Input

            5 6 7
            3 6 10
            Sample Output

            1 1
        */