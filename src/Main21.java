/**
 * Created by WZW on 2017/08/08.
 */
class Base {
    Base() {
        System.out.print("Base");
    }
}
public class Main21 extends Base {
    public Main21(){
        super();

    }
    public Main21(int a){

    }
    public static void main( String[] args ) {
        new Main21();
        //调用父类无参的构造方法
        new Base();
    }
}
