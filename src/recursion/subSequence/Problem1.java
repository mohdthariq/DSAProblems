package recursion.subSequence;

//L6. Recursion on Subsequences | Printing Subsequences

import java.util.ArrayList;
import java.util.List;

public class Problem1 {

    public static void main(String args[]){

        int arr[]={3,1,2};
        int n = arr.length;
        ArrayList<Integer> ds = new ArrayList<>();
        List<List<Integer>> lists = printAllSubsequence(arr, 0, n, ds, new ArrayList<List<Integer>>());
        System.out.println(lists.toString());
    }

    private static List<List<Integer>> printAllSubsequence(int[] arr, int ind, int n, ArrayList<Integer> ds,
                                                           ArrayList<List<Integer>> ansList) {
          if(ind >= n){
              ansList.add(new ArrayList<>(ds));
              return ansList;
          }
          else{
              ds.add(arr[ind]);
              printAllSubsequence(arr,ind+1,n,ds,ansList);
              ds.remove(ds.size()-1);
              printAllSubsequence(arr,ind+1,n,ds,ansList);
              return ansList;
          }

    }
}
