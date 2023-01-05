/*
class Animal {
    Animal() {// constructor
        System.out.println("Constructor of Base class");
    }

    Animal(int a) {// overloaded constructor
        System.out.println("Constructor of Base-overloaded class :- " + a);
    }

    String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

class Dog extends Animal {
    Dog() {// constructor
        super();
        System.out.println("Constructor of Derived class");
    }

    Dog(int a, int b) {// overloaded-derived-class-constructor
        super(a);
        System.out.println("Constructor of Derived-Overloaded class :- " + b);
    }

    String dogVoice;

    public String getDogVoice() {
        return dogVoice;
    }

    public void setDogVoice(String dogVoice) {
        this.dogVoice = dogVoice;
    }
}

class colorOFdog extends Dog {
    colorOFdog() {
        System.out.println("Constructor of Derived-of-Derived-Overloaded class ");
    }

    colorOFdog(int a, int b, int c) {// overloaded-double-derived-class-constructor
        super();
        System.out.println("Constructor of Derived-of-Derived-Overloaded class :- " + c);
    }
}
*/

// Practice Problems on Inheritence
// problem 1 - circle to cylinder
class circle {
    public int radius;

    circle(int a) {
        this.radius = a;
    }

    public void area() {
        System.out.println("Area = " + Math.PI * this.radius * this.radius);
        // return Math.PI * this.radius * this.radius;
    }
}

class cylinder extends circle {
    public int height;

    cylinder(int a, int b) {
        super(a);
        this.height = b;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }

}

public class page15_Inheritence_in_JAVA {
    public static void main(String[] args) {
        /*
         * // Animal baseObject = new Animal();
         * Dog derivedObject = new Dog(5, 6);
         * colorOFdog der_derivedOjbect = new colorOFdog(5, 6, 7);
         * // derivedObject.setDogVoice("bark");
         * // derivedObject.setColour("black");
         * // System.out.println(derivedObject.getDogVoice());
         * // System.out.println(derivedObject.getColour());
         */

        // Practice Problems on Inheritence
        // problem 1 - circle to cylinder
        circle circleObj = new circle(5);
        cylinder cylinderObj = new cylinder(5, 10);
        circleObj.area();
        cylinderObj.volume();

    }
}
