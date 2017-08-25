/**
 * Created by WZW on 2017/08/10.
 * tengxun3
 */
import java.util.*;
import java.util.ArrayList;
public class Main57{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            ArrayList<Integer> list=new ArrayList<Integer>();
            int table[]=new int[1001];
            for(int i=2;i<1000;i++){
                if(table[i]==-1){
                    continue;
                }
                for(int j=2;j<=1000/i;j++){
                    table[i*j]=-1;
                }


            }
            for(int i=2;i<1000;i++){
                if(table[i]==0){
                    list.add(i);
                }
            }
            int begin=0;
            int last=list.size()-1;
            int count=0;
            while(begin<=last){
                if(list.get(begin)+list.get(last)>n){
                    last--;
                }else if(list.get(begin)+list.get(last)<n){
                    begin++;
                }else{
                    count++;
                    begin++;
                    last--;
                }
            }
            System.out.println(count);

        }
    }
}
