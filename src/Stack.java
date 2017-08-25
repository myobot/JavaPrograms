import java.util.LinkedList;

/**
 * Created by WZW on 2017/08/01.
 */
public class Stack{
    int data[];
    int top;
    int size;

    public Stack() {
        this(16);
    }
    public Stack(int size){
        this.data=new int[size];
        this.size=size;
    }
    public void push(int element){
        this.data[this.top++]=element;
        if(this.top==this.data.length){
            int newdata[]=new int[this.size*2];
            this.size*=2;
            for(int i=0;i<this.top;i++){
                newdata[i]=this.data[i];
            }
            this.data=newdata;
        }
    }
    public int pop(){
        int element=this.data[--top];
        if(this.top<=this.size/4){
            int newdata[]=new int[this.size/2];
            this.size/=2;
            for(int i=0;i<this.top;i++){
                newdata[i]=this.data[i];
            }
            this.data=newdata;
        }
        return element;
    }
    public int peek(){
        return this.data[top-1];
    }
}