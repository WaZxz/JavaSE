/*
为什么需要通配符
 */
package wildcard;

class MyClass<T>{
    private T t;
    public T getT(){
        return t;
    }
}

public class Test1 {
    public static void main(String[] args) {
        MyClass<String> myClass = new MyClass<>();
        fun(myClass);
    }
    // fun只能接受String类型的myClass
    public static void fun(MyClass<String> myClass){//传入myClass参数
        System.out.println(myClass.getT());
    }
//    public static void fun(MyClass<Integer> myClass){
//        System.out.println(MyClass.getT());
//    }
}
