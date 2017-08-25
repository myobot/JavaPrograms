/**
 * Created by WZW on 2017/08/01.
 */
import java.util.*;
public class Main2{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char[] c=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=1;i<c.length;i++){
            if(c[i]==c[i-1]){
                count++;
            }else{
                sb.append(count).append(c[i-1]);
                count=1;
            }
        }
        sb.append(count).append(c[c.length-1]);
        System.out.println(sb.toString());

    }
}