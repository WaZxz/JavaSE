package typeErasure;


public class Test1 {
    public static void main(String[] args) {
        Integer i = 10;
        String str = "hello";
        System.out.println(i.getClass());//取得个对象的类的信息
        System.out.println(str.getClass());//取得个对象的类的信息
    }
}
