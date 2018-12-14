class Outer{
    private String msg = "Hello World" ;
    public String getMsg(){ //通过此方法才能取得msg属性
    return this.msg ;
    }
    public void fun(){ //3.现在由out对象调用了fun()方法
    Inner in = new Inner(this); //4.this表示当前对象
    in.print(); //7.调用方法
    }
    }
    class Inner{
    private Outer out;
    public Inner(Outer out){ //5.Inner.out = mian.out
    this.out = out ; //6.引用传递
    }
    public void print(){ //8.执行此方法
    System.out.println(out.getMsg());
    }
    }
    public class Test1{
    public static void main(String[] args) {
    Outer out = new Outer(); //1. 实例化Outter类对象
    out.fun(); //2.调用Outter类方法
    }
    }
    