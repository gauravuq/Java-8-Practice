package com.gaurav.datatype.Primitive;

public class Main {

    public static void main(String[] args) {

        String dataType= "short";
        switch (dataType){
            case "int":
                intPrimitive();
                break;
            case "byte":
                bytePrimitive();
                break;
            case "short":
                shortPrimitive();
                break;
            case "long":
                longPrimitive();
                break;
        }
    }

    public static void intPrimitive(){
        // 32 bits , so the highest order bit defines the size; 1/2 defines the positive other half defines the negative range;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;  // Integer class is a wrapper that we need to perform operations on int values;
        System.out.println("Max value that can stored in Int Primitive::" + max );
        System.out.println("Min value that can stored in Int Primitive::" + min );
        System.out.println("Max value that can stored in Int Primitive with overflow::" + (max+1) );
        System.out.println("Min value that can stored in Int Primitive with underflow::" + (min-1) );

        max = 2_147_483_647; // for readability this is a valid integer;
        return ;
    }

    public static void bytePrimitive(){
        // 8 bits , so the highest order bit defines the size; 1/2 defines the positive other half defines the negative range;
        byte max = Byte.MAX_VALUE;
        byte min = Byte.MIN_VALUE;
        System.out.println("Byte Max::"+max);
        System.out.println("Byte Min::"+min);

        byte arth= (byte)(max/2); // telling java explicitly to treat the values inside parenthesis to be of byte type rather than integer;

    }

    public static void shortPrimitive(){
        // 16 bits , so the highest order bit defines the size; 1/2 defines the positive other half defines the negative range;
        short max = Short.MAX_VALUE;
        short min = Short.MIN_VALUE;
        System.out.println("Short Max::"+max);
        System.out.println("Short Min::"+min);
        max = 123_4; // valid short value;

        short arth= (short)(max/2); // telling java explicitly to treat the values inside parenthesis to be of short type rather than integer;

    }

    public static void longPrimitive(){
        // 64 bits, so the highest order bit defines the size; 1/2 defines the positive other half defines the negative range;
        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;
        System.out.println("Long Max::"+max);
        System.out.println("Long Min::"+min);
        max = 123_4L; // valid short value;
    }

    // All the primitives has over overflow and underflow issue;
    // putting L,F behind the number make them to be treated of that type rather than an Integer by the Java;


}
