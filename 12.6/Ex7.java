class Person{
//     private String name;
//     private int age;
//     public void setName(String name){
//         this.name = name;
//     }
//     public void setAge(int age){
//         this.age = age;
//     }
//     public String getName(){
//         return this.name;
//    }
//    public int getAge(){
//        return this.age;
//    }
    public Person(){
        System.out.println("1.Person类的构造方法");
    }
}
class Student extends Person{
    // private String school;
    // public String getSchool(){
    //     return this.school;
    // }
    // public void setSchool(String school){
    //     this.school = school;

    // }
    public Student(){
        System.out.println("2.Student类的构造方法");
    }
}

public class Ex7{
    public static void main(String[] args){
        // Student stu = new Student();
        // stu.setName("张三");
        // stu.setAge(18);
        // System.out.println(stu.getName());
        // System.out.println(stu.getAge());
        new Student();
    }
}

