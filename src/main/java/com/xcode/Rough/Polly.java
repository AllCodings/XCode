package com.xcode.Rough;

import java.util.Scanner;

public class Polly
{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();

    int n = in.nextInt();
    int sum = 0;
            for(int j=0;j<n;j++){
        sum = sum+(((int)Math.pow(2,j))*b);
        System.out.print(a+sum +" ");
        }

        System.out.println();
        }
        in.close();
        }
        }


/*
        2
        0 2 10
        5 3 5
*/
