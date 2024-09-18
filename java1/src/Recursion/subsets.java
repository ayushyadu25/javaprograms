package Recursion;

import java.util.ArrayList;

public class subsets {
    static ArrayList<String> arr = new ArrayList<>(); // global
    public static void printsubsets(int i, String s, String ans){
        if(i==s.length()){
            arr.add(ans);
            return;
        }
        printsubsets(i+1,s,ans); // not take
        ans+=s.charAt(i);
        printsubsets(i+1,s,ans); // take
    }
    public static void main(String[] args){
        String s = "abcd";
        arr= new ArrayList<>();  // reset
        printsubsets(0,s,"");
        System.out.println(arr);
    }
}
