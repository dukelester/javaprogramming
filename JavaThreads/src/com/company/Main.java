package com.company;

class MyThread implements Runnable{ //implementing the runnable interface
    Thread t;

    MyThread(){
        t = new Thread(this ,"dukeThread"); //creating a new thread
        System.out.println("The child thread is  " + t);
    }
    MyThread(String threadName){
        String name = threadName;
        t = new Thread(this,name );
    }
    public void run(){
        for (int m = 0; m<=10; m++){
            try{
                //System.out.println(m);
                if (m %3 == 0 ){
                    System.out.println(m + " Is divisible by 3");
                }
                else{
                    System.out.println(m);
                }
                Thread.sleep(1000); //sleeping the thread
            }
            catch (InterruptedException e){
                System.out.println("The exception occurred here " + e);
            }
        }
        System.out.println("This is the threading example in Java");
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here

        MyThread mt = new MyThread();
        mt.t.start();

        //creating multiple threads
        MyThread mt2 = new MyThread("Lester");
        MyThread mt3 = new MyThread("duke");
        MyThread mt4 = new MyThread("Test");

        //starting the threads
        mt2.t.start();
        mt3.t.start();
        mt4.t.start();


//        for (int m = 0; m<=10; m++){
//            try{
//                //System.out.println(m);
//                if (m %3 == 0 ){
//                    System.out.println(m + " Is divisible by 3");
//                }
//                else{
//                    System.out.println(m);
//                }
//                Thread.sleep(10000); //sleeping the thread
//            }
//            catch (InterruptedException e){
//                System.out.println("The exception occurred here " + e);
//            }
//        }
        //checking if the threads are alive(active) using the isAlive() method
        System.out.println("The first thread is alive  " + mt.t.isAlive());
        System.out.println("The second thread is alive  " + mt2.t.isAlive());
        System.out.println("The third thread is alive  " + mt3.t.isAlive());
        System.out.println("The fourth thread is alive  " + mt4.t.isAlive());
//        System.out.println("The first thread is alive  " + mt.t.isAlive());

        //using the join() method

        try{
            mt.t.join();
            mt2.t.join();
            mt3.t.join();
            mt4.t.join();
        }
        catch (InterruptedException e){
            System.out.println("The exception occurred " + e);
        }
        System.out.println("\n\nThe first thread is alive  " + mt.t.isAlive());
        System.out.println("The second thread is alive  " + mt2.t.isAlive());
        System.out.println("The third thread is alive  " + mt3.t.isAlive());
        System.out.println("The fourth thread is alive  " + mt4.t.isAlive());

        //getting the priority of the threads

        System.out.println("The priority of thread 1 is :  " + mt.t.getPriority());
        System.out.println("The priority of thread 2 is :  " + mt2.t.getPriority());
        System.out.println("The priority of thread 3 is :  " + mt3.t.getPriority());
        System.out.println("The priority of thread 4 is :  " + mt4.t.getPriority());

        //setting the priority

        mt.t.setPriority(2);
        mt2.t.setPriority(3);
        mt3.t.setPriority(1);
        mt4.t.setPriority(7);

//        System.out.println("The priority of thread 1 is :  " + mt.t.getPriority());
//        System.out.println("The priority of thread 2 is :  " + mt2.t.getPriority());
//        System.out.println("The priority of thread 3 is :  " + mt3.t.getPriority());
//        System.out.println("The priority of thread 4 is :  " + mt4.t.getPriority());

    }
}
