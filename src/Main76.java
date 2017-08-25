import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created by WZW on 2017/08/11.
 * 题目描述
 数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。
 输入描述:
 输入数据有多组，每组占一行，由两个整数n（n < 10000）和m(m < 1000)组成，n和m的含义如前所述。
 输出描述:
 对于每组输入数据，输出该数列的和，每个测试实例占一行，要求精度保留2位小数。
 示例1
 输入

 81 4
 2 2
 输出

 94.73
 3.41
 */
public class Main76 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n =in.nextInt();
            int m =in.nextInt();
            double sum=0;
            double temp=n;
            for(int i=0;i<m;i++){
                sum+=temp;
                temp=Math.sqrt(temp);
            }
            System.out.printf("%.2f",sum);
        }
    }
}
