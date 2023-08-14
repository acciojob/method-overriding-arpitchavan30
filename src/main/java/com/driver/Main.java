package com.driver;


public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }
    public static class B extends A {


        public String meth() {
            System.out.println(super.meth());
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String args[]) {
       B b1=new B();
       b1.meth();

       B b2=new B();
       b2.meth();
    }
}



//public class Main
//{
//    public static void main(String args[]){
//        B b1=new B();
//        b1.meth();
//
//        B b2=new B();
//        b2.meth();
//    }
//    public static class A
//    {
//        public String meth ()
//        {
//            return "Invoking method from class A";
//        }
//    }
//    public static class B extends A {
//        public String meth(){
//            System.out.println(super.meth());
//            return "Method is overridden in Extendend class B";
//        }
//    }
//}