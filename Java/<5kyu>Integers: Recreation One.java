// https://www.codewars.com/kata/55aa075506463dac6600010d

import java.util.ArrayList;

public class SumSquaredDivisors {
  
  public static String listSquared(long m, long n) {
        String output = "[";

        for(long i = m; i <= n; i++){
            ArrayList<Long> divisors = findDivisors(i);
            long sum = sumSquaredDivisors(divisors);

            if(isPerfectSquare(sum)){
                if(output.length() > 1){ // adding "," before second and next element
                    output += (", [" + i + ", " + sum + "]");
                }
                else{
                    output += ("[" + i + ", " + sum + "]");
                }
            }
        }

        output += "]";

        return output;
    }

    public static ArrayList<Long> findDivisors(long k){
        ArrayList<Long> divisors = new ArrayList<Long>();

        for(long i = 1; i <= k; i++){
            if(k%i == 0){
                divisors.add(i);
            }
        }

        return divisors;
    }

    public static long sumSquaredDivisors(ArrayList<Long> arr){
        long sum = 0;

        for(Long d : arr){
            sum += d*d;
        }

        return sum;
    }

    public static boolean isPerfectSquare(long n){
        int s = (int) Math.sqrt(n);

        if((s*s - n) == 0){
            return true;
        }

        return false;
    }
}
