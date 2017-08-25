/**
 * Created by WZW on 2017/08/10.
 */
import java.util.*;
public class Main60{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int a[]=new int[n+1];
        for(int i=1;i<=n;i++){
            a[i]=i;
        }
        find(new LinkedList<Integer>(),m,a,1);
    }
    public static void find(LinkedList<Integer> stack,int m,int a[],int now){
        if(m==0){
            for(int i=stack.size()-1;i>=0;i--){
                if(i==0){
                    System.out.println(stack.get(i));
                }else{
                    System.out.print(stack.get(i)+" ");
                }
            }
        }else{
            for(int i=now;i<a.length;i++){
                stack.push(a[i]);
                find(stack,m-a[i],a,i+1);
                stack.pop();
            }
        }
    }
}