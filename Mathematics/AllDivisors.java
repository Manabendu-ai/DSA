package Mathematics;

import java.util.ArrayList;

public class AllDivisors {

    public static ArrayList<Integer> getAllDivisors(int n){
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();

        int num = 1;
        while(num*num <= n){
            if(n%num == 0){
                res.add(num);
                if(num != n / num){
                    large.add(n/num);
                }
            }
            num++;
        }

        for(int i=large.size()-1; i>=0; i-- ){
            res.add(large.get(i));
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> divisors = getAllDivisors(10);

        for (int div : divisors) {
            System.out.print(div + " ");
        }
    }
}
