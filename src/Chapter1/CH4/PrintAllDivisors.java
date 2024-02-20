package Chapter1.CH4;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisors {

    //brute force approach
//    static List<Integer> findAllDivisors(int num){
//        List<Integer> list=new ArrayList<>();
//        list.add(1);
//
//        for (int i = 2; i <= num/2; i++) {
//
//            if (num%i==0){
//                list.add(i);
//            }
//        }
//        list.add(num);
//        return list;
//    }



    static List<Integer> findAllDivisors(int num){
        List<Integer> list=new ArrayList<>();
       //looping till square root of number ,as you will get all divisors at the end of sqrt of Number.
        for (int i = 1; i <=Math.sqrt(num); i++) {
            if (num%i==0){
                list.add(i);
                if ((num/i)!=i){
                    list.add(num/i);
                }
            }


        }

        return list;
    }
    public static void main(String[] args) {
        System.out.println(findAllDivisors(21));
    }
}
