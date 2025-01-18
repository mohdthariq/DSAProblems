package recursion.basic;

public class Palindrome {
    public static void main(String args[]){

        String name = "malayalamm";
        System.out.println(isPalindorme(name,0,name.length()));

    }
    public static boolean isPalindorme(String name,int ind,int n){
        if(name.charAt(ind) != name.charAt(n-ind-1)){
            return false;
        }
        else if(ind >= n/2){
            return true;
        }
        else {
            return isPalindorme(name, ind + 1, n);
        }
    }
}
