/**
 * Created by WZW on 2017/08/07.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main17 {
    public String PrintMinNumber(int [] numbers) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<numbers.length;i++){
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1=o1+""+o2;
                String s2=o2+""+o1;
                return s1.compareTo(s2);
            }
        });
        StringBuilder s=new StringBuilder();
        for(int i=0;i<list.size();i++){
            s.append(list.get(i));
        }
        return s.toString();
    }
}