class Person{
    private String name;
    private int age;
    public Person(String name ,int age){
        this.name = name;
        this.age = age;
    }   
}
public String toString(){
    return "姓名为"+ this.name+",年龄为："+this.name;
}
public boolean equals(Object obj){
    //判断地址是否相等
    if(this == obj){
        return true;
    }
    //判断传入对象是否是Person对象
    if(!(obj instanceof Person)){
        return false;
    }
    //传入的一定是Person对象并且地址不相等
    //向下专型脱掉小马甲，要比较Person的属性是否相等
    Person per = (Person) obj;
    return per.name.equals(this.name)&&per.age ==this.age;

}

public class Ex{
    public static void main(String[] args){
        fun(new Person("张三",20));
        fun("hello");
    }
    public static void fun(Object obj){
        System.out.println(obj);
    }
}