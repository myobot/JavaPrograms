/**
 * Created by WZW on 2017/08/07.
 */
class C {
    C() {
        System.out.print("C");
    }
}

class A {
    C c = new C();

    A() {
        this("A");
        System.out.print("A");
    }

    A(String s) {
        System.out.print(s);
    }
}

class Test3 extends A {
    Test3() {
        super("B");
        System.out.print("B");
    }

    public static void main(String[] args) {
        Integer i01=59;
        int i02=59;
        Integer i03=Integer.valueOf(59);
        Integer i04=new Integer(59);
        System.out.println(i01==i02);
        System.out.println(i01==i03);
        System.out.println(i03==i04);
        System.out.println(i02==i04);

        String classFile = "com.jd.". replaceAll(".", "/") + "MyClass.class";
        System.out.println(classFile);
    }
}
