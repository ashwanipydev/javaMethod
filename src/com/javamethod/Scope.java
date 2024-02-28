package com.javamethod;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "ankit";
        {
//          int  a = 21; // Already initialised outside the block in the same method, hence you cannot initialised again
            a = 100; // reassign the origin ref variable to some other value;
            int c = 99;
            name = "java";
            System.out.println(name);
//          values initialised in this block, will remain in block;
        }
        int c = 45;
        System.out.println(c);
//        System.out.println(c);  cannot use outside the block;
        System.out.println(a);
        System.out.println(name);
    }
    static  void  random (int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
//        System.out.println(name); not working
    }
}
