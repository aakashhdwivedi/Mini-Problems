/*
 * 
 * This Program Takes an Integer input as Size of the Array.
 * 
 * It generates a Random Integer Array With the Help of Math.random() method.
 * 
 * Then it Sorts the Array using Bubble Sort.
 * 
 * 
 */
package SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
    
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
        bubbleSort(arr);
        System.out.println("\n\nSorted Array is :");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void bubbleSort(int a[]){
        int l = a.length;
        for(int i= 0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if(a[j]<a[i]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
    
}
