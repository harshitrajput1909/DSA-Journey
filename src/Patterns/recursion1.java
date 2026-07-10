package Patterns;

public class recursion1 {
    public static void main(String[] args) {
        pattern(5,5,1);
    }
    static void pattern(int n,int i,int j){
      if(i==0){
          return;
      }
      if(i==j){
          System.out.println();
          pattern(n,--i,1);
      }
      else{
          System.out.print("* ");
          pattern(n,i,++j);
      }

    }
}
