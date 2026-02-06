package Classwork2;

public class SamHolder
{

    private String[] bucket;
    private int size;

    public SamHolder()
    {//constructor "initializes global variables"
        bucket = new String[10];
        size = 0;
    }

    public SamHolder(int userInputSize)
    {
        bucket = new String[userInputSize];
        size = 0;
    }

    public SamHolder(String[] userInputBucket)
    {
        bucket = new String[userInputBucket.length];
        for (int i = 0; i < userInputBucket.length; i++)
        {
            bucket[i] = userInputBucket[i];
        }
        size = userInputBucket.length;
    }

    public String[] getBucket()
    {
        return bucket;
    }

    public String getBucketElement(int userInputIndex)
    {
        return bucket[userInputIndex];
    }

    public void printer()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print("["+bucket[i]+"] ");
        }
    }

    public void remove(int userInputIndex)
    {
        String[] temp = bucket;

        for (int i = userInputIndex; i < size; i++)
        {
            bucket[i] = temp[i+1];
        }

        size--;
    }

    public void addWithinSamuel02052026Bucket(int userInputIndex, String userInputElement)
    {
        String[] temp = bucket;

        bucket = new String[bucket.length+1];
        for (int i = 0; i < userInputIndex; i++)
        {
            bucket[i] = temp[i];
        }
        bucket[userInputIndex] = userInputElement;
        for(int i = userInputIndex+1; i < bucket.length; i++)
        {
            bucket[i] = temp[i-1];
        }
        size++;
    }

    public void clear()
    {
        bucket = new String[bucket.length];
        size = 0;
    }

    public int getSize()
    {
        return size;
    }

    public void addToBucket(String userInputToBucket)
    {
        if (size < bucket.length)
        {
            bucket[size] = userInputToBucket;
            size++;
        }
        else
        {
            String[] temp = new String[size];
            temp = bucket; //create a temp variable, and store the current value of bucket within

            bucket = new String[size*2]; //empty bucket and double size

            for (int i = 0; i<size; i++) //assign each temp value to the parts of bucket
            {
                bucket[i] = temp[i];
            }
            bucket[size] = userInputToBucket; //add the last value
            size++; //adjust size
        }
    }

    //Part 6 Methods
    public void addToEnd()
    {
        addToBucket("END to END");
    }

    public SamHolder cloneClass()
    {
        return new SamHolder(bucket);
    }

    public void replace(String userInputElement, int userInputIndex)
    {
        bucket[userInputIndex] = userInputElement;
    }

    public boolean find(String userInputElement)
    {
        for (int i = 0; i < size; i++)
        {
            if (bucket[i].equals(userInputElement))
            {
                return true;
            }
        }
        return false;
    }

    public int findCount(String userInputElement)
    {
        int tempCount = 0;
        for (int i = 0; i < size; i++)
        {
            if (bucket[i].equals(userInputElement))
            {
                tempCount++;
            }
        }
        return tempCount;
    }

    public void trimToSize()
    {
        String[] temp = bucket;
        bucket = new String[size];
        for (int i = 0; i < size; i++)
        {
            bucket[i] = temp[i];
        }
    }
}


