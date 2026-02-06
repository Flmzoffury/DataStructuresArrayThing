package Classwork2;

public class Main {
    public static void main(String[] args)
    {
        SamHolder sam = new SamHolder();

        for (int i = 0; i < 13; i++)
        {
            sam.addToBucket("E"+i);
        }

        //System.out.println("Size: " + sam.getSize());

       /* System.out.println("Specific Element: " + sam.getBucketElement(5));

        System.out.println("Printer:");
        sam.printer();

        System.out.println("Cleared:");
        sam.clear();*/
        /*System.out.println("Printer:");
        sam.remove(4);
        sam.addWithinBucket(1, "HELLO");
        sam.printer();*/

        sam.addToEnd();
        SamHolder notSam = sam.cloneClass();
        System.out.println(notSam.getBucket()[0]);
        sam.replace("nope", 0);
        System.out.println("Find:");
        System.out.println(sam.find("E10"));
        System.out.println("Find Count:");
        System.out.println(sam.findCount("E10"));

        System.out.println("hello");

        System.out.println("Hello there this will be a commit and push");
    }
}
