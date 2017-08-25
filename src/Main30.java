/**
 * Created by WZW on 2017/08/09.
 * 给定一个 n 行 m 列的地牢，
 * 其中 '.' 表示可以通行的位置，
 * 'X' 表示不可通行的障碍，
 * 牛牛从 (x0 , y0 ) 位置出发，
 * 遍历这个地牢，和一般的游戏所不同的是，他
 * 每一步只能按照一些指定的步长遍历地牢，
 * 要求每一步都不可以超过地牢的边界，
 * 也不能到达障碍上。地牢的出口可能在任意某个可以通行的位置上。
 * 牛牛想知道最坏情况下，他需要多少步才可以离开这个地牢。
 */
import java.util.*;
class Point1{
    public int x;
    public int y;
    public int mx;
    public int my;
    public int step[][];
    public Point1(int x,int y,int mx,int my,int step[][]){
        this.x=x;
        this.y=y;
        this.mx=mx;
        this.my=my;
        this.step=step;
    }
    public boolean isOk(){
        return x>=0&&y>=0&&x<mx&&y<my;
    }
    public Point1 go(int i){
        return new Point1(this.x+step[i][0],this.y+step[i][1],this.mx,this.my,this.step);
    }
}
public class Main30{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int mx=in.nextInt();
        int my=in.nextInt();
        char[][] c=new char[mx][my];
        int [][] tar=new int[mx][my];
        for(int i=0;i<mx;i++){
            String str=in.next();
            c[i]=str.toCharArray();
        }
        int startx=in.nextInt();
        int starty=in.nextInt();
        int numofstep=in.nextInt();
        int step[][]=new int[numofstep][2];
        for(int i=0;i<numofstep;i++){
            step[i][0]=in.nextInt();
            step[i][1]=in.nextInt();
        }
        Point1 start=new Point1(startx,starty,mx,my,step);
        Queue<Point1> queue=new LinkedList<Point1>();
        queue.add(start);
        while(!queue.isEmpty()){
            Point1 p=queue.remove();
            for(int i=0;i<numofstep;i++){
                Point1 newp=p.go(i);
                if(newp.isOk()){
                    if(tar[newp.x][newp.y]==0) {
                        if (c[newp.x][newp.y] == '.') {
                            tar[newp.x][newp.y] = tar[p.x][p.y] + 1;
                            queue.add(newp);
                        } else {
                            tar[newp.x][newp.y] = -1;
                        }
                    }
                }
            }
        }
        boolean flag=true;
        int ans=0;
        for(int i=0;i<mx;i++){
            for(int j=0;j<my;j++){
                if(c[i][j]=='.'&&tar[i][j]==0){
                    flag=false;
                }
                ans=Math.max(ans,tar[i][j]);
            }
        }
        if(flag){
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }
    }
}
