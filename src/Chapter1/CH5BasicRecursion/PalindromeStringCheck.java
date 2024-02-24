package Chapter1.CH5BasicRecursion;

public class PalindromeStringCheck {

    //tc: O(N) as . This is because each character in the
    // input string must be copied to a new array.
    //sc: O(N) :The space complexity is O(n) due to the
    // allocation of a char array that is the same size as the input string.
//using extra space

//    public boolean palindromeCheck(String str){
//        char[] ch=str.toCharArray();
//        int j=ch.length-1;
//        for (int i = 0; i < ch.length/2 ; i++) {
//            if (ch[i]!=ch[j]){
//                return false;
//            }
//            j--;
//
//        }
//        return  true;
//    }

//without using extra space






    //tc and sc: O(N)
    public boolean palindromeCheck(int i, String str) {
        if (i >= str.length()/2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
            return false;

        }
        return palindromeCheck(i + 1, str);
    }

    public static void main(String[] args) {
        PalindromeStringCheck palindromeStringCheck = new PalindromeStringCheck();

        System.out.println(palindromeStringCheck.palindromeCheck(0,"ABCbhDCBA"));
    }
}
