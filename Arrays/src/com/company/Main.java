package com.company;

class myCars{
    String name = "Duke Lester Motors";
    String carModels[] = {"BMW", "AUDI", "TOYOTA", "BENZ", "GTA", "PRADO", "MAZDA"};
    String colors[] = {"GREEN", "RED","BLACK","BLUE","ORANGE","GREEN","MAGENTA","SILVER","WHITE"};
    double mileage[] = {230.90,67.990,67.90,55.78,54.90,45.786,34.90};
    int speed[] = {120,200,278,180, 186,145,299,250,178,188,100,158};
    int cost[] = {1000000,566666,7888880,8000000,899999,80000000,4555559,34444444};

    void display(){
        System.out.println("The name of the company is " + name);
        for (int k =0; k<7; k++){
            System.out.println("The available car models are ::  " + carModels[k]);
        }

        for (int t=0; t<9; t++){
            System.out.println("These cars have either of the following colors: " + colors[t]);
        }

        for (int y=0; y<7; y++){
            System.out.println("The mileage of the cars is as follows " + mileage[y]);
        }
        for (int u=0; u<12; u++){
            System.out.println("The speeds are : " + speed[u]);
        }
        for (int m=0; m<8; m++){
            System.out.println("The cost of the cars are: " + cost[m]);
        }
    }

}

class Box{
    double width;
    double height;
    double length;

//    Box(){ //This is the constructor which sets the values to default.
//        width = 10;
//        length = 10;
//        height = 10;
//    }

    //parametrized constructor

    Box(double w, double h, double l){ //adding the this keyword
        width = w;
        height = h;
        length = l;
// this keyword is a reference to the object where the function was invoked
        this.width = w;
        this.height = h;
        this.length = l;


    }

    void volume(){ //has no return type hence the use of void
        double volume = length * width * height;
        System.out.println("The volume of the box is " + volume);
    }

    double volume2(){ //returns a double value of the volume

        double volume = length * width * height;
        System.out.println("The function(method) returns a value of volume");
        return volume;  //the return statement
    }

    //parametrized method

    double boxVolume(double width, double height, double length) { //parameters
        double volume3 = width * height * length;
        return volume3; //return a volume of type double
    }

}





public class Main {

    public static void main(String[] args) {
	// write your code here
        //dealing with arrays in Java
        System.out.println("Arrays are containers which stores values of the same type");
        int myMarks[]; //declaring the array
        myMarks = new int[10]; //allocating the memory to the array using the new keyword
        myMarks[0] = 12;
        myMarks[1] = 10;

        System.out.println("My 1st element of the array is "+ myMarks[0]);
        //array of integers

        int marks[] = new int[5];
        marks[0] = 56;
        marks[1] = 90;
        marks[2] = 67;
        marks[3] = 89;
        marks[4] = 78;

        double average;
        int sum = 0;
        int k;

        //finding the average mark
        for (k=0; k<5; k++){
            sum = sum + marks[k];
        }
        System.out.println(sum);
        average = sum / 5;

        System.out.println("The average mark is " + average);


        System.out.println("The last mark is " + marks[4]);
        //Array of strings

        String names[] = new String[3];
        names[0] = "Duke";
        names[1] = "Lester";
        names[2] = "Dlester";

        System.out.println("The first name is " + names[0]);

        //initializing the arrays
        /*  here we initialize the array as we create it by using {} an providing the items
        inside the array separated by commas. We don't use the new keyword because the memory
        large enough to hold the elements of the array is allocated..
        eg:: int marks[] = {78,90,78,56};
        *
        * */

        int age[] = {20,45,67,45,29,20,40,46,10}; //initialling the array
        System.out.println("The smallest age is " + age[8]);

        int total = 0;
        for (int t = 0; t<9; t++){
            total = total + age[t];
//            System.out.println(age[t]);
        }
        System.out.println("The total of the age is " + total);
        double averageAge = total /9;
        System.out.println("The average age of the data given is " + averageAge);

        myCars car1 = new myCars();
        car1.display();

        //multidimensional arrays

        int nums[][] = new int[3][2]; //3x2 array where 3 ==>rows and 2 ==>columns
        nums[0][0] = 900;
        nums[0][1] = 200;
        nums[1][0] = 300;
        nums[1][1] = 980;
        nums[2][0] = 800;
        nums[2][1]= 450;

        System.out.println(nums[0][0]);

        for (int r=0; r<3;r++){
            //System.out.println(nums[r]);
            for (int g=0; g<2;g++){
                System.out.println(nums[r][g]);
            }
        }
        //The length of the array using length
        System.out.println("The length of the array is " + nums.length);

       // int grades[][] = {78,89,56,344}{}; is not possible in multidimensional arrays

    System.out.println("_____________________________________________________\n");
    //calling the parametrized constructor
        Box myBox = new Box(300.67, 56.90,40.67);
//    Box myBox = new Box(); //creating the object
//        myBox.height = 89.77; //giving the values to the variables of the object
//        myBox.width = 200.90;
//        myBox.length = 400.60;
    System.out.println(myBox.height);
    System.out.println(myBox.width);
    System.out.println(myBox.length);
    //calling the volume function

        myBox.volume(); //calling the void method
        myBox.volume2(); //calling the returning method
        myBox.boxVolume(200,566.89,770.7867); //calling the parametrized method by\
        // passing in the arguments

    //find the volume of the box
        double volume;
        volume = myBox.height * myBox.width * myBox.length;
        System.out.println("The volume of the above box is " + volume);
        double volume3 = myBox.boxVolume(200,566.89,770.7867);
        System.out.println("The volume from a parametrized method " + volume3);

    //Adding another object
        //Calling the parametrized constructor
        Box myBox1 = new Box(100, 56.89, 200.56);
    //Box myBox1 = new Box();
    //use the constructor
//        myBox1.length = 90.00;
//        myBox1.width = 80.00;
//        myBox1.height = 60.00;

        System.out.println("========The second object's data =========\n");
        System.out.println(myBox1.height);
        System.out.println(myBox1.width);
        System.out.println(myBox1.length);

        //the volume of the second box
        double volume2;
        volume2 = myBox1.height * myBox1.width * myBox1.length;
        System.out.println("The volume of the second box is " + volume2);

        myBox1.volume(); //calling the void function
        myBox1.volume2(); //calling the  double returning function
        myBox1.boxVolume(400,56.90,540.88); //calling the parametrized method
        System.out.println(myBox1.volume2()); //printing the value of the returned volume

        double answer = myBox1.boxVolume(400,56.90,540.88);
        System.out.println("This is the volume from the parametrized method  " + answer);


    }
}
