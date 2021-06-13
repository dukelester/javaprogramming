package com.company;


interface testInterface{ //interfaces in java
    void area(int radius); //declaring methods in an interface
    void perimeter(double length, double width);
    void area2(int base, int height);

}

//class definition which implements the interface testInterface
class MyInterface implements testInterface{
   public void area(int radius){
       double area;
       final double PI= 3.142;
       area = radius * radius * PI;
       System.out.println("The area of the circle is  " + area);
       if (area %2 == 0){
           System.out.println(area + " The area is even");
       }
       else {
           area *= 2;
           System.out.println("The area is now even  " + area);

       }
   }
   public void  perimeter(double length, double width){
       double perimeter;
       perimeter = (length + width ) * 2;
       System.out.println("The perimeter of the rectangle is  " + perimeter);

       if (perimeter %2 == 0){
           System.out.println(perimeter + " The area is even");
       }
       else {
           perimeter *= 2;
           System.out.println("The area is now even  " + perimeter);

       }
   }
   public  void area2(int base, int height){
       double area;
       area = (base * height ) /2;

       if (area %2 == 0){
           System.out.println(area + " The area is even");
       }
       else {
           area *= 2;
           System.out.println("The area is now even  " + area);

       }

   }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        // creating an object for the above class
        MyInterface myObj = new MyInterface();
        myObj.area(21);
        myObj.perimeter(129.89, 678.89);
        myObj.area2(50, 60);

        //using the interface
        testInterface testObj = new MyInterface();
        testObj.area(45);

    }
}
