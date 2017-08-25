/**
 * Created by WZW on 2017/08/10.
 * tengxun1
 */
import java.util.*;
public class Main56{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char[] c=str.toCharArray();
        int N[]={25*25*25+25*25+25+1,25*25+25+1,25+1,1};
        long sum=0;
        for(int i=0;i<c.length;i++){
            sum+=(c[i]-'a')*N[i]+1;
        }
        System.out.println(sum-1);
    }
}