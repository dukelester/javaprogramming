package com.company;

//constructor overloading
class ConstrusctorOverloading {
    double width;
    double length;
    double height;

    ConstrusctorOverloading () {
        width = 1900.90;
        height = 780.87;
        length = 890.44;
    }
    ConstrusctorOverloading(double w, double l, double h){
        width = w;
        height = h;
        length = l;
    }
    ConstrusctorOverloading(int d){
        width = height = length = d;
    }

    void myCalculations(){
        double volume;
        volume = width * height * length;
        System.out.println("The volume of the given dimensions is " + volume);
    }

}

//This is method overloading in java. The use of more than one method under the same name
//use the different parameters and the type to distinguish the functions
class MethodOverlo0ading {
    void calculate(){
        System.out.println("This is the method overloading in Java language");
    }
    //declare another function with return and parameter
    int calculate(int radius){
        System.out.println("This calculate function calculates the area of a circle");
        int area;
        area = (radius * radius * 22) /7 ;
        System.out.println("The area of the circle is " + area);
        return area;
    }
    void calculate(int mark1, int mark2, int mark3, int mark4) {
        //the calculate function  to calculate the average of 4 marks.
        double average;
        average = (mark1 + mark2 + mark3 + mark4) / 4;
        System.out.println("The average mark is " + average);
    }
    double calculate(double width, double length, double height) {
        //The same function / method to return a double volume
        double volume;
        volume = width * height * length;
        System.out.println("The volume is " + volume);
        return volume;
    }
}




public class Main {

    public static void main(String[] args) {
	// write your code here

        //creating an object
        MethodOverlo0ading methods = new MethodOverlo0ading();
        methods.calculate(); //first method call
        methods.calculate(200); //overloading
        methods.calculate(233.89, 788.90, 670.45); //overloading the function
        methods.calculate(50, 50, 80,45); //overloading again

        //creating object of ConstructorOverloading class
        ConstrusctorOverloading constructors = new ConstrusctorOverloading();
        ConstrusctorOverloading constructor1 = new ConstrusctorOverloading(200);
        ConstrusctorOverloading constructor2 = new ConstrusctorOverloading(300.67, 556.90, 500.5534);

        //calling the method.
        constructors.myCalculations();
        constructor1.myCalculations();
        constructor2.myCalculations();




    }
}
