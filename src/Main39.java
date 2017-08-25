/**
 * Created by WZW on 2017/08/09.
 */
import java.util.*;
public class Main39{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        for(int i=0;i<N;i++){
            int n=in.nextInt();
            int m=in.nextInt();
            int a[]=new int[2*n];
            for(int j=0;j<2*n;j++){
                a[j]=in.nextInt();
            }
            xi(a,m);
            for(int j=0;j<a.length;j++){
                if(j==a.length-1)
                    System.out.println(a[j]);
                else
                    System.out.print(a[j]+" ");
            }
        }
    }
    public static void xi(int a[],int m){
        for(int i=0;i<m;i++){
            int temp[]=new int[a.length];
            int num=0;
            for(int j=a.length-1;j>=a.length/2;j--){
                temp[num++]=a[j];
                temp[num++]=a[j-a.length/2];
            }
            for(int j=0;j<a.length;j++){
                a[a.length-j-1]=temp[j];
            }
        }
    }
}