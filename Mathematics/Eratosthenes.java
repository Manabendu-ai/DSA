package Mathematics;

import java.util.ArrayList;

public class Eratosthenes {

    public static ArrayList<Integer> sieve(int n){
       boolean[] prime = new boolean[n+1];
       for(int i = 0; i<=n ; i++){
           prime[i] = true;
       }

       for(int p =2; p*p<=n; p++){
           if(prime[p]){
               for(int i = p*p; i<=n; i+=p){
                   prime[i] = false;
               }
           }
       }

       ArrayList<Integer> res = new ArrayList<>();
       for(int p = 2; p<=n; p++){
           if(prime[p]){
               res.add(p);
           }
       }
       return res;
    }

    public static void main(String[] args) {
        int n = 35;

        ArrayList<Integer> res = sieve(n);

        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }
}
