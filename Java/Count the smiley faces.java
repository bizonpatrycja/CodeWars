// https://www.codewars.com/kata/583203e6eb35d7980400002a

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
        if(arr.size() == 0) {
            return 0;
        }

        int counter = 0;

        for(String s : arr){
            if(s.charAt(0) == ':' || s.charAt(0) == ';'){
                if(s.charAt(1) == '-' || s.charAt(1) == '~'){
                    if(s.charAt(2) == ')' || s.charAt(2) == 'D'){
                      if(s.length() == 3){
                            counter++;
                      }
                    }
                }
                else if(s.charAt(1) == ')' || s.charAt(1) == 'D'){
                    if(s.length() == 2){
                            counter++;
                    }
                }
            }
        }

        return counter;
    }
}
