/**
 * Created by WZW on 2017/08/09.
 */
import java.util.*;
public class Main34{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String s1=in.nextLine();
        int count=0;
        for(int i=0;i<=s.length();i++){
            StringBuilder stb=new StringBuilder(s);
            stb.insert(i,s1);
            if(charge(stb.toString())){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean charge(String s){
        char c[]=s.toCharArray();
        for(int i=0;i<c.length/2;i++) {
            char temp = c[i];
            c[i] = c[c.length - i - 1];
            c[c.length - i - 1] = temp;
        }
        return new String(c).equals(s);
    }
}
