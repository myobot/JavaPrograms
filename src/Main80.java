/**
 * Created by WZW on 2017/08/11.
 */
import sun.reflect.generics.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.*;
import java.util.ArrayList;
public class Main80{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<treeNode> linkedList=new LinkedList<>();
        int d[] = new int[n];
        int father[]=new int[n];
        d[0] = 1;
        int max = 0;
        for (int i = 0; i < n; i++) {
            father[i] = i;
        }
        for (int i = 0; i < n - 1; i++) {
            int f = in.nextInt();
            int s = in.nextInt();
            linkedList.add(new treeNode(f,s));
            father[s]=f;
        }
//        Collections.sort(linkedList);
//        Iterator<treeNode> iterator=linkedList.iterator();
//        while(iterator.hasNext()){
//            treeNode t=iterator.next();
//            d[t.son] = d[t.father] + 1;
//            max = Math.max(d[t.son], max);
//        }
//        System.out.println(max);
        int max2=0;
        for(int i=0;i<n;i++){
            int temp=i;
            int high = 0;
            while (temp != father[temp]){
                high++;
                temp = father[temp];
            }
            max2=Math.max(high,max2);
        }
        System.out.println(max2+1);
//        ArrayList<Integer> yezi=new ArrayList<Integer>();
//        boolean flag;
//        for(int i=0;i<n-1;i++){
//            flag=true;
//            for(int j=0;j<n-1;j++){
//                if(a[j][0]==i){
//                    flag=false;
//                    break;
//                }
//            }
//            if(flag){
//                yezi.add(i);
//            }
//        }
//        int maxcount=Integer.MIN_VALUE;
//        int count=0;
//        for(int i=0;i<yezi.size();i++){
//            count++;
//            int temp=a[yezi.get(i)][0];
//            while(temp!=0){
//                count++;
//                temp=a[temp][0];
//            }
//            count++;
//            maxcount=Math.max(maxcount,count);
//            count=0;
//        }
//        System.out.println(maxcount);
//    }
    }
}
class treeNode implements Comparable<treeNode>{
    public int father;
    public int son;
    public treeNode(int father,int son){
        this.father=father;
        this.son=son;
    }

    @Override
    public int compareTo(treeNode o) {
        if(father>o.father){return 1;}
        else if(father<o.father){return -1;}
        return 0;
    }

    @Override
    public int hashCode() {
        int result = father;
        result = 31 * result + son;
        return result;
    }

    public boolean equals(Object o){
        return ((treeNode)o).father==this.father&&((treeNode)o).son==this.son;
    }
}