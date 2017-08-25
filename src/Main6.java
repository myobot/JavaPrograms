import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by WZW on 2017/08/01.
 */
public class Main6 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int h[]=new int[N];
        for(int i=0;i<N;i++){
            h[i]=in.nextInt();
        }
        int M=in.nextInt();
        int w[]=new int[M];
        for(int i=0;i<M;i++){
            w[i]=in.nextInt();
        }
        Arrays.sort(h);
        Arrays.sort(w);
        int count=0;
        int index=h.length-1;
        for(int i=w.length-1;i>=0;i--){
            for(int j=index;j>=0;j--){
                if(w[i]>=h[j]){
                    index=j-1;
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
