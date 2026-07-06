package Recursion;

public class Palindrone {
    public static void main(String[] args) {
        int n=121;
        reverse(n);
        if(n==sum){
            System.out.println("palindrone");
        }
        else {
            System.out.println("Not palindrone");
        }
    }
    static int sum=0;
    static void reverse(int n){
        int rem=0;
        if(n==0){
            return;
        }
        rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }
}
