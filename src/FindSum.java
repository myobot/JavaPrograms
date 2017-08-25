import java.awt.*;

/**
 * Created by WZW on 2017/08/01.
 */
public class FindSum {
    public static void main(String args[]){
        int a[]={1,2,4,7,9,10,20};
        int small=0;
        int big=a.length-1;
        int targe=13;
        String str=new String("1234 2345 3456");
        String c[]=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=c.length-1;i>=0;i--){
            if(i!=0){
                sb.append(c[i]).append(" ");
            }else{
                sb.append(c[i]);
            }
        }
        System.out.println(sb.toString());
        while(small<big){
            if(a[small]+a[big]>targe){
                big--;
            }
            if(a[small]+a[big]<targe){
                small++;
            }
            if(a[small]+a[big]==targe){
                System.out.println(a[small]+" "+a[big]);
                break;

            }
        }
    }
}
