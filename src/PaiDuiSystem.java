import java.util.LinkedList;
/**
 * Created by WZW on 2017/08/08.
 * 请设计一个排序系统，能让每个排队的用户，
 * 都能看到自己在队列中所处的位置和变化，
 * 队列有人随时有可能加入和退出，
 * 当有人退出影响到自己的位置的时需要及时反馈到用户
 */
public class PaiDuiSystem {
    public static void main(String args[]){
        QueueSystem queueSystem=new QueueSystem();
        People people=new People(queueSystem);
        People people1=new People(queueSystem);
        People people2=new People(queueSystem);
        people1.InQueue();
        people2.InQueue();
        people.InQueue();
        people1.PrintNow();
        people1.outQueue();
    }

}
class QueueSystem{
    LinkedList<People> list=new LinkedList<>();
    public synchronized int InQueue(People people){
        this.list.addLast(people);
        return list.size();
    }
    public void OutQueue(People people){
        int index=list.indexOf(people);
        if(index<0) {
            System.out.println("您不在队中");
        }else{
            synchronized (this) {
                list.remove(index);
                for(int i=index;i<list.size();i++){
                    list.get(i).PrintChange(i+1);
                }
            }
        }
    }
    public int getNow(People people){
        return list.indexOf(people);
    }
}
class People{
    QueueSystem queueSystem;
    public People(QueueSystem queueSystem){
        this.queueSystem=queueSystem;
    }
    public void InQueue(){
        int index=queueSystem.InQueue(this);
        System.out.println("我入队了，当前位置："+index);
    }
    public void outQueue(){
        queueSystem.OutQueue(this);
    }
    public void PrintNow(){
        int index=queueSystem.getNow(this);
        if(index<0){
            System.out.println("您当前不在队中");
        }else{
            System.out.println("我的当前位置:"+(index+1));
        }
    }
    public void PrintChange(int index){
        System.out.println("有人出队，我的当前位置为："+index);
    }
}
 interface a{

}
