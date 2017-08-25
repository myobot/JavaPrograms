/**
 * Created by WZW on 2017/08/07.
 */
import java.util.ArrayList;
public class Mian16 {
    public static void main(String args[]){
        int a[]={4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(a,4));
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int Mins[]=new int[k];
        for(int i=0;i<k;i++){
            Mins[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<input.length;i++){
            for(int j=0;j<k;j++){
                if(input[i]<Mins[j]){
                    for(int p=k-1;p>j;p--){
                        Mins[p]=Mins[p-1];
                    }
                    Mins[j]=input[i];
                    break;
                }
            }
        }
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<k;i++){
            result.add(Mins[i]);
        }
        return result;
    }
}
