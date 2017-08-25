/**
 * Created by WZW on 2017/08/01.
 */
class Person{
    Person(){
        System.out.println("create person");
    }
    public static String getName(){
        return"Person";
    }
}
class Teacher extends Person{
    Teacher(){
        System.out.println("create teacher");

    }
    public static String getName(){
        return"Teacher";
    }
}
public class Test{
    public static void main(String[] args){
        Person person = new Person();
        Person teacher = new Teacher();
        System.out.println(person.getName());
        System.out.println(teacher.getName());
    }
    @org.junit.Test
    public void stacktest(){
        Stack stack=new Stack();
        for(int i=0;i<32;i++){
            stack.push(i);
        }
        for(int i=0;i<32;i++){
            System.out.println(stack.pop());
        }
    }
}
