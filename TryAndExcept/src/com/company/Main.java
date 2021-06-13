package com.company;

//try and except example
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 0, b=0,c=0;
        Random r = new Random();

        for(int i =0; i<32000; i++){
            try{
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
            }
            catch (ArithmeticException e){
                System.out.println("Division by zero" + e);
                a =0; //set a ==0 if the exception occurs.
            }
            System.out.println("a: " + a);

        }
//        for(int i =0; i<32000; i++){
//
//                b = r.nextInt();
//                c = r.nextInt();
//                a = 12345 / (b/c);
//
//
//                System.out.println("Division by zero");
//                a =0; //set a ==0 if the exception occurs.

//            System.out.println("a: " + a);
//
//        }

        //creating a thread
        Thread t = Thread.currentThread();
        System.out.println("The current thread is " + t);
        //changing the name of the thread
        t.setName("DukeThread");
        System.out.println("The current thread is " + t);

        for (int k =0; k<10; k++){
            try{
                System.out.println("The k " + k);
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("The thread was interrupted " + e);
            }
        }


    }
}
