/**
 * Created by WZW on 2017/08/07.
 */
import java.util.ArrayList;
import java.util.TreeSet;

public class Main14 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result=new ArrayList<String>();
        if(str==null||str.length()==0){
            return result;
        }
        TreeSet<String> treeset=new TreeSet<String>();
        char[]c=str.toCharArray();
        result.addAll(treeset);
        return result;

    }
    public void find(int begin,char[] c,TreeSet<String> tree){
        if(begin==c.length-1){
            tree.add(new String(c));

        }else{
            for(int i=begin;i<c.length;i++){
                swap(c,begin,i);
                find(i,c,tree);
                swap(c,begin,i);
            }
        }
    }
    public void swap(char[] c,int a,int b){
        char temp=c[a];
        c[a]=c[b];
        c[b]=temp;
    }
}