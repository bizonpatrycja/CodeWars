import java.util.*;
public class TimeFormatter {

  public static String formatDate(int array[]){
        String date = "";
        String name[] = {"year", "day", "hour", "minute", "second"};
        
        for(int i = 0; i < 5; i++){
            if(array[i] > 1){
                date += (Integer.toString(array[i]) + " " + name[i] + "s, ");
            }
            if(array[i] == 1){
                date += (Integer.toString(array[i]) + " " + name[i] + ", ");
            }
        }
        
        int stringLength = date.length();
        date = date.substring(0, stringLength - 2);
        
        int commasMax[] = new int [4];
        int i = 0;
        for (int index = date.indexOf(","); index >= 0; index = date.indexOf(",", index + 1))
        {
            commasMax[i] = index;
            i++;
        }
        int commas [] = Arrays.copyOfRange(commasMax, 0, i);
        
        if(commas.length >0){
            int lastCommaIndex = commas[commas.length-1];
            date = date.substring(0, lastCommaIndex) + " and" + date.substring(lastCommaIndex + 1);
        }
        return date;
    }
    
    public static String formatDuration(int seconds) {
      int date [] = {0, 0, 0, 0, 0};
    
      if(seconds < 0) return "";
      if(seconds == 0) return "now";
      if(seconds < 60){
          date [4] = seconds;
      }
      
      //minutes
      int minutes, hours, days, years;
      minutes = seconds/60;
      if (minutes > 0 & minutes < 60){
          date[3] = minutes;
          date[4] = seconds%60;
      }
      
      //hours
      hours = minutes/60;
      if (hours > 0 & hours < 24){
          date[2] = hours;
          date[3] = minutes%60;
          date[4] = seconds%60;
      }
      
      //days
      days = hours/24;
      if (days > 0 & days < 365){
          date[1] = days;
          date[2] = hours%24;
          date[3] = minutes%60;
          date[4] = seconds%60;
      }
      
      //years
      years = days/365;
      if(years > 0){
          date[0] = years;
          date[1] = days%365;
          date[2] = hours%24;
          date[3] = minutes%60;
          date[4] = seconds%60;
      }
      for (int i : date){
          System.out.print(i + " ");
      }
      System.out.println();
      
      return formatDate(date);      
    }
}
