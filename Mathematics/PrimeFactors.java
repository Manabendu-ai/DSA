package Mathematics;

import java.util.ArrayList;

public class PrimeFactors {
    public static ArrayList<Integer> getPrimeFactors(int n){
        ArrayList<Integer> factors = new ArrayList<>();

        while(n%2==0){
            factors.add(2);
            n/=2;
        }

        for(int i =3; i*i<=n; i+=2){
            if(n%i==0){
                factors.add(i);
                n/=i;
            }
        }

        if(n>2){
            factors.add(n);
        }
        return factors;
    }

    public static void main(String[] args) {
        int n = 27;
        ArrayList<Integer> result = getPrimeFactors(n);

        for (int factor : result) {
            System.out.print(factor + " ");
        }
    }
}
