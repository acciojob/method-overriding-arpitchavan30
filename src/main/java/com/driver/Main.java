package com.driver;


public class Main {
    static class A {
        String meth() {
            return "Invoking method from class A";
        }
    }

    static class B extends A {
        @Override
        String meth() {
            return "Method is overridden in Extended class B";
        }
    }
        public static void main(String[] args) {
        // Task 3
        B objB = new B();
        String resultTask3 = objB.meth();
        System.out.println(resultTask3);  // This will print: "Invoking method from class A"

        // Task 5
        B objBOverride = new B();
        String resultTask5 = objBOverride.meth();
        System.out.println(resultTask5);  // This will print: "Method is overridden in Extended class B"
    }
}
