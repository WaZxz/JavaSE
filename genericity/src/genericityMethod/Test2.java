/*
泛型方法始终以自己的参数类型为准，与泛型类中的参数类型无关
 */
package genericityMethod;

class Myclass2<T>{
    private T t;
    //泛型方法的T和类的T不是一个东西
    public <T> T fun(T t){
        return t;
    }
}
public class Test2 {
    public static void main(String[] args) {
        Myclass2<String> myclass2 = new Myclass2<>();
        System.out.println(myclass2.fun(123));
    }
}
