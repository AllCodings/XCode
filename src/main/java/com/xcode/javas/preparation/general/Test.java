package com.xcode.javas.preparation.general;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Function;

public class Test {
    public static void main(String[] args){
        HashMap hm = new HashMap();
        hm.put(4,"Arvind");
        hm.put(3,"Divya");
        hm.put(2,"Pooja");
        hm.put(1,"Sanjay");


        System.out.println(hm);

        System.out.println(hm.computeIfAbsent(5, new Function() {
                    @Override
                    public Object apply(Object o) {

                        return "Hello";
                    }
                }));
        System.out.println(hm);


        /*Factorial f = Factorial.getFactorialInstance();
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long fact = f.findFactorial(n);
        System.out.println(fact);
        System.out.println(f.cachedFactorial);
        main(new String[]{""});*/
    }
}
