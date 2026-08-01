package Mathematics;

public class Prime {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5; i*i<=n; i = i + 6){
            if (n%i==0 || n%(i+1)==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 7; 
      	if(isPrime(n)){
        	System.out.println("true");
        }else{
          System.out.println("false");
    	}
    }
}
