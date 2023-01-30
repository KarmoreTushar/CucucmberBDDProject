package Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
public class Assignment6 {
	
 public static void main(String[] args)
 {
	 // Create ArrayLis. Here we make it generic in string 
     ArrayList<Integer> ArrList = new ArrayList<Integer>();
     // add values in ArrayList
     ArrList.add(10);
     ArrList.add(30);
     ArrList.add(70);
     ArrList.add(20);
     ArrList.add(30);
     ArrList.add(70);
     ArrList.add(50);
//original arrayList
     System.out.println("Original ArrayList is : " + ArrList);
//display unique elements
     HashSet<Integer> hset = new HashSet<Integer>(ArrList);
// display HastSet
     System.out.println("Unique elements : "+ hset);
    
 }
}


class CountArrayDuplicates1 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int Size, i, j, dup_count = 0;
		
		sc = new Scanner(System.in);
		
		System.out.print("\nPlease Enter the Duplicate Array size  : ");
		Size = sc.nextInt();
		
		int[] Dup_Count_arr = new int[Size];
		
		System.out.format("\nEnter Duplicate Array %d elements : ", Size);
		for(i = 0; i < Size; i++) 
		{
			Dup_Count_arr[i] = sc.nextInt();
		}
		
		for(i = 0; i < Size; i++) 
		{
			for(j = i + 1; j < Size; j++)
			{
				if(Dup_Count_arr[i] == Dup_Count_arr[j]) {
					dup_count++;
					break;
				}
			}
		}
		System.out.println("\nThe Total Number of Duplicates  = " + dup_count);
	}
	
}

class GFG {
	 
    static boolean arraySortedOrNot(int a[], int n)
    {
          // base case
        if (n == 1 || n == 0)
            return true;
     
        return a[n - 1] >= a[n - 2]
            && arraySortedOrNot(a, n - 1);
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        int arr[] = { 20, 23, 23, 45, 78, 88 };
        int n = arr.length;
         
          // Function Call
        if (arraySortedOrNot(arr, n))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}


class ABC {
    public static void main(String[] args)
        throws IllegalStateException
    {
 
        // create object of Queue
        Queue<Integer> Q
            = new LinkedList<Integer>();
 
        // Add numbers to end of Queue
        Q.add(7855642);
        Q.add(35658786);
        Q.add(5278367);
        Q.add(74381793);
 
        // before removing print queue
        System.out.println("Queue: " + Q);
    }
}

class Test {
    public static void main(String[] args)
    {
  
        // Creating a list of strings
        List<String> aList = Arrays.asList("Geeks", "for",
                     "GeeksQuiz", "GeeksforGeeks", "GFG");
  
        Set<String> hSet = new HashSet<String>();
        for (String x : aList)
            hSet.add(x);
  
        System.out.println("Created HashSet is");
        for (String x : hSet)
            System.out.println(x);
  
        // We can created TreeSet same way
    }
}