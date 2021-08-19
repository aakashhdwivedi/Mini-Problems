/*
 * 
 * This Program Takes an Integer input as Size of the Array.
 * 
 * It generates a Random Integer Array With the Help of Math.random() method.
 * 
 * Then it Sorts the Array using Merge Sort.
 * 
 * 
 */
package SortingAlgorithms;

import java.util.Scanner;

public class MergeSort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of Random Array :\n");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n ;i++){
            arr[i]= (int)(Math.random()*100);
        }
        System.out.println("\n\nUnsorted Array Is :");
        for(int i : arr){
            System.out.print(i+" ");
        }
        mergeSort(arr, 0, n-1);
        System.out.println("\n\nSorted Array is :");
        for(int i:arr){
            System.out.print(i+" ");
        }
        
    }
    
    public static void mergeSort(int[] a, int l, int r){
       if(l<r){
            int mid = (l+r)/2;
        mergeSort(a,l,mid);
        mergeSort(a,mid+1,r);
        
        merge(a,l,mid,r);
        }
    }
    
    
    public static void merge(int[] a, int l, int mid, int r)
    {
        int b[] = new int[l+r+1];
        int i = l;
        int j=mid+1;
        int k= l;
        
        while(i<=mid && j<=r){
            if(a[i]<a[j]){
                b[k] = a[i];
                i++;
            }
            else{
                b[k] = a[j];
                j++;
            }
            k++;
        }
        if(i>mid){
           while(j<=r)
             {
                b[k]= a[j];
                k++;j++;
            }
        }
        else{
            while(i<=mid){
                b[k] = a[i];
                k++;i++;
            }
        }
        for(int t=l;t<=r;t++){
            a[t] = b[t];
        }
        
    }
    
}
