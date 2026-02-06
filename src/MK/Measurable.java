package MK;

public interface Measurable
{
    void measure(); //This is an abstract method, so any class implementing this interface is required to have a method of this type and name;

    //An interface needs 0 or more abstract methods
    //It can have infinite abstract methods but using a ton is utterly terrible to work with
    //95% cannot hold information (no variables) - technically you can put constants but really shouldn't
    //Can not construct an interface/cant make an instance of measurable in this cause
    //However you can cast a object that implements measurable to be measurable to make a comparison
    //Can (usually) only hold abstract methods
    //Interfaces help facilitate code reusage and polymorphism

}