package recursion.basic;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String args[]){
        int arr[] = {1,2};
        int n = arr.length;
        System.out.println(Arrays.toString(reverseArray(arr, n, 0)));
    }

    public static int[] reverseArray(int arr[],int n,int ind){

        if(ind>=n/2){
            return arr;
        }
        else{
            int temp;
            temp = arr[ind];
            arr[ind] = arr[n-ind-1];
            arr[n-ind-1] = temp;
            return reverseArray(arr,n,ind+1);

        }

    }

}
