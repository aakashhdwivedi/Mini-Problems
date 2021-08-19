import java.util.Scanner;
public class QuickSort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the Size Of Random Array :\n");
        int n = sc.nextInt();
        
        //Initialising the Array
        int arr[] = new int[n];
        
        //Filling the Array with Random Elements
        for(int i=0;i<n ;i++){
            arr[i]= (int)(Math.random()*100);
        }
        
        //Printing the Unsorted Array
        System.out.println("\n\nUnsorted Array Is :");
        for(int i : arr){
            System.out.print(i+" ");
        }
        
        //Sorting Array using Quick Sort
        quickSort(arr,0,arr.length-1);
        
        //Printing the Sorted Array
        System.out.println("\n\nSorted Array is :");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
   
    public static void quickSort(int[] a,int l,int h){
        
        //Checking if the Array contains Atleast Two Elements
        if(l<h){
            //Getting the index of Pivot which is placed to its correct Sorted position using Partition method
            int pivot = partition(a,l,h);
            
            //Recursively Calling quickSort method on Both left and right halves of the pivot
            quickSort(a,l,pivot-1);
            quickSort(a,pivot+1,h);
            
        }
    }
    
    public static int partition(int[] a,int l,int h){
        
        //Setting the Leftmost Element as Pivot 
        int pivot = a[l];
        int i= l;
        int j=h;
        
        //Placing the Elements to their Right Sorted Positions
        while(i<j){
            while(a[i]<=pivot) {
                i++;
                if(i==h)break;
            }
            while(a[j]>pivot) {
                j--;
                if(j==l)break;
            }
            
            if(i<j){
                int temp = a[i];
                a[i] =a[j];
                a[j] = temp;
            }
        }
        int temp = a[l];
        a[l]=a[j];
        a[j] =temp;
        
        //Returning the index of Pivot element
        return j;
    }
    
}
