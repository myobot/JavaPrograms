/**
 * Created by WZW on 2017/08/11.
 */
import java.util.*;
public class Main77{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            int m=in.nextInt();
            LinkedList<Integer> list=find(n,m);
            if(list.size()==0){
                System.out.println("no");
            }else{
                for(int i=0;i<list.size();i++){
                    if(i==list.size()-1){
                        System.out.println(list.get(i));
                    }else{
                        System.out.print(list.get(i)+" ");
                    }
                }
            }
        }
    }
    public static LinkedList<Integer> find(int n,int m){
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=n;i<=m;i++){
            int temp=i;
            int a1=temp%10;
            temp/=10;
            int a2=temp%10;
            temp/=10;
            int a3=temp%10;
            if(a1*a1*a1+a2*a2*a2+a3*a3*a3==i){
                list.add(i);
            }
        }
        return list;
    }
}