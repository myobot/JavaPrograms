/**
 * Created by WZW on 2017/08/09.
 *
 题目描述
 小易总是感觉饥饿，所以作为章鱼的小易经常出去寻找贝壳吃。最开始小易在一个初始位置x_0。对于小易所处的当前位置x，他只能通过神秘的力量移动到 4 * x + 3或者8 * x + 7。因为使用神秘力量要耗费太多体力，所以它只能使用神秘力量最多100,000次。贝壳总生长在能被1,000,000,007整除的位置(比如：位置0，位置1,000,000,007，位置2,000,000,014等)。小易需要你帮忙计算最少需要使用多少次神秘力量就能吃到贝壳。
 输入描述:
 输入一个初始位置x_0,范围在1到1,000,000,006
 输出描述:
 输出小易最少需要使用神秘力量的次数，如果使用次数使用完还没找到贝壳，则输出-1
 */
import java.util.*;
public class Main35{
    static int mincount=100001;
    static boolean flag=false;
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        long begin=in.nextLong();
        dfs(0,begin);
        if(mincount==100001)
            System.out.println("-1");
        else
            System.out.println(mincount);
    }
    public static void dfs(int count,long num){
        if(count>100000){
            return;
        }else if(count>mincount){
            return;
        }else if(num%1000000007==0){
            if(mincount>count){
                mincount=count;
            }
            flag=true;
            return;
        }else{
            if(!flag) {
                dfs(count + 1, num * 4 + 3);
                dfs(count + 1, num * 8 + 7);
            }
        }
    }
}