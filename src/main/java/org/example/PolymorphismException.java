package org.example;
import java.io.*;

class Operation {
//    overloading 1
    public int add (int a, int b) {
        return a + b;
    }

//    overloading 2
    public int add (int a, int b, int c) {
        return a + b + c;
    }

//    overloading 3
    public double add (double a, double b) {
        return a + b;
    }

    public String add (String a, String b) {
        return a + " " + b;
    }
}

class AdvancedOperation extends Operation {
//    Overriding add method with different behavior
    @Override
    public int add(int a, int b){
        return a * b;
    }
}


public class PolymorphismException {
    public static void main(String[] args)
    {
        System.out.println("aa");
        Operation op = new Operation();
        AdvancedOperation advOp = new AdvancedOperation();
        System.out.println("Operation of (2,3)" + op.add(2,3));
        System.out.println("Operation of (2,3,5)" + op.add(2,3, 5));

        System.out.println("Operation of (2.0,3.0)" + op.add(2.0,3.0));
        System.out.println("Operation of (2.0,3.0)" + op.add("Dimetrius","Kamajaya"));
        System.out.println("Operation of (2.0,3.0)" + advOp.add(2.0,3.0));

        try {
//            aritmatic divide by 0
            int result = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Cought arithmetic Exception: " + e.getMessage());
        }

        try {
//            array index out of bound
            int[] arr = new int[5];
            int index = arr[5];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Cought array of bound Exception: " + e.getMessage());

        }

        try {
//            class not found
            Class.forName("Nana");
        } catch (ClassNotFoundException e) {
            System.out.println("Cought class not found Exception: " + e.getMessage());
        }

        try {
//            file not found
            FileInputStream file = new FileInputStream("example.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Cought file not found Exception: " + e.getMessage());
        }

        try {
//            null pointer exception
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("Cought nullPointer Exception: " + e.getMessage());
        }

        try {
//          Number format exception
            int num = Integer.parseInt("haha");
        } catch (NumberFormatException e) {
            System.out.println("Cought Number format Exception: " + e.getMessage());
        }

        try {
//          String index out of bound exception
            String kata = "wawa";
            char ch = kata.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Cought string index out of bound Exception: " + e.getMessage());
        }

        try {
//          NegativeArraySizeException exception
           int [] arr = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("Cought NegativeArraySizeException Exception: " + e.getMessage());
        }

        int age = 10;
        if(age<18){
            throw new IllegalArgumentException("Age must be under 17");
        }else{
            System.out.println(age);
        }
        
    }
}
