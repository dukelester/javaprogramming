package com.company;

//class inheritance
//subclass and super class  using the extends keyword ===> example

class MyArea{
    int radius ;
    double width;
    double height;
    double length;

    //constructor overloading
    MyArea(int r){
        radius = r;
    }
    MyArea(double w, double l , double h){
        width = w;
        length = l;
        height = h;
    }
    MyArea(){
        radius = 21;
        width = 50.567;
        length = 89.90;
        height = 100.78;
    }

    //define a method to carry out the area
    //method overloading

     void calculate(){
        double area = (22 * radius * radius ) / 7;
        double volume = width * height * length;
        System.out.println("The area odf the circle is " + area + "\n the volume of the cuboid is " + volume);
    }
    double calculate(int r, double w, double h , double l){
        double area = (22 * radius * radius) / 7;
        double volume = w * h * l;
        System.out.println("The area odf the circle is " + area + "\n the volume of the cuboid is " + volume);
        return area;

    }
}
//inheritance
class FigArea extends MyArea{
    int base;
    int height;
    FigArea(double w, double l, double h){
        super(w, h, l);

    }

    FigArea(int b, int h){
        super(h);
        base = b;
        height = h;

    }
    FigArea (){
        base = 100;
        height = 90;
    }

    double figarea(){
        double area = (base * height ) /2;
        System.out.println("The area of the triangle is " + area);
        return area;
    }
    double calculateVolume(){
        double volume = width * height * length;
        System.out.println("The volume " + volume);
        return volume;
    }

}
public class Main {

    public static void main(String[] args) {
	// write your code here

        //creating the objects of the classes:

        //object of the super class
        MyArea myAreaObject = new MyArea();
        MyArea myAreaObject1 = new MyArea(34.90, 56.90, 780.8);
        MyArea myAreaObject2 = new MyArea(21);

       myAreaObject.calculate();
       myAreaObject.calculate(28, 60.889, 34.9, 20.78);

       myAreaObject1.calculate();
       myAreaObject1.calculate(26, 80.89, 90.89, 100.45);

       myAreaObject2.calculate();
       myAreaObject2.calculate(21, 300.78, 45.90, 60.90);

       //object of the subclass
        FigArea figAreaObject = new FigArea();
        FigArea figAreaObject1 = new FigArea(100, 200);
        FigArea figAreaObject2 = new FigArea(122.90, 89.90, 100.7);

        //calling the methods from both the classes

        figAreaObject.figarea();
        figAreaObject.calculate(); //calling the methods of the super class
        figAreaObject.calculate(7, 200.8990, 40.90, 80.09);

        figAreaObject1.figarea();
        figAreaObject1.calculate();
        figAreaObject1.calculate(14, 67.899, 56.90, 59.90);
        figAreaObject2.calculateVolume();


    }
}
