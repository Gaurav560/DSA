package Chapter1.CH4;

public class CountDigitsInANumber {

    //brute force Approach-> Time Complexity: O(n) as we have to traverse every digit
    //u can get the same result after removing the modulo operation.
//    public static void main(String[] args) {
//        int number=234545;
//        int count=0;
//        while(number%10!=0){
//           count +=1;
//           number /=10;
//        }
//        System.out.println(count);
//    }


    //better approach as TC:O(1)
//    public static void main(String[] args) {
//        int number=234545;
//        //this Integer.toString() will take an integer and convert it into String.
//     String str=Integer.toString(number);
//
//        System.out.println(str.length());
//    }



    //best approach-> TC: O(1)
    public static void main(String[] args) {
        int number=234545;

     int count=(int) Math.log10(number)+1;
        System.out.println(count);
    }

}
