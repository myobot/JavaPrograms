/**
 * Created by WZW on 2017/08/11.
 * 题目描述
 设有n个正整数，将他们连接成一排，组成一个最大的多位整数。
 如:n=3时，3个整数13,312,343,连成的最大整数为34331213。
 如:n=4时,4个整数7,13,4,246连接成的最大整数为7424613。
 输入描述:
 有多组测试样例，每组测试样例包含两行，第一行为一个整数N（N<=100），第二行包含N个数(每个数不超过1000，空格分开)。
 输出描述:
 每组数据输出一个表示最大的整数。
 示例1
 输入

 2
 12 123
 4
 7 13 4 246
 输出

 12312
 7424613
 */
import java.util.*;
public class Main81{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            in.nextLine();
            String str=in.nextLine();
            String s[]=str.split(" ");
            LinkedList<String> set=new LinkedList<String>();
            for(int i=0;i<s.length;i++){
                set.add(s[i]);
            }
            Collections.sort(set,new Cmp());
            set.sort(new Cmp());
            Iterator<String> it=set.iterator();
            while(it.hasNext()){
                System.out.print(it.next());
            }
        }
    }
}
class Cmp implements Comparator<String> {
    public int compare(String o1, String o2) {
        return -(o1 + o2).compareTo(o2 + o1);
    }
}