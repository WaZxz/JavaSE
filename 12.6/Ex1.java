class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        // name = name;//name和age有就近取用原则，无法赋值给类中属性，
        // age = age;
        this.name = name;//this.name明确表示调用类中的name属性，不再使用就近原则
        this.age = age;
    }
    // public void setName(String name){
    //     this.name = name;
    // }
    // public void setAge(int age){
    //     this.age = age;
    // }//this.name明确表示调用类中的name属性，不再使用就近原则
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    //setter先不用写，setter通过person构造方法设置值，并且通过构造方法设置避免了多次的setter调用
}

public class Ex1{
    public static void main(String[] args) {
        Person per = new Person("张三",20);
        System.out.println(per.getName());
        System.out.println(per.getAge());
    }
}