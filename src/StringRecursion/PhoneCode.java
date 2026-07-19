package StringRecursion;

public class PhoneCode {
    static void main() {
    decode("","12");
    }
    static  void decode(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        int ch =up.charAt(0)-'0';
        for (int i = (ch-1)*3; i <ch*3 ; i++) {
            char a=(char) ('a'+i);
            decode(p+a,up.substring(1));

        }
    }
}
