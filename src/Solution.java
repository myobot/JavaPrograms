/**
 * Created by WZW on 2017/08/02.
 */
public class Solution {
    int a[][]={{0},
            {0,1,2,3,4,5,6,7,8,9},
            {0,2,3,5,6,8,9},
            {3,6,9},
            {0,4,5,6,7,8,9},
            {0,5,6,8,9},
            {6,9},
            {0,7,8,9},
            {0,8,9},
            {9}};
    public static void main(String args[]){
        System.out.println(countBitDiff(1999,2299));
        int a[]={31,41};
        System.out.println(calculateMax(a));
        System.out.println('1'-48);
    }
    /**
     * 获得两个整形二进制表达位数不同的数量
     *
     * @param m 整数m
     * @param n 整数n
     * @return 整型
     */

    public static int countBitDiff(int m, int n) {
        int tempm=m;
        int tempn=n;
        int count=0;
        while(tempm>0&&tempn>0){
            if((tempm&1)!=(tempn&1)){
                count++;
            }
            tempm=tempm>>1;
            tempn=tempn>>1;
        }
        if(tempm>0){
            while(tempm>0){
                if((tempm&1)==1){
                    count++;
                }
                tempm=tempm>>1;
            }
        }
        if(tempn>0){
            while(tempn>0){
                if((tempn&1)==1){
                    count++;
                }
                tempn=tempn>>1;
            }
        }
        return count;
    }
    public static int calculateMax(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length;i++){
            int sum=0;
            for(int j=i+1;j<prices.length;j++){
                sum=prices[j]-prices[i];
                for(int p=j;p<prices.length;p++){
                    int sum2=0;
                    for(int k=p+1;k<prices.length;k++){
                        sum2=prices[k]-prices[p];
                        if(sum2<0){
                            if(sum>max){
                                max=sum;
                            }
                        }else{
                            if(sum+sum2>max){
                                max=sum+sum2;
                            }
                        }
                    }
                }
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
}