import org.junit.*;
import org.junit.Test;

import java.util.Scanner;

/**
 * Created by WZW on 2017/08/01.
 */
public class Qishuip {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        for(int i=0;i<10;i++){
            int c=in.nextInt();
            if(c==0){
                break;
            }
            System.out.println(fun(c));
        }
    }
    public static int fun(int p){
        int leftp=p;
        int sum=0;
        while(leftp>1){
            int c=leftp/3;
            sum+=c;
            leftp=leftp%3+c;
            if(leftp==2){
                sum++;
                leftp=1;
            }
        }
        return sum;
    }
}
