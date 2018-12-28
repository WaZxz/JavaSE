// class Person{
//     public static int i = 0;
//     public Person(){
//         System.out.println("1.Person类中的构造方法");
//     }
//     {
//         System.out.println("2.Person类中的构造块");
//     }
//     static {
//         System.out.println("3.Person类中的静态块");
//     }

// }
// public class Ex6{
//     public static void main(String[] args){       
//         // {   
//         //     //普通代码块
//         //     int x = 10;
//         //     System.out.println(x);
//         // }//作用域是6-10行，如果定义在int x = 20后面将会报错
//         // int x = 20;
//         System.out.println(Person.i);
//     }
// }
public class Ex6{
    public static void main(String[] args){
        System.out.println("1.main方法开始。。");
        new Ex6();
    }
    {
        System.out.println("3.主类中的构造块");
    }
    static{
        System.out.println("2.主类中的静态块。。");
    }
}