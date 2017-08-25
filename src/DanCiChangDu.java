import org.junit.Test;

import java.util.Scanner;

/**
 * Created by WZW on 2017/07/25.
 */
public class DanCiChangDu {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int last=str.lastIndexOf(" ");
        String news=str.substring(last,str.length()-1);
        System.out.println(news.length());
    }
    @Test
    public void App(){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String s=in.nextLine();
        char []c=s.toCharArray();
        StringBuffer stringBuilder=new StringBuffer(str);

        int count=0;
        for(int i=0;i<stringBuilder.length();i++){
            if(stringBuilder.charAt(i)==c[0]){
                count++;
            }
        }
        System.out.println(count);

    }
}
