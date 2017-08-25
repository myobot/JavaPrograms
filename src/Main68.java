/**
 * Created by WZW on 2017/08/11.
 * Please create a function to extract the filename extension from the given path,return the extracted filename extension or null if none.
 输入描述:
 输入数据为一个文件路径
 输出描述:
 对于每个测试实例，要求输出对应的filename extension
 示例1
 输入

 Abc/file.txt
 输出

 txt
 */
import java.util.*;
public class Main68{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char c[]=str.toCharArray();
        int i;
        for(i=c.length-1;i>=0;i--){
            if(c[i]=='.'){
                break;
            }
        }
        if(i==-1){
            System.out.println("null");
        }else{
            for(int j=i+1;j<c.length;j++){
                System.out.print(c[j]);
            }
        }
    }
}