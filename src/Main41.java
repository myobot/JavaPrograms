/**
 * Created by WZW on 2017/08/09.
 * 如果一个数字序列逆置之后跟原序列是一样的就称这样的数字序列为回文序列。例如：
 {1, 2, 1}, {15, 78, 78, 15} , {112} 是回文序列,
 {1, 2, 2}, {15, 78, 87, 51} ,{112, 2, 11} 不是回文序列。
 现在给出一个数字序列，允许使用一种转换操作：
 选择任意两个相邻的数，然后从序列移除这两个数，并用这两个数字的和插入到这两个数之前的位置(只插入一个和)。
 现在对于所给序列要求出最少需要多少次操作可以将其变成回文序列。
 输入描述:
 输入为两行，第一行为序列长度n ( 1 ≤ n ≤ 50)
 第二行为序列中的n个整数item[i]  (1 ≤ iteam[i] ≤ 1000)，以空格分隔。
 输出描述:
 输出一个数，表示最少需要的转换次数
 */
import java.util.*;
public class Main41{
    public static void main(String args[]){
        LinkedList<Integer> deque=new LinkedList<Integer>();
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            deque.add(in.nextInt());
        }
        int count=0;
        while(deque.size()>1){
            int a=deque.getFirst();
            int b=deque.getLast();
            if(a==b){
                deque.removeFirst();
                deque.removeLast();
            }else{
                if(a<b){
                    deque.removeFirst();
                    int c=deque.removeFirst();
                    deque.addFirst(a+c);
                }else{
                    deque.removeLast();
                    int c=deque.removeLast();
                    deque.addLast(b+c);
                }
                count++;
            }
            if(charge(deque)){
                break;
            }
        }
        System.out.println(count);
    }
    public static boolean charge(LinkedList<Integer> deque){
        for(int i=0;i<deque.size()/2;i++){
            if(deque.get(i)!=deque.get(deque.size()-i-1)){
                return false;
            }
        }
        return true;
    }
}
