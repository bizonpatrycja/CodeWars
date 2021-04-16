// https://www.codewars.com/kata/54da539698b8a2ad76000228

public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if(walk.length != 10){
            return false;
        }

        int x = 0;
        int y = 0;

        for(int i = 0; i < walk.length; i++){
            if(walk[i] == 'n'){
                y++;
            }
            if(walk[i] == 's'){
                y--;
            }
            if(walk[i] == 'w'){
                x--;
            }
            if(walk[i] == 'e'){
                x++;
            }
        }
        
        if(x == 0 && y == 0){
            return true;
        }
        return false;
  }
}
