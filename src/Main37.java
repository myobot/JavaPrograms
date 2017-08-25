/**
 * Created by WZW on 2017/08/09.
 */
import java.util.*;
public class Main37{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char c[]=str.toCharArray();
        if(charge1(c)&&charge2(c)&&charge3(c)){
            System.out.println("Likes");
        }else{
            System.out.println("Dislikes");
        }
    }
    public static boolean charge1(char c[]){
        for(int i=0;i<c.length;i++){
            if((c[i]<='A')||(c[i]>='Z')){
                return false;
            }
        }
        return true;
    }
    public static boolean charge2(char c[]){
        for(int i=0;i<c.length-1;i++){
            if(c[i]==c[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean charge3(char c[]){
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                for(int k=j+1;k<c.length;k++){
                    for(int p=k+1;p<c.length;p++){
                        if(c[i]==c[k]&&c[j]==c[p]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

}
