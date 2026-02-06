package MK;

public class Car implements Measurable, Thing2
{
    //95% of the time never use static objects/variables
    //5% if held at gunpoint, use for constants (like pi, the value of a quarter)
    private int wheels;

    public Car()
    {
        wheels = 4;
    }
    public Car(int inputWheels)
    {
        wheels = inputWheels;
    }

    //95% of the time never use static methods
    //5% if held at gunpoint: 1. never have it affect a global variable 2. use it to calculate something that doesn't depend on or change global variables
    public int getWheels()
    {
        return wheels;
    }

    public void setWheels(int inputWheels)
    {
        wheels = inputWheels;
    }

    public void flatTire() {
        if (wheels > 0)
        {
            wheels -= 1;
        }
    }

    @Override
    public void measure()
    {
        System.out.println("Wheels: " + wheels);
    }

    @Override
    public String toString()
    {
        return "ABCDE";
    }
}
