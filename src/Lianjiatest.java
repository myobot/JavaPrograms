import java.util.Arrays;

/**
 * Created by WZW on 2017/08/19.
 */
public class Lianjiatest {
    public static void main(String args[]){
        String s="java";
        int x[]={1,6,5,89,4,234,2};
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        String s1=new String("abc");
        String s2=new String("abc");
        System.out.print(s1==s2+" ");
        System.out.print(s1.equals(s2));
        replaceJ(s);
        System.out.println(s);
    }
    public static void replaceJ(String s){
        s.replace("j","i");
    }
}
