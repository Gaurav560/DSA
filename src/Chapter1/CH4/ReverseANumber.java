package Chapter1.CH4;

public class ReverseANumber {

    //TC: O(N), where n is the length of the number.
    public static void main(String[] args) {
        int number=237992;
     int reverseNum=0;
     while (number>0){
         reverseNum=reverseNum*10+number%10;
         number /= 10;
     }
        System.out.println(reverseNum);

    }
}
