/**
 * Created by WZW on 2017/08/10.
 */
import java.util.*;
public class  Main50{
    static boolean flag=false;
    static int move[][]={{0,1},{0,-1},{-1,0},{1,0}};
    static int cost[]={-1,-1,-3,0};
    static int bestcost=-1;
    static LinkedList<Point> bestPath=new LinkedList<Point>();
    static LinkedList<Point> path=new LinkedList<Point>();
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int p=in.nextInt();
        int map[][]=new int[n][m];
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                map[i][j]=in.nextInt();
            }
        }
        Point start=new Point(0,0,map,n,m);

        dfs(map,start,n,m,p,visited);
        if(flag==true){
            for(int i=bestPath.size()-1;i>=0;i--){
                if(i==0){
                    System.out.print(bestPath.get(i));
                }else {
                    System.out.print(bestPath.get(i) + ",");
                }
            }
        }
    }
    public static void dfs(int [][]map,Point p,int n,int m,int costp,boolean visited[][]){
        path.addFirst(p);
        if(p.x==0&&p.y==m-1&&costp>0){
            if(bestcost<costp){
                flag=true;
                bestPath.clear();
                bestPath.addAll(path);
            }
        }
        for(int i=0;i<move.length;i++){
            Point newp=new Point(p.x+move[i][0],p.y+move[i][1],map,n,m);
            if(newp.isOk()&&!visited[newp.x][newp.y]){
                visited[newp.x][newp.y]=true;
                dfs(map,newp,n,m,costp+cost[i],visited);
            }
        }
        path.removeFirst();
    }
}
class Point{
    public int x;
    public int y;
    public int n;
    public int m;
    public int map[][];
    public Point(int x,int y,int[][] map,int n,int m){
        this.x=x;
        this.y=y;
        this.map=map;
        this.n=n;
        this.m=m;
    }
    public boolean isOk(){
        return (x>=0)&&(y>=0)&&(x<n)&&(y<m)&&(map[x][y]!=0);
    }
    public String toString(){
        return "["+x+","+y+"]";
    }
}