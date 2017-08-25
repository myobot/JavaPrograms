/**
 * Created by WZW on 2017/08/12.
 */
import java.util.Scanner;
public class Main90 {
    static long min=Long.MAX_VALUE;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n=in.nextInt();
            long x[]=new long[n];
            long y[]=new long[n];
            for(int i=0;i<n;i++){
                x[i]=in.nextLong();
            }
            for(int i=0;i<n;i++){
                y[i]=in.nextLong();
            }
            long d[]=new long[51];
            for(int i=1;i<d.length;i++){

            }
        }
    }
    //This is a block of of text,serveral words here are are repeated, and and the should not be.
    //
    /*//	<head>
				<title>Ben is a boy</title>
			</head>
    		<body>
				<h1>WELCOME TO MY HOMEPAGE</h1>
				content id divided into two sections:<br>
				 <a href="mailto:18233225109@163.com">18233225109@163.com</a>
				<h2>coldfusion</h2>
				information about macrmedia coldfusion.
				<h2>wireless</h2>
				information about bluetooth,802.11,and more.
				<h2>this is not valid HTML</h3>
			</body>
			<td>
				<a href="/home"><img src="/images/home.gif"></a>
				<img src="/images/spacer.gif"/>
			</td>

			(313) 555-1234
			(248) 555-9999
			(810) 555-9000

			ABC01: $123.3
			HGG42: $4.12
			HAJH2: $34.1
			I paid $30 for 100 apples, 50 oranges,and 60 pears.I saved $5 on this order.
	*/
    //this is a test ip[123.201.13.200]
    public static int dfs(long x[],long y[],int n,int now,int t){
        if(now==n){
            long smidx=0;
            long smidy=0;
            for(int i=0;i<n;i++){
                smidx+=x[i];
                smidy+=y[i];
            }
            long midx=smidx/n;
            long midy=smidy/n;
            long sum=0;
            for(int i=0;i<n;i++){
                sum+=abs(x[i]-midx);
                sum+=abs(y[i]-midy);
            }
            if(sum<min){
                min=sum;
            }
        }else{
            for(int i=0;i<t;i++){

            }
        }
        return 1;
    }
    //tests
    /**
     * [abs description]
     * @param  a [description]
     * @return   [description]
     */
    public static long abs(long a){
        if(a<0){
            return -a;
        }else{
            return a;
        }
    }
}