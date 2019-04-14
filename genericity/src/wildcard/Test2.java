///*
//？  通配符
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
//public class Test2 {
//    public static void main(String[] args) {
//        MyClass<Integer> myClass = new MyClass<>();
//        myClass.setT(123);
//        fun(myClass);
//        MyClass<String> myClass1 = new MyClass<>();
//        myClass1.setT("hello");
//        fun(myClass1);
//    }
//    // fun可以接收Myclass的所有类型
//    public static void fun(MyClass<?> myClass){//这个方法可以接收任意类型的MyClass
//        //类型不定，所以只能取得,无法设置。
//        System.out.println(myClass.getT());
//    }
//
//}
