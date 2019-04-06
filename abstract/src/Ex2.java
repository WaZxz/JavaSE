
abstract class Person2{
    public abstract void print();//抽象方法
    //抽象类的静态普通方法
    public static Person2 getInstance(){
        //局部内部类，继承了外部类将他的抽象方法覆写
        //封装具体实现子类
        //在抽象类的内部提供一个已经实例化好的子类，可以选择用或者自己继承
        class Student2 extends Person2{
            public void print(){
                System.out.println("Hello");
            }
        }
        return new Student2();
    }
}

//class Student2 extends Person2{
//    public void print(){
//        System.out.println("Hello");
//    }
//}

public class Ex2 {
    public static void main(String[] args) {
        Person2 per = Person2.getInstance();
        per.print();
    }
}
