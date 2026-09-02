package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void getSubset(List<String> res, String s, String curr, int i){
        if(s.length() == i){
            res.add(curr);
            return;
        }
        getSubset(res, s, curr+s.charAt(i), i+1);
        getSubset(res, s, curr, i+1);
    }

    public static void main(String[] args) {
        List<String> res = new ArrayList<>();
        getSubset(res, "ABC", " ", 0);
        System.out.println(res);
    }
}


