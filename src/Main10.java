import java.math.BigInteger;
import java.util.*;

/**
 * Created by WZW on 2017/08/02.
 */
public class Main10 {
    public static void main(String args[]){
        Set<Integer> fib=new HashSet<>();
        int a=1,b=1;
        fib.add(a);
        fib.add(b);
        for(int i=0;i<20;i++){
            int temp=a+b;
            a=b;
            b=temp;
            if(temp>100){
                break;
            }
            fib.add(temp);
        }
         HashSet<Integer> fibs=new HashSet<>();
        fibs.add(1);
        a=1;b=1;
        int c=0;
        do {
            c = a + b;
            a = b;
            b = c;
            fibs.add(c);
        }while(c<100);

        System.out.println(fib);

        System.out.println(fibs);
        System.out.println(Math.round(11.5)+" "+Math.round(-11.5));
        BigInteger bi=new BigInteger("0Xf000000000000000") ;
        BigInteger bi2=new BigInteger("0x7FFFFFFFFFFFFFFF");
        System.out.println(bi2.divide(bi).doubleValue());

//        Scanner in=new Scanner(System.in);
//        String s=in.nextLine();
//        Set<Character> temp=new HashSet<>();
//        Set<String> res=new TreeSet<>();
//        for(int i=0;i<s.length();i++){
//            temp.add(s.charAt(i));
//            for(int j=0;j<s.length();j++){
//                temp.add(s.charAt(j));
//                if(fib.contains(temp.size())){
//                    res.add(s.substring(i,j+1));
//                }
//            }
//            temp.clear();
//        }
//        Iterator i=res.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
    }
}
