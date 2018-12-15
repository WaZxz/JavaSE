abstract class Person{
    private String name ; // 属性
    public String getName(){ // 普通方法
    return this.name;
    }
    public void setName(String name){
    this.name = name ;
    }
    // {}为方法体，所有抽象方法上不包含方法体
    public abstract void getPersonInfo() ; //抽象方法
    }
    class Student extends Person{
    public void getPersonInfo(){
    System.out.println("I am a student");
    }
    }
    public class Test2{
    public static void main(String[] args) {
    Person per = new Student() ; //实例化子类，向上转型
    per.getPersonInfo() ; //被子类所覆写的方法
    }
    }