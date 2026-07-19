package StringRecursion;

import java.util.ArrayList;

public class Permutation {
    static void main() {
    ArrayList<String> finalans=permuArray("","abc");
        System.out.println(finalans);
    }
    static void permu(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second =p.substring(i);
        permu(first+ch+second,up.substring(1));
        }
    } static ArrayList<String> permuArray(String p,String up){
        if(up.isEmpty()){
//            System.out.println(p);
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList <String> ans=new ArrayList<>();
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second =p.substring(i);
       ArrayList<String> s =permuArray(first+ch+second,up.substring(1));
       ans.addAll(s);
        }
        return ans;
    }
}
