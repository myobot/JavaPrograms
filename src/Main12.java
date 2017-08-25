import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by WZW on 2017/08/02.
 */
public class Main12 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
        int gread[]=new int[N];
        for(int i=0;i<N;i++){
            gread[i]=in.nextInt();
        }
        in.nextLine();
        for(int i=0;i<M;i++){
            String str=in.nextLine();
            String s[]=str.split(" ");
            if(s[0].charAt(0)=='Q'){
                question(gread,Integer.parseInt(s[1])-1,Integer.parseInt(s[2])-1);
            }else{
                gread[Integer.parseInt(s[1])-1]=Integer.parseInt(s[2]);
            }

        }
    }
    public static void question(int gread[],int begin,int end){
        int max=0;
        if(begin>end){
            int temp=begin;
            begin=end;
            end=temp;
        }

        for(int i=begin;i<=end;i++){
            if(gread[i]>max){
                max=gread[i];
            }
        }
        System.out.println(max);
    }
}
