package Chapter1.CH5BasicRecursion;

public class Q6Factorial {

    //iterative way
//    static  int findFactorial(int n){
//        int mulValue=1;
//        for (int i = n; i >=1 ; i--) {
//            mulValue *=i;
//        }
//        return  mulValue;
//    }


    static  int findFactorial(int n){
     if (n==1){
         return 1;
     }
     return n * findFactorial(n-1);
    }


    public static void main(String[] args) {
        System.out.println(findFactorial(6));
    }
}
