package Chapter1.CH4;

public class Gcd {

    //brute force-> TC: O(N), where N is the smallest number.
//    public static int findGcd(int a, int b){
//        int ans=1;
//        for (int i = 1; i <= Math.min(a,b); i++)
//        {
//            if (a%i==0&&b%i==0)
//            {
//                ans=i;
//            }
//        }
//        return ans;
//    }


    //optimal force using Euclidean's theorem->
    //  Euclidean Algo states that : gcd(a,b)=gcd((a-b),b) where a>b.
    //  Do it recursively until one of the number is 0.
    //whenever there is division happening, the number of iterations will be in terms of log
    //TC: O(log of phi(Minimum of (a,b))), where N is the smallest number.
    public static int findGcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(findGcd(0, 1));
    }
}
