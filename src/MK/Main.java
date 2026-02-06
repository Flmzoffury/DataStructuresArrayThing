package MK;

public class Main {
    public static void main(String[] args)
    {
        Car toyota = new Car();
        Car jeep = new Car();

        System.out.println("Car Toyota has " + toyota.getWheels() + " wheels");

        System.out.println("Car Jeep has " + jeep.getWheels() + " wheels");

        jeep.flatTire();
        System.out.println("Car Toyota has " + toyota.getWheels() + " wheels");

        System.out.println("Car Jeep has " + jeep.getWheels() + " wheels");

        System.out.println("Hello world"); //println() is a method of out, not of System
        //out is an object that belongs to System

        //You can have infinite interfaces (but in java can only inherit from one class/can only have one parent)

        //If you do not explicitly extend from a class, it will automatically extend from object
        //Object is the highest up class

        Chicken jon = new Chicken();
        jon.equals("");
        Object hello = jon;

        //Object containns the .toString() and .equals() methods
    }
}
