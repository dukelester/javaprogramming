package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("This is the ultimate intellij IDE");
        //doing the type conversion and type casting

        char u = 'f';
        int k = 90;
        byte t = (byte)k;
        float y = (float)k;
        double d = (double)u;
        long l = (long)k;
        int g = (int) 90.897;
        //Conversions in the expressions

        byte b1 = 40;
        byte b2 = 50;
        byte b3 = 100;

        int done = b1 * b2 /b3;

        System.out.println(done);
        String s = new String(String.valueOf(d));
        System.out.println(t);
        System.out.println(y);
        System.out.println(d);
        System.out.println(l);
        System.out.println(s);
        System.out.println(g);

        System.out.println(done);


    }
}
