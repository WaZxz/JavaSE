class Outer{
    private String msg = "Hello World" ;
    // ********************************
    class Inner{ //定义一个内部类
    public void print(){ //定义一个普通方法
    System.out.println(msg); //调用msg属性
    }
    }
    // ********************************
    //在外部类中定义一个方法，该方法负责产生内部类对象并且调用print()方法
    public void fun(){
    Inner in = new Inner(); //内部类对象
    in.print(); // 内部类提供的print()方法
    }
    }
    public class Test{
    public static void main(String[] args) {
    Outer out = new Outer(); //外部类对象
    out.fun(); //外部类方法
    }
    }