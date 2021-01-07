package com.gaurav.methodreference_lambda.MethodReference;

public class Main {

    public static void main(String[] args) {

        SampleClass object = new SampleClass();
        System.out.println("------------------------");
        // Method Reference of an instance method assigned to Functional Interface
        SampleFunctionalInterface spi1 = object::SampleFunction2;
        // Method Reference of a static method assigned to Functional Interface
        SampleFunctionalInterface spi2 = SampleClass::SampleFunction1;
        // Method Reference of a constructor assigned to Functional Interface
        SampleFunctionalInterface spi3 = SampleClass::new;

        spi1.SampleFunction();
        spi2.SampleFunction();
        spi3.SampleFunction();


    }
}


class SampleClass{

    // Method Reference to a constructor.
    public SampleClass(){
        System.out.println("A constructor got called");
    }

    // Method Reference to a static method.
    public static void SampleFunction1(){
        System.out.println("A static function got called");
    }
    // Method Reference to an instance method.
    public void SampleFunction2(){
        System.out.println("An instance method got called");
    }
}


