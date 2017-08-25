/**
 * Created by WZW on 2017/08/09.
 * 数列还原
 * 牛牛的作业薄上有一个长度为 n 的排列 A，这个排列包含了从1到n的n个数，但是因为一些原因，其中有一些位置（不超过 10 个）看不清了，但是牛牛记得这个数列顺序对的数量是 k，顺序对是指满足 i < j 且 A[i] < A[j] 的对数，请帮助牛牛计算出，符合这个要求的合法排列的数目。
 */
import java.util.*;
public class Main32{
    static int  icount=0;
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int a[]=new int[n];
        int p[]=new int[10];
        int index[]=new int[10];
        int inum=0;
        int num=0;
        boolean flag[]=new boolean[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
            if(a[i]==0){
                index[inum++]=i;
            }else{
                flag[a[i]-1]=true;
            }

        }
        for(int i=0;i<n;i++){
            if(!flag[i]){
                p[num++]=i+1;
            }
        }
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]!=0&&a[j]!=0&&a[i]<a[j]){
                    sum++;
                }
            }
        }
        allPaiLie(0,num,a,p,inum,index,sum,k);
        System.out.println(icount);

    }
    public static void allPaiLie(int begin,int num,int[] a,int[] p,int inum,int index[],int sum,int k){
        if(begin==num){
            if((sum+calvalue(a,p,num,inum,index))==k){
                icount++;
            }
        }else{
            for(int i=begin;i<num;i++){
                swap(p,begin,i);
                allPaiLie(i+1,num,a,p,inum,index,sum,k);
                swap(p,begin,i);
            }
        }
    }
    public static void swap(int array[],int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
    public static int calvalue(int a[],int p[],int num,int inum,int index[]){
        int count=0;
        for(int i=0;i<inum;i++){
            a[index[i]]=p[i];
            for(int k=0;k<index[i];k++){
                if(a[k]!=0&&a[k]<a[index[i]]){
                    count++;
                }
            }
            for(int k=index[i]+1;k<a.length;k++){
                if(a[k]!=0&&a[k]>a[index[i]]){
                    count++;
                }
            }
        }
        for(int i=0;i<inum;i++){
            a[index[i]]=0;
        }
        return count;
    }
}