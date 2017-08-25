/**
 * Created by WZW on 2017/08/07.
 */
public class Main15 {
    public static void main(String args[]){
        int a[]={1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(a));
    }
    public static int MoreThanHalfNum_Solution(int [] array) {
        int a[][]=new int[array.length][2];
        int num=0;
        int max[]=new int[2];
        boolean flag;
        for(int i=0;i<array.length;i++){
            flag=true;
            for(int j=0;j<num;j++){
                if(a[j][0]==array[i]){
                    flag=false;
                    a[j][1]++;
                    if(a[j][1]>max[1]){
                        max[1]=a[j][1];
                        max[0]=a[j][0];
                    }
                }
            }
            if(flag){
                a[num++][0]=array[i];
                a[num-1][1]=1;
                if(a[num-1][1]>max[1]){
                    max[1]=a[num-1][1];
                    max[0]=a[num-1][0];
                }
            }
            if(max[1]+array.length-i-1<=array.length/2){
                return 0;
            }
            if(max[1]>array.length/2){
                return max[0];
            }
        }
        return 0;
    }
}