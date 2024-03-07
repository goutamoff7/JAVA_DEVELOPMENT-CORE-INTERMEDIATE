package linkedList;

import java.util.*;
class ArrayListExample
{
    public static void main(String[] args) 
    {
        //size of the array list
        int n=5;
        //Declaring the Array list with initial size n
        ArrayList <Integer> arr1=new ArrayList<>(n);
        //Declaring the Array list
        ArrayList <Character> arr2 = new ArrayList<>();
        //printing Array list
        System.out.println("Array 1: "+arr1);
        System.out.println("Array 2: "+arr2);
        //Appending new elements at the end of the list
        for(int i=1;i<=n;i++)
        {
			arr1.add(i);
            arr2.add((char)(i+64));
            
        }
        //Printing the Array list
        System.out.println("Array1: "+arr1);
        System.out.println("Array2: "+arr2);
    }
    
}