/**
 * Created by WZW on 2017/08/11.
 */
import java.util.*;
public class Main79{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String str=in.nextLine();
            String s[]=str.split(" ");
            for(int i=s.length-1;i>=0;i++){
                if(i==0){
                    System.out.println(s[i]);
                }else{
                    System.out.print(s[i]+" ");
                }
            }
        }
    }
}