// https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1

public class Snail {

   public static int[] snail(int[][] array) {
        if(array[0].length == 0){
            return new int[]{};
        }

        int[] snail = new int[array.length*array.length];
        int index = 0; //to iterate through snail array
        int startIndex = 0;
        int middle = array.length/2;
        if(array.length%2 == 0){
            middle = array.length/2 - 1;
        }

        while(startIndex <= middle){ //startIndex cannot exceed middle of the array
            int[] tempArr = takeOneSquareValues(array, startIndex);
            for(int e : tempArr){
                snail[index] = e;
                index++;
            }
            startIndex++;
        }

        return snail;
    }

    public static int[] takeOneSquareValues(int[][] arr, int startIndex){
        int squareLength = arr.length - 2*startIndex;
        int[] output = new int[squareLength*squareLength - (squareLength-2)*(squareLength-2)]; //size of temporary array holding values from one square
        int index = 0; //to go through output arr

        if(arr.length%2 != 0 && startIndex == arr.length/2){
            return new int[]{arr[startIndex][startIndex]};
        }

        //adding first horizontal values
        for(int i = startIndex; i < squareLength+startIndex; i++){
            output[index] = arr[startIndex][i];
            index++;
        }
        //adding values going down
        for(int i = startIndex + 1; i < squareLength+startIndex; i++){
            output[index] = arr[i][squareLength+startIndex-1];
            index++;
        }
        //adding bottom hirizontal values in reversed way
        for(int i = squareLength+startIndex-2; i >= startIndex; i--){
            output[index] = arr[squareLength+startIndex-1][i];
            index++;
        }
        //adding values going up
        for(int i = squareLength+startIndex-2; i > startIndex; i--){
            output[index] = arr[i][startIndex];
            index++;
        }

        return output;
    }
}
