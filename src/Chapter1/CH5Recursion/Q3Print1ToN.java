package Chapter1.CH5Recursion;

public class Q3Print1ToN {

    static void  print(int i, int n){
        if (i>n){
            return;
        }
        System.out.println(i);
        i++;
        print(i,n);
    }
    public static void main(String[] args) {
       print(1,7);
    }
}
