/**
 * Created by WZW on 2017/08/10.
 */
import java.util.*;
public class Main52{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        System.out.println(getNum(m,n));
    }
    public static char toChar(int n){
        switch (n){
            case 0:return '0';
            case 1:return '1';
            case 2:return '2';
            case 3:return '3';
            case 4:return '4';
            case 5:return '5';
            case 6:return '6';
            case 7:return '7';
            case 8:return '8';
            case 9:return '9';
            case 10:return 'A';
            case 11:return 'B';
            case 12:return 'C';
            case 13:return 'D';
            case 14:return 'E';
            case 15:return 'F';
        }
        return '0';
    }
    public static String getNum(int m,int n){
        StringBuilder stb=new StringBuilder();
        int temp=m;
        while(temp>0){
            char c=toChar(temp%n);
            stb.insert(0,c);
            temp/=n;
        }
        return stb.toString();
    }
}