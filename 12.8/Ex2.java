class Person{
    public void print(){
        System.out.println("1.Person类的print方法");
    }
}

class Student extends Person{
    public void print(){
        System.out.println("2.Student类中的print方法");
    }
}

public class Ex2{
    public static void main(String[] args){
        Student stu = new Student();
        stu.print();

    }
}