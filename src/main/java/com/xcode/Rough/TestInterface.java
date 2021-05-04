package com.xcode.Rough;


public class TestInterface
{
    public static void main(String[] args)
    {
       A objA = new A();
       if(objA instanceof MymMarkerInterface){
           System.out.println("objA is a child of marker interface");
       }
       else
       {
           System.out.println("objA is not a child of marker interface");
       }
       B objB = new B();
       if(objB instanceof MymMarkerInterface){
           System.out.println("objB is a child of marker interface");
       }
       else
       {
           System.out.println("objB is Not a child of marker interface");
       }
    }
}

interface MymMarkerInterface{

}

class A implements MymMarkerInterface{
    public void printA()
    {
        System.out.println("Print A");
    }
}

class B {
    public void printB()
    {
        System.out.println("Print B");
    }
}