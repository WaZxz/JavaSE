///*
//？ extends 类
//设置泛型上限
//依然无法设置值，只能取得值
// */
//package wildcard;
//
//class MyClass<T extends Number>{
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
//public class Test3 {
//    public static void main(String[] args) {
//        MyClass<Integer> myClass = new MyClass<>();
//        myClass.setT(123);
//        fun(myClass);
////        MyClass<String> myClass1 = new MyClass<>();
////        myClass1.setT("hello");
////        fun(myClass1);
//        //不能接收非Number子类的值
//    }
//
//    public static void fun(MyClass<? extends Number> myClass){
//        System.out.println(myClass.getT());
//    }
//
//}
