package Chapter1.CH4;

public class CheckPalindrome {

    //TC: O(N) ,where N is the number of digits in the numbers.
    public static void main(String[] args) {
        int number=888;
        int originalNumber = number;
        int reverseNum=0;

        while (number!=0)
        {
            reverseNum=reverseNum*10+number%10;
            number /= 10;
    }
     //   System.out.println(reverseNum);
        if (originalNumber==reverseNum){
            System.out.println("Palindrome Checked: True");
        }else{
            System.out.println("Palindrome Checked: False");
        }
    }
}
