package Chapter1.CH4BasicMaths;

//tc: O(N) as O(N) for finding power and O(N) for finding sum .which results in  O(N)+O(N)=>O(N)
public class ArmstrongNumber {

    //method to find the no of digits in a number
    static int power(int n)
    {
        if (n==0){
            return 1;
        }
        int length=0;
        while(n!=0){
            length += 1;
            n /= 10;
        }
        return length;
    }


    //method to find the sum of digits raised to the power no of digits
static int sum(int num,int pow){
int add=0;
while (num!=0){
    add +=Math.pow(num%10,pow);
    num=num/10;
}
return add;
}

//method to check Armstrong or not
static boolean checkArmstrong(int num){
    if (num==sum(num,power(num))){
        return true;
    }  else return  false;
}

//Calling all methods inside the Driver Method
    public static void main(String[] args) {
       if (checkArmstrong(1635)){
           System.out.println("it is an Armstrong number");
       }else {
           System.out.println("it is not an armstrong number.");
       }


    }

}
