package com.company;

//Method overloading in java
//The process of using two or more functions under the same name but different
// return type and number of parameters

class Area{
    void calculate(int radius){
        double pi = 3.142;
        double area = radius * radius * pi;
        System.out.println("The area of the circle is " + area);
    }
    void calculate(int length, int width){
        int area = length * width;
        System.out.println("The area of the rectangle is " + area);
    }

    double calculate(double height, double side_b, double side_a){
        double area = ( (side_a + side_b) * height) /2;
        System.out.println("The area of the trapezium is as given " + area);
        return area;
    }

}


public class Main {

    public static void main(String[] args) {
	// write your code here
        Area figure = new Area();
        figure.calculate(21);
        figure.calculate(20,60);
        figure.calculate(200,30,50);
        double answer = figure.calculate(200,30,50);
        System.out.println("The area of the trapezium is " + answer);
    }
}
