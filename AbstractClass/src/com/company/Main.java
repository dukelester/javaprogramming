package com.company;
//abstract class

abstract class AbstractExample{
    abstract void area(double radius); //abstract method
void printing(){
    System.out.println("Hello this is the concrete method in the abstract class");
}

}
class Myclass extends AbstractExample {
    void area(double radius){
        System.out.println("The area of a circle");
        double area;
        area = (radius * radius * 22 ) / 7;
        System.out.println(area);

    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here

        //creating the objects and calling the methods
        //AbstractExample obj = new AbstractExample(); can not work
        Myclass obj2 = new Myclass();
        obj2.area(34.90);
        obj2.printing();

    }
}
