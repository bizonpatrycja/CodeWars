// https://www.codewars.com/kata/54d512e62a5e54c96200019e

import java.util.ArrayList;

public class PrimeDecomp {
   
    public static String factors(int n) {
        int p = 0;
        String output = "";
        ArrayList<Integer> primeNubers = new ArrayList<Integer>();
        ArrayList<Integer> tempArr = new ArrayList<Integer>();

        for(int i = 2; i <= n; i++){
            while(n%i == 0){
                primeNubers.add(i);
                tempArr.add(i);
                n /= i;
            }
        }

        for(int i = 0; i <= primeNubers.size() - 1; i++){
            int times = 0;
            ArrayList<Integer> toBeRemoved = new ArrayList<Integer>();
            if(tempArr.contains(primeNubers.get(i))) {
                for (int j = 0; j <= tempArr.size() - 1; j++) {
                    if (tempArr.get(j).equals(primeNubers.get(i))) {
                        times++;
                        toBeRemoved.add(tempArr.get(j));
                    }
                }
                tempArr.removeAll(toBeRemoved);
                toBeRemoved.clear();

                if(times > 1){
                    output += "(" + primeNubers.get(i) + "**" + times + ")";
                }
                else{
                    output += "(" + primeNubers.get(i) + ")";
                }
            }
        }

        return output;
    }
       
}
