/**
 * Created by WZW on 2017/08/10.
 * 腾讯4
 */
import java.util.*;
public class Main58{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int left=-90;
        int right=90;
        String str="";
        for(int i=0;i<6;i++){
            int mid=(left+right)/2;
            if(n>=mid){
                left=mid;
                str+="1";
            }else{
                right=mid-1;
                str+="0";
            }
        }
        System.out.println(str);
    }
}