package Chapter1.CH4BasicMaths;

public class CheckForPrime {


    //optimal force approach tc: O(Sqrt(N))
    static boolean checkPrime(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {

          if (num%i==0){
              return false;
          }
        }
        return true;
    }
    public static void main(String[] args) {
if (checkPrime(38)){
    System.out.println("it is a prime number.");
}
else{
    System.out.println("it is not a prime number");
}
    }
}
