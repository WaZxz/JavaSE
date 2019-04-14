/*
泛型类引入多个参数并使用
 */
package genericityClass;

class Myclass<T>{
    private T t;
    //private T t1;
    // 此时t和e是同一个类型，比如说在主方法中定义一个String类型的数，则t和e都是String类型的数
}
public class Test3 {
    public static void main(String[] args) {
        //只有在具体使用时才知道是什么类
        Myclass<String> class1 = new Myclass<String>();
        Myclass<Integer> class2 = new Myclass<Integer>();
    }
}
