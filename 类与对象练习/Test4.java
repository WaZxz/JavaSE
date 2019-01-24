class one{
    public one(){//无参构造（1）
        System.out.println("Hello Constructor");
    }
    public one(String s){//方法重载，并接受一个字符串参数（2）
        this();//this调用本类方法（3.1）
        System.out.println(s);
    }
}
public class Test4{
    public static void main(String[] args) {
        new one("abc");//匿名对象
    }
}