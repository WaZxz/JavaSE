/*
泛型类简介
 */
package genericityClass;

class Myclass3<T,E>{
    private T t;
    private E e;

}
public class Test2 {
    public static void main(String[] args) {
        //只有在具体使用时才知道是什么类
        Myclass3<String,Integer> class1 = new Myclass3<String,Integer>();
        Myclass3<Integer,String> class2 = new Myclass3<Integer,String>();
    }
}
