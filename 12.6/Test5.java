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
    public static Person getInstance() { //取得A类对象
    class Student extends Person{ //定义抽象类的子类 （内部类）
    public void getPersonInfo(){
    System.out.println("I am a student");
    }
    }
    return new Student();
    }
    }
    public class Test5{
    public static void main(String[] args) {
    Person per = Person.getInstance();
    per.getPersonInfo() ; //被子类所覆写的方法
    }
    }
    