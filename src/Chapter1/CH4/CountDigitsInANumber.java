package Chapter1.CH4;

public class CountDigitsInANumber {

    //brute force Approach
    public static void main(String[] args) {
        int number=2345;
        int count=0;
        while(number%10!=0){
           count +=1;
           number /=10;
        }
        System.out.println(count);
    }
}
