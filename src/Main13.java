import java.io.ObjectInputStream;
import java.util.*;

/**
 * Created by WZW on 2017/08/02.
 */

public class Main13 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        while(in.hasNext()){
            String s=in.nextLine();
            String s1[]=s.split(" ");
            String s2[]=s1[0].split("\\\\");
            if(s2[s2.length-1].length()>16){
                s2[s2.length-1].substring(s2.length-16,s2.length);
            }
            String file=(s2[s2.length-1]+" "+s1[1]+" ");
            if(map.containsKey(file)){
                map.put(file,map.get(file)+1);
            }else{
                map.put(file,1);
            }
        }
        Set<String> keys=map.keySet();
        TreeSet<String> treeSet=new TreeSet(keys);
        Iterator<String> iterator=treeSet.iterator();
        while(iterator.hasNext()){
            String f=iterator.next();
            System.out.println(f+map.get(f).toString());
        }
    }
}

