/**
 * Created by WZW on 2017/08/09.
 */
import java.util.*;
public class Main40{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Deque<Integer> deque=new LinkedList<>();
        
        for(int i=0;i<n;i++){
            int a=in.nextInt();
            LinkedList<Integer> list=find(a);
            for(int j=0;j<list.size();j++){
                if(j==list.size()-1){
                    System.out.println(list.get(j));
                }else {
                    System.out.print(list.get(j)+" ");
                }
            }
        }
    }
    public static LinkedList<Integer> find(int n){
        LinkedList<Integer> list=new LinkedList<Integer>();
        for(int i=n;i>=1;i--){
            list.addFirst(i);
            list.addFirst(list.removeLast());
        }
        return list;

    }
}