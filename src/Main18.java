import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created by WZW on 2017/08/07.
 */
public class Main18 {
    public static void main(String args[]){
        System.out.println(GetUglyNumber_Solution(8));
    }
    public static int GetUglyNumber_Solution(int index) {
        int num=1;
        if(index<=1){
            return 1;
        }
        TreeSet<Integer> treeSet=new TreeSet<>();
        TreeSet<Integer> treeSet1=new TreeSet<>();
        treeSet.add(1);
        treeSet1.add(1);
        while(treeSet1.size()<index){
            int temp=treeSet.pollFirst();
            for(int i=0;i<3;i++){
                switch (i) {
                    case 0:
                        treeSet.add(temp * 2);
                        treeSet1.add(temp * 2);
                        break;
                    case 1:
                        treeSet.add(temp * 3);
                        treeSet1.add(temp * 3);
                        Iterator iterator=treeSet.iterator();
                        while(iterator.hasNext()){
                            int temp2=(int)iterator.next();
                            if(temp2*2<temp*3){
                                treeSet1.add(temp2*2);
                            }
                        }
                        break;
                    case 2:
                        treeSet.add(temp * 5);
                        treeSet1.add(temp * 5);
                        Iterator iterator1=treeSet.iterator();
                        while(iterator1.hasNext()){
                            int temp3=(int)iterator1.next();
                            if(temp3*2<temp*5){
                                treeSet1.add(temp3*2);
                            }
                            if(temp3*3<temp*5){
                                treeSet1.add(temp3*3);
                            }
                        }
                        break;
                }
                if(treeSet1.size()>=index){
                    break;
                }
            }
        }
        Iterator iterator=treeSet1.iterator();
        int count=0;
        while(iterator.hasNext()){
            int c=(int)iterator.next();
            count++;
            if(count==index){
                return c;
            }
        }
        return 1;
    }
}