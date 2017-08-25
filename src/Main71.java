/**
 * Created by WZW on 2017/08/11.
 */
import java.util.*;
public class Main71{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String str=in.nextLine();
            char c[]=str.toCharArray();
            char c1[];
            if(c.length<=6){
                System.out.print(str);
            }else if(c.length<=14){
                c1=insert(c,' ',6);
                for(int i=0;i<c1.length;i++){
                    System.out.print(c1[i]);
                }
            }else{
                c1=insert(c,' ',6);
                c1=insert(c1,' ',15);
                for(int i=0;i<c1.length;i++){
                    System.out.print(c1[i]);
                }
            }
            System.out.println();
        }
    }
    public static char[] insert(char c[] ,char a,int index){
        char t[]=new char[c.length+1];
        int i;
        for(i=0;i<index;i++){
            t[i]=c[i];
        }
        t[i]=a;
        for(i=index+1;i<t.length;i++){
            t[i]=c[i-1];
        }
        return t;
    }
}