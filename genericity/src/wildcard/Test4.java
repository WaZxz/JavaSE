///*
//？ super 类
//设置下限
// */
//package wildcard;
//
//class MyClass<T>{
//    private T t;
//    public T getT(){
//        return t;
//    }
//
//    public void setT(T t) {
//        this.t = t;
//    }
//}
//
//public class Test4 {
//    public static void main(String[] args) {
//        MyClass<String> myClass = new MyClass<>();
//        myClass.setT("231121321321321322");
//        fun(myClass);
//
//    }
//
//    //此时fun可以接受Myclass子类是String的任意类型，可以接收String及其父类
//    //String是一个final class 没有子类，只有父类，父类为Object
//    public static void fun(MyClass<? super String> myClass){
//        myClass.setT("hello world");//相当于Object obj = new String("hello world")
//        System.out.println(myClass.getT());
//    }
//
//}
