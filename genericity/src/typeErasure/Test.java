/*
JVM擦除结果
 */
package typeErasure;

import java.lang.reflect.Field;

class MyClass<T,E extends Number>{
    public T t;
    public E e;
}

public class Test {
    public static void main(String[] args) {
        MyClass<String,Integer> myClass = new MyClass<>();
        //取得运行时MyClass的属性
        Field[] fields = myClass.getClass().getFields();
        for (Field field:fields
             ) {
            System.out.println(field.getType());
        }
    }
}
