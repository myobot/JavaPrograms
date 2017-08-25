/**
 * Created by WZW on 2017/08/11.
 * 题目描述
 酒店房间的价格录入是通过时间段来录入的，比如10月1日至10月7日800元，10月8日至10月20日500元，请实现以下函数int[][] merge(int[][] dateRangePrices)，输入是某个酒店多个日期段的价格，每个日期段（终止日期大于等于起始日期）和对应的价格使用长度为3的数组来表示，比如[0, 19, 300], [10, 40, 250]分别表示从某天开始第1天到第20天价格都是300，第11天到第41天价格都是250，这些日期端有可能重复，重复的日期的价格以后面的为准， 请以以下规则合并并输出合并结果：
 1.相邻两天的价格如果相同，那么这两个日期段应该合并
 2.合并的结果应该以起始日期从小到大排序
 输入描述:
 输入数据包括多行，如样例输入所示。
 输出描述:
 输出数据为一行，如样例输出所示
 示例1
 输入

 1 1 100
 2 3 100
 4 5 110
 输出

 [1, 3, 100],[4, 5, 110]
 如果有序！！！
 */
import java.util.*;
public class Main69{
    public static void main(String args[]){
        LinkedList<Time> list=new LinkedList<Time>();
        Scanner in=new Scanner(System.in);
        Time now=null;
        while(in.hasNext()){
            String str=in.nextLine();

            String s[]=str.split(" ");
            if(now==null){
                now=new Time(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]));
            }else{
                int begin=Integer.parseInt(s[0]);
                int end=Integer.parseInt(s[1]);
                int money=Integer.parseInt(s[2]);
                if(money==now.money){
                    now.end=end;
                }else if(now.end>begin){
                    now.end=begin-1;
                    list.add(now);
                    now =new Time(begin,end,money);
                }else{
                    list.add(now);
                    now =new Time(begin,end,money);
                }
            }
        }
        if(now!=null)
            list.add(now);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

}
class Time{
    public int begin;
    public int end;
    public int money;
    public Time(int begin,int end,int money){
        this.begin=begin;
        this.end=end;
        this.money=money;
    }
    public String toString(){
        return begin+" "+end+" "+money;
    }
}