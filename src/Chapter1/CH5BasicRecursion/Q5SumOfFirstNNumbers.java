package Chapter1.CH5BasicRecursion;

public class Q5SumOfFirstNNumbers {

    //tc: O(N) as it goes a full loop.
//    static  int sum(int n){
//        int sum=0;
//        for (int i = 1; i <=n ; i++) {
//
//            sum +=i;
//        }
//        return sum;
//    }


    //functional way
    static  int sum(int n){

        if (n==0){
            return 0;
        }

        return  n+sum(n-1);

    }
    public static void main(String[] args) {
        System.out.println(sum(6));
    }
}
