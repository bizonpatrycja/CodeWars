import java.util.ArrayList;
import java.util.List;

public class Johnann {
    public static List<Long> john = new ArrayList<>();
    public static List<Long> ann = new ArrayList<>();

    public static List<Long> john(long n) {
        if(n <= john.size()){
            return john.subList(0, (int)n);
        }
        if(john.size() == 0){
            john.add((long)0);
        }

        for(int i = john.size(); i < n; i++){
            List<Long> a = ann(john.get(i-1)+1);
            john.add(i - a.get(a.size()-1));
        }
        
        return john;
    }

    public static List<Long> ann(long n) {
        if(n <= ann.size()){
            return ann.subList(0, (int)n);
        }
        if(ann.size() == 0){
            ann.add((long)1);
        }

        for(int i = ann.size(); i < n; i++){
            List<Long> a = john(ann.get(i-1)+1);
            ann.add(i - a.get(a.size()-1));
        }

        return ann;
    }

    public static long sumJohn(long n) {
        long sum = 0;
        List<Long> john = john(n);

        for(int i = 0; i < john.size(); i++){
            sum += john.get(i);
        }

        return sum;
    }

    public static long sumAnn(long n) {
        long sum = 0;
        List<Long> ann = ann(n);

        for(int i = 0; i < ann.size(); i++){
            sum += ann.get(i);
        }

        return sum;
    }
}
