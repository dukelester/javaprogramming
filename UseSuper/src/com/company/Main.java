package com.company;


//using the super on super.member

//using super to overcome the name hiding

//method overriding => using the same function in a super class in a subclass
class A {
    int i;

    double radius;
    A(){
        int i;
    }

    A(double r){ //constructor
        radius = r;
    }
    void calculate(){
        double area = (radius * radius * 22) / 7;
        System.out.println("The super class area is " + area);
    }
}

//creating a subclass by extending the class A
class B extends A {
    int i; //this i hides the i in class A above
    B(int a, int b){
        super.i = a; // i in  A = a
        i = b;  // i in B = b
    }

    //overriding the calculate method
    void calculate(double base, double height){
        double area = ( base * height ) /2;
        System.out.println("The area under the subclass is " + area);
    }

    void show() {
        System.out.println("i in the super class " + super.i);
        System.out.println("i in the subclass " + i);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        B obj = new B(100, 30);
        obj.show();

        //creating the objects
        A obj2 = new A();
        A obj3 = new A(21.67);

        //calling the functions
        obj.calculate(200.90, 78.902);
        obj3.calculate();


    }
}
