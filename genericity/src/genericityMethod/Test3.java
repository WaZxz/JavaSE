/*
泛型方法可以独立于一个类存在
 */

package genericityMethod;

class MyClass3{
    public <T> T fun(T t){
        return t;
    }
}
public class Test3 {
    public static void main(String[] args) {
        MyClass3 myclass3 = new MyClass3();
        System.out.println(myclass3.fun(123));
    }
}
