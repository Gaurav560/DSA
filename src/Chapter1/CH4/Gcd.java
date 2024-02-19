package Chapter1.CH4;

public class Gcd {

    //brute force-> TC: O(N), where N is the smallest number.
    public static int findGcd(int a, int b){
        int ans=1;
        for (int i = 1; i <= Math.min(a,b); i++)
        {
            if (a%i==0&&b%i==0)
            {
                ans=i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findGcd(3,4));
    }
}
