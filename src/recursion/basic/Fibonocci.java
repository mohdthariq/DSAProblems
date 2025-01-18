package recursion.basic;

public class Fibonocci {

    public static void main(String args[]){
        System.out.println(fibonocci(6));
    }

    public static int fibonocci(int n) {
      if(n<=1){
          return n;
      }
      else{
          return fibonocci(n-1)+fibonocci(n-2);
      }
    }


}
