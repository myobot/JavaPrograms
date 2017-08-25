/**
 * Created by WZW on 2017/08/07.
 */
import java.util.*;
public class Main20{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<2){
            System.out.println("0");
        }else{
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
//            Arrays.sort(a);
//            int max=Integer.MIN_VALUE;
//            for(int i=0;i<=a.length-2;i++){
//                if(a[i+1]-a[i]>max){
//                    max=a[i+1]-a[i];
//                }
//            }
//            System.out.println(max);
            int temp[]=new int[n];
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                for(int j=0;j<i;j++){
                    if(Math.abs(a[i]-a[j])<temp[j]||temp[j]==0){
                        temp[j]=Math.abs(a[i]-a[j]);
                    }
                }
            }
            for(int i=0;i<n;i++){
                if(max<temp[i]){
                    max=temp[i];
                }
            }
            System.out.println(max);
        }
    }
}