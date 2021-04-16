// https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec

import static java.lang.Math.toIntExact;

class Persist {

    public static void main(String[] args) {
        System.out.println(persistence(39));
    }

    public static int persistence(long n) {
        long persistence;
        int multipl = 1;
        int length = String.valueOf(n).length();
        if (length == 1) {
            return 0;
        }

        long tempNum = n;

        while (true) {
            persistence = tempNum%10;
            for (int i = 0; i < length - 1; i++) {
                tempNum /= 10;
                persistence *= tempNum%10;
            }

            if(persistence < 10){
                return multipl;
            }
            else{
                tempNum = persistence;
                length = String.valueOf(tempNum).length();
                multipl++;
            }
        }
    }
}
