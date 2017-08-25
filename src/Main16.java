/**
 * Created by WZW on 2017/08/07.
 */
public class Main16 {
    public static void main(String args[]){
        Solution1 solution1=new Solution1();
        int a[]={1, 2, -2, 3, -3, 1, -3, 2, 2, -2, 3, -2, 3, -2};
        System.out.println(solution1.FindGreatestSumOfSubArray(a));
        String s="a.ab.a.e.a.er.s.a.s";

    }

}

class Solution1 {
    int max=Integer.MIN_VALUE;
    public int FindGreatestSumOfSubArray(int[] array) {
        find(array,0,0);
        return max;
    }
    public void find(int [] array,int begin,int sum){
        if(begin>=array.length){
            if(sum>max){
                max=sum;
            }
        }else {
            if(sum+array[begin]>max){
                max=sum+array[begin];
            }
            find(array, begin + 1, sum + array[begin]);
        }

    }
}