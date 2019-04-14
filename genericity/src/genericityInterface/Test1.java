/*
泛型接口
 */
package genericityInterface;

interface ISubject<T>{
    void fun(T t);
}


//1.在实现接口时就确定好接口的类型，这样子类就是一个普通类不是一个泛型类，因为他已经确定好他穿的是一个String类
class SubjectImpl1 implements ISubject<String>{
    @Override
    public void fun(String s) {

    }
}

//2.子类实现接口时仍然保留泛型，此时子类也是泛型类
class SubjectImpl<T> implements ISubject<T>{
    @Override
    public void fun(T t) {

    }
}

public class Test1 {
}
