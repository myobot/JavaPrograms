/**
 * Created by WZW on 2017/08/11.
 */
import java.util.*;
public class Main61{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String str=in.nextLine();
            String f=in.nextLine();
            String s=in.nextLine();
            char[] c=str.toCharArray();
            for(int i=0;i<c.length/2;i++){
                char temp=c[i];
                c[i]=c[c.length-i-1];
                c[c.length-1-i]=temp;
            }
            char[] c1=str.toCharArray();
            char[] s1=s.toCharArray();
            char[] f1=f.toCharArray();
            boolean flag=true;
            boolean flag2=true;
            int index1=firstIndex(0,c1,f1);
            int index2=firstIndex(index1,c1,s1);
            int index3=firstIndex(0,c,f1);
            int index4=firstIndex(index3,c,s1);
            if(index1<c.length+1&&index2<c.length+1&&index3<c.length+1&&index4<c.length+1){
                System.out.println("both");
            }else if((index3>=c.length+1||index4>=c.length+1)&&index1<c.length+1&&index2<c.length+1){
                System.out.println("forward");
            }else if((index1>=c.length+1||index2>=c.length+1)&&index3<c.length+1&&index4<c.length+1){
                System.out.println("backward");
            }else{
                System.out.println("invalid");
            }

        }
    }
    public static int firstIndex(int i,char c[],char a[]){
        int j=0;
        for(;i<c.length;i++){
            if(c[i]!=a[j]){
                if(j!=0){
                    j=0;
                }
                continue;
            }else{
                j++;
                if(j>=a.length){
                    i++;
                    break;
                }
            }
        }
        if(j>=a.length){
            return i;
        }else{
            return c.length+1;
        }
    }
}