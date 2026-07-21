package StringRecursion;

public class Dice {
    static void main() {
        dice("",4);
    }
    static void dice(String s,int n){
        if(n==0){
            System.out.println(s);
            return;
        }
        for (int j = 1; j <=n; j++) {
//

            dice(s+j,n-j);
        }
    }


}
