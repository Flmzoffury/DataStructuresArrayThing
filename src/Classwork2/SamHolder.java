package Classwork2;

import java.lang.reflect.Array;
import java.util.Arrays;
public class SamHolder<T>
{

    private T[] bucket;
    private int size;

    public SamHolder()
    {//constructor "initializes global variables"

        //Todo
        bucket = (T[]) new Object[size];//T[];
        size = 0;
    }

    public SamHolder(int userInputSize)
    {
        bucket = (T[]) new Object[userInputSize];
        size = 0;
    }

    public SamHolder(T[] userInputBucket)
    {
        bucket = (T[]) new Object[userInputBucket.length];
        for (int i = 0; i < userInputBucket.length; i++)
        {
            bucket[i] = userInputBucket[i];
        }
        size = userInputBucket.length;
    }

    public T[] getBucket()
    {
        return bucket;
    }

    public T getBucketElement(int userInputIndex)
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
        T[] temp = (T[]) new Object[size];

        for (int i = userInputIndex; i < size; i++)
        {
            bucket[i] = temp[i+1];
        }

        size--;
    }

    public void addWithinSamuel02052026Bucket(int userInputIndex, T userInputElement)
    {
        T[] temp = bucket;

        bucket = (T[]) new Object[bucket.length+1];
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
        bucket = (T[]) new Object[bucket.length];
        size = 0;
    }

    public int getSize()
    {
        return size;
    }

    public void addToBucket(T userInputToBucket)
    {
        if (size < bucket.length)
        {
            bucket[size] = userInputToBucket;
            size++;
        }
        else
        {
            T[] temp = (T[]) new Object[size];

            temp = bucket; //create a temp variable, and store the current value of bucket within

            bucket = (T[]) new Object[size*2]; //empty bucket and double size

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
        addToBucket((T) new Object());
    }

    public SamHolder cloneClass()
    {
        return new SamHolder(bucket);
    }

    public void replace(T userInputElement, int userInputIndex)
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
        T[] temp = bucket;
        bucket = (T[]) new Object[size];
        for (int i = 0; i < size; i++)
        {
            bucket[i] = temp[i];
        }
    }
}


