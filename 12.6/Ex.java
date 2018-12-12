class Person{
    { //定义在类中，不加任何修饰符，构造块
    System.out.println("1.Person类的构造块");
    }
    public Person(){
    System.out.println("2.Person类的构造方法");
    }
    static { //定义在非主类中的静态块
    System.out.println("3.Person类的静态块");
    }
    }
    public class Ex{
    public static void main(String[] args) {
    System.out.println("--start--");
    new Person();
    new Person();
    System.out.println("--end--");
    }
    }
    