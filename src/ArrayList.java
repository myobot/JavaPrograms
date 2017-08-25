import org.junit.Test;

/**
 * Created by WZW on 2017/08/01.
 */
public class ArrayList
{
    static int a[] = new int[6];
    public static void main ( String arg[] ) {
        System.out.println ( a[0] );
    }
    @Test
     public void APP () {
        int a=10,b=4,c=5,d=9;
        System.out.println(++a*b+c*--d);
        Integer first = new Integer(3);
        Integer second = 3;
        int three = 3;
        System.out.println(first==second);
        System.out.println(first==three);
        System.out.println(Math.round(3.14));
        System.out.println(App());
    }

    public int App(){
        try{
            System.out.println("try");
            System.exit(1);
            return 2;
        }catch (Exception e){

        }finally {
            System.out.println("finally");
            return 1;
        }
    }

}