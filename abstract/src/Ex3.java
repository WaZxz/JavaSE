/*
实例化子类时，先调用父类构造方法，在调用子类构造方法
 */
abstract class Person3{
    public abstract void print3();//抽象方法
    public Person3(){
        this.print3();
    }
}

class Student3 extends Person3{
    private int num = 100;
    public Student3(int num){
        this.num = num;
    }
    public void print3(){
        System.out.println(this.num);
    }
}

public class Ex3 {
    public static void main(String[] args) {
        new Student3(30);
    }]
}
