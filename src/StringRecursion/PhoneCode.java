package StringRecursion;

import java.util.ArrayList;

public class PhoneCode {
    static void main() {
//   ArrayList<String> finallist= decodeArray("","12");
//        System.out.println(finallist);
        System.out.println(count("","12"));
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
    }static ArrayList<String> decodeArray(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
//            System.out.println(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        int ch =up.charAt(0)-'0';
        for (int i = (ch-1)*3; i <ch*3 ; i++) {
            char a=(char) ('a'+i);
            ans.addAll(decodeArray(p+a,up.substring(1)));

        }
        return ans;
    }static int  count(String p, String up){
        if(up.isEmpty()){
//            ArrayList<String> list =new ArrayList<>();
//            list.add(p);
//          System.out.println(p);
            return 1;
        }
//        ArrayList<String> ans=new ArrayList<>();
        int count =0;
        int ch =up.charAt(0)-'0';
        for (int i = (ch-1)*3; i <ch*3 ; i++) {
            char a=(char) ('a'+i);
            count=count+(count(p+a,up.substring(1)));

        }
        return count;
    }
}
