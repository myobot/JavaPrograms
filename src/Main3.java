/**
 * Created by WZW on 2017/08/01.
 */
import java.util.*;
public class Main3{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int D=in.nextInt();
        int max=Integer.MIN_VALUE;
        int data[][]=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                data[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int[] sum=new int[8];
                for(int p=0;p<D;p++){
                    if(i-p>=0&&i+p<N&&j-p>=0&&j+p<N){
                        sum[0]+=data[i-p][j];//上
                        sum[1]+=data[i+p][j];//下
                        sum[2]+=data[i][j-p];//左
                        sum[3]+=data[i][j+p];//右
                        sum[4]+=data[i+p][j+p];//右下
                        sum[5]+=data[i-p][j-p];//左上
                        sum[6]+=data[i+p][j-p];//右上
                        sum[7]+=data[i-p][j+p];//左下
                    }
                }
                for(int p=0;p<sum.length;p++){
                    if(sum[p]>max){
                        max=sum[p];
                    }
                    sum[p]=0;
                }
            }
        }
        System.out.println(max);
    }
}