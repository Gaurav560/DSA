package Chapter1.CH5Recursion;

public class Q2PrintNameNTimes {

    static void printName(int n, int i){
        if (i>n){
            return;
        }
        System.out.println("My name is Gaurav");
        i++;
        printName(n,i);
    }
    public static void main(String[] args) {
        printName(4,1);
    }
}
