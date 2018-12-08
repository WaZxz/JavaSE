class Person{
    private String name;
    private int age;
    public Person(){
        System.out.println("************************");
    }
    public Person(String name){
        //System.out.println("************************");java中不能有一行相同代码
        this();//表示调用类中的无参构造
        this.name = name ;
    }
    public Person(String name,int age){
        // System.out.println("************************");java中不能有一行相同代码
        // this.name = name ;//表示调用类中的有一个参数的构造
        this(name);
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}

public class Ex2{
    public static void main(String[] args) {
        Person per = new Person("张三",20);
        System.out.println(per.getName());
        System.out.println(per.getAge());
    }
}