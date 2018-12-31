class Person{
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

class Student extends Person{

}


public class Ex1{
    public static void main(String[] args){
        Student stu = new Student();
        // stu.name = "张三";//无法直接调用
        stu.setName("张三");//通过显式继承其他方式，来调用继承下来的私用属性
        System.out.println(stu.getName());
    }
}