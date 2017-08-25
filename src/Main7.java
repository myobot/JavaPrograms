import java.awt.*;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by WZW on 2017/08/01.
 */
public class Main7 {

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int M=in.nextInt();
        int N=in.nextInt();
        char[][] map=new char[M][N];
        Node begin=new Node();
        in.nextLine();
        for(int i=0;i<M;i++){
            String str=in.nextLine();
            map[i]=str.toCharArray();
            for(int j=0;j<map[i].length;j++){
                if(map[i][j]=='2'){
                    begin.x=i;
                    begin.y=j;
                }
            }
        }
        System.out.println(findWay(map,begin,M,N));
    }
    public static int findWay(char[][] map,Node begin,int M,int N){
        Queue<Node> queue=new LinkedList<>();
        queue.offer(begin);
        LinkedList<Node> chargeList=new LinkedList<>();
        chargeList.add(begin);
        int step[][]={{1,0},{0,1},{-1,0},{0,-1}};
        int mincount=Integer.MAX_VALUE;
        while(!queue.isEmpty()){
            Node n=queue.remove();
            for(int i=0;i<4;i++){
                if(n.x+step[i][0]<M&&n.y+step[i][1]<N&&n.x+step[i][0]>=0&&n.y+step[i][1]>=0){
                    if(map[n.x+step[i][0]][n.y+step[i][1]]!='0'){
                        if(map[n.x+step[i][0]][n.y+step[i][1]]>=65&&map[n.x+step[i][0]][n.y+step[i][1]]<=90){
                            if(n.hasKey(map[n.x+step[i][0]][n.y+step[i][1]])){
                                Node newstep=new Node(n.x+step[i][0],n.y+step[i][1],n.keys);
                                newstep.fathers.addAll(n.fathers);
                                newstep.fathers.add(n);
                                if(!charge(chargeList,newstep)){
                                    queue.offer(newstep);
                                    chargeList.add(n);
                                }
                            }
                        }else {
                            if(map[n.x+step[i][0]][n.y+step[i][1]]=='3'){
                                int count=n.fathers.size();
                                if(mincount>count){
                                    mincount=count;
                                }
                            }else {
                                Node newstep = new Node(n.x + step[i][0], n.y + step[i][1], n.keys);
                                if (map[newstep.x][newstep.y] <= 97 && map[newstep.x][newstep.y] >= 122) {
                                    newstep.keys.add(map[newstep.x][newstep.y]);
                                }
                                newstep.fathers.addAll(n.fathers);
                                newstep.fathers.add(n);
                                if(!charge(chargeList,newstep)){
                                    queue.offer(newstep);
                                    chargeList.add(n);
                                }
                            }
                        }
                    }
                }
            }
        }
        return mincount;
    }
    public static boolean charge(LinkedList<Node> chargelist,Node n){
        for(int i=0;i<chargelist.size();i++){
            if(chargelist.get(i).equals(n)){
                return true;
            }
        }
        return false;
    }
}
class Node{
    public int x;
    public int y;
    public LinkedList<Character> keys=new LinkedList<>();
    public LinkedList<Node> fathers=new LinkedList<>();
    public Node(int x,int y,LinkedList<Character>keys){
        this.x=x;
        this.y=y;
        this.keys = new LinkedList<>(keys);

    }
    public Node(){}
    public boolean hasKey(char door){
        for(int i=0;i<keys.size();i++){
            char c=keys.get(i);
            if((c-32)==door){
                return true;
            }
        }
        return false;
    }
    public boolean equals(Node n){
        if(x==n.x&&y==n.y){
            if(keys.size()==n.keys.size()){
                for(int i=0;i<keys.size();i++){
                    if(keys.get(i)!=n.keys.get((i))){
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
