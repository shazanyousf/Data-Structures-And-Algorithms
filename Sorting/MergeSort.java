import java.util.*;
import java.lang.*;
import java.io.*;
 
public class MergeSort {
 
    public static void merge(int[] arr, int start ,int mid, int end) // merge 2 sorted arrays
    {
        int p1= start; // start pointer at first array [ start , mid ]
        int p2= mid+1; // start pointer at second array [ mid+1 , end]
        int size=end-start+1;
        int[] narr = new int[size];
        int i=0;
        while(p1<=mid && p2<=end)
        {
            if(arr[p1]<arr[p2])
            {
                narr[i]=arr[p1];
                i++;
                p1++;
            }
            else{
                narr[i]=arr[p2];
                i++;
                p2++;
            }
        }
        while(p1<=mid)
        {
            narr[i]=arr[p1];
            i++;
            p1++;
        }
        while(p2<=end)
        {
            narr[i]=arr[p2];
            i++;
            p2++;
        }
 
        for( i=0;i<size;i++)
        {
            arr[start+i]= narr[i];
        }
 
    }
    public static void divide(int[] arr, int start, int end)
    {
        if(start == end) // single element is present
        {
            return;
        }
        int mid= (start+end)/2;
        // divide array into two parts
        divide(arr, start , mid); 
        divide(arr, mid+1 , end);
        merge(arr, start ,mid ,  end);
    }
 
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] arr = { 7 , 6 , 2 , 1 , 9 , 5, 4 , 3 , 8};
	    divide(arr,0,8); // sort( array , start , end)
	    int n= 9;
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(arr[i]);
	        System.out.print(" ");
	    }
 
	}
}