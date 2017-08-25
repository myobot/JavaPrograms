/**
 * Created by WZW on 2017/08/11.
 * 题目描述
 继MIUI8推出手机分身功能之后，MIUI9计划推出一个电话号码分身的功能：首先将电话号码中的每个数字加上8取个位，然后使用对应的大写字母代替 （"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"）， 然后随机打乱这些字母，所生成的字符串即为电话号码对应的分身。
 输入描述:
 第一行是一个整数T（1 ≤ T ≤ 100)表示测试样例数；接下来T行，每行给定一个分身后的电话号码的分身（长度在3到10000之间）。
 输出描述:
 输出T行，分别对应输入中每行字符串对应的分身前的最小电话号码（允许前导0）。
 示例1
 输入

 4
 EIGHT
 ZEROTWOONE
 OHWETENRTEO
 OHEWTIEGTHENRTEO
 输出

 0
 234
 345
 0345
 */
import java.util.*;
public class Main78 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            in.nextLine();
            for (int i = 0; i < n; i++) {
                String str = in.nextLine();
                find(str,true);
            }
        }
    }
    public static void find(String str,boolean flag){
        char[] zero = {'Z', 'E', 'R', 'O'};
        char[] one = {'O', 'N', 'E'};
        char[] two = {'T', 'W', 'O'};
        char[] three = {'T', 'H', 'R', 'E', 'E'};
        char[] four = {'F', 'O', 'U', 'R'};
        char[] five = {'F', 'I', 'V', 'E'};
        char[] six = {'S', 'I', 'X'};
        char[] seven = {'S', 'E', 'V', 'E', 'N'};
        char[] eight = {'E', 'I', 'G', 'H', 'T'};
        char[] nine = {'N', 'I', 'N', 'E'};
        int numcount[] = new int[10];
        int totalcount = 0;
        StringBuilder stb=new StringBuilder(str);
        while(stb.indexOf("Z")>0){
            for(int i=0;i<zero.length;i++){
                int index=stb.indexOf(""+zero[i]);
                stb.delete(index,index);
            }
            numcount[0]++;
            totalcount++;
        }
        while(stb.indexOf("U")>0){
            for(int i=0;i<four.length;i++){
                int index=stb.indexOf(""+four[i]);
                stb.delete(index,index+1);
            }
            numcount[4]++;
            totalcount++;
        }
        while(stb.indexOf("X")>0){
            for(int i=0;i<six.length;i++){
                int index=stb.indexOf(""+six[i]);
                stb.delete(index,index+1);
            }
            numcount[6]++;
            totalcount++;
        }
        while(stb.indexOf("G")>0){
            for(int i=0;i<eight.length;i++){
                int index=stb.indexOf(""+eight[i]);
                stb.delete(index,index+1);
            }
            numcount[8]++;
            totalcount++;
        }
        while(stb.indexOf("R")>0){
            for(int i=0;i<three.length;i++){
                int index=stb.indexOf(""+three[i]);
                stb.delete(index,index+1);
            }
            numcount[3]++;
            totalcount++;
        }
        while(stb.indexOf("F")>0){
            for(int i=0;i<five.length;i++){
                int index=stb.indexOf(""+five[i]);
                stb.delete(index,index+1);
            }
            numcount[5]++;
            totalcount++;
        }
        while(stb.indexOf("S")>0){
            for(int i=0;i<seven.length;i++){
                int index=stb.indexOf(""+seven[i]);
                stb.delete(index,index+1);
            }
            numcount[7]++;
            totalcount++;
        }
        while(stb.indexOf("T")>0){
            for(int i=0;i<two.length;i++){
                int index=stb.indexOf(""+two[i]);
                stb.delete(index,index+1);
            }
            numcount[2]++;
            totalcount++;
        }
        while(stb.indexOf("I")>0){
            for(int i=0;i<nine.length;i++){
                int index=stb.indexOf(""+nine[i]);
                stb.delete(index,index+1);
            }
            numcount[9]++;
            totalcount++;
        }
        while(stb.indexOf("O")>0){
            for(int i=0;i<one.length;i++){
                int index=stb.indexOf(""+one[i]);
                stb.delete(index,index+1);
            }
            numcount[1]++;
            totalcount++;
        }
        for(int i=8;i<=9;i++){
            for(int j=0;j<numcount[i];j++){
                System.out.print((i-8));
            }
        }
        for(int i=0;i<=7;i++){
            for(int j=0;j<numcount[i];j++){
                System.out.print((i-8+10));
            }
        }
        System.out.println();
    }

    public static void find(String str) {
        char[] c = str.toCharArray();
        int numcount[] = new int[10];
        char[] zero = {'Z', 'E', 'R', 'O'};
        char[] one = {'O', 'N', 'E'};
        char[] two = {'T', 'W', 'O'};
        char[] three = {'T', 'H', 'R', 'E', 'E'};
        char[] four = {'F', 'O', 'U', 'R'};
        char[] five = {'F', 'I', 'V', 'E'};
        char[] six = {'S', 'I', 'X'};
        char[] seven = {'S', 'E', 'V', 'E', 'N'};
        char[] eight = {'E', 'I', 'G', 'H', 'T'};
        char[] nine = {'N', 'I', 'N', 'E'};
        int totalcount = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'Z') {
                for (int p = 0; p < zero.length; p++) {
                    for (int j = 0; j < c.length; j++) {
                        if (c[j] == ' ') {
                            continue;
                        }
                        if (c[j] == zero[p]) {
                            c[j] = ' ';
                            break;
                        }
                    }
                }
                numcount[0]++;
                totalcount++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'U') {
                for (int p = 0; p < four.length; p++) {
                    for (int j = 0; j < c.length; j++) {
                        if (c[j] == ' ') {
                            continue;
                        }
                        if (c[j] == four[p]) {
                            c[j] = ' ';
                            break;
                        }
                    }
                }
                numcount[4]++;
                totalcount++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'X') {
                for (int p = 0; p < six.length; p++) {
                    for (int j = 0; j < c.length; j++) {
                        if (c[j] == ' ') {
                            continue;
                        }
                        if (c[j] == six[p]) {
                            c[j] = ' ';
                            break;
                        }
                    }
                }
                numcount[6]++;
                totalcount++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'G') {
                for (int p = 0; p < eight.length; p++) {
                    for (int j = 0; j < c.length; j++) {
                        if (c[j] == ' ') {
                            continue;
                        }
                        if (c[j] == eight[p]) {
                            c[j] = ' ';
                            break;
                        }
                    }
                }
                numcount[8]++;
                totalcount++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'R') {
                for (int p = 0; p < three.length; p++) {
                    for (int j = 0; j < c.length; j++) {
                        if (c[j] == ' ') {
                            continue;
                        }
                        if (c[j] == three[p]) {
                            c[j] = ' ';
                            break;
                        }
                    }
                }
                numcount[3]++;
                totalcount++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'F') {
                for (int p = 0; p < five.length; p++) {
                    for (int j = 0; j < c.length; j++) {
                        if (c[j] == ' ') {
                            continue;
                        }
                        if (c[j] == five[p]) {
                            c[j] = ' ';
                            break;
                        }
                    }
                }
                numcount[5]++;
                totalcount++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'S') {
                for (int p = 0; p < seven.length; p++) {
                    for (int j = 0; j < c.length; j++) {
                        if (c[j] == ' ') {
                            continue;
                        }
                        if (c[j] == seven[p]) {
                            c[j] = ' ';
                            break;
                        }
                    }
                }
                numcount[7]++;
                totalcount++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'T') {
                for (int p = 0; p < two.length; p++) {
                    for (int j = 0; j < c.length; j++) {
                        if (c[j] == ' ') {
                            continue;
                        }
                        if (c[j] == two[p]) {
                            c[j] = ' ';
                            break;
                        }
                    }
                }
                numcount[2]++;
                totalcount++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'I') {
                for (int p = 0; p < nine.length; p++) {
                    for (int j = 0; j < c.length; j++) {
                        if (c[j] == ' ') {
                            continue;
                        }
                        if (c[j] == nine[p]) {
                            c[j] = ' ';
                            break;
                        }
                    }
                }
                numcount[9]++;
                totalcount++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'O') {
                for (int p = 0; p < one.length; p++) {
                    for (int j = 0; j < c.length; j++) {
                        if (c[j] == ' ') {
                            continue;
                        }
                        if (c[j] == one[p]) {
                            c[j] = ' ';
                            break;
                        }
                    }
                }
                numcount[1]++;
                totalcount++;
            }
        }
        int ans[] = new int[totalcount];
        int num = 0;
        for (int i = 0; i < numcount.length; i++) {
            for (int j = 0; j < numcount[i]; j++) {
                int temp = i - 8;
                if (temp < 0) {
                    temp += 10;
                }
                ans[num++] = temp;
            }
        }
        Arrays.sort(ans);
        for (int i = 0; i < totalcount; i++) {
            System.out.print(ans[i]);
        }
        System.out.println();
    }
}