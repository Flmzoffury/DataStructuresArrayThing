package MK;

public class EqualityOperators
{
    public static void main(String[] args)
    {
        //one way to determine equality is by using ==
        int numOne = 1; int numTwo = 2;
        System.out.println(numOne == numTwo);
        //another way is to use the .equals() method for many objects
        String dog = "dog";
        String cat = "cat";
            //you cannot do dog == cat because it will compare the memory locations not the actual string
        if (dog.equals(cat))
        {
            System.out.println("They're fighting!!");
        }

        //Cannot compare decimals(floats/doubles) using ==
        /*
        if (1.2 == 1.2)
        {

        }
         */

        double sum = 0;
        for (int i = 0; i < 10; i++)
        {
            sum += 0.1;
            System.out.println(sum); //shows off the weirdness
        }
    }
}
