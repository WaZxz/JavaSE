class Person{
    // private int test = 10;
    // public  static void fun(){
    // System.out.println(test);//静态方法中无法调用普通属性
    private static int test = 10;
    public void fun(){
        System.out.println(test);
    }
}
public class Ex5{
    public static void main(String[] args){
         new Person().fun();
    }
}