///*
//在类中方法访问类中属性，一定要加this关键字
// */
//
//class Person{
//    private String name;
//    private int age;
//    public Person(String name,int age){
//        this.name = name ;
//        this.age = age ;
//    }
//    public String getPersonInfo(){
//        return "姓名：" + name + ",年龄："+age;
//    }
//}
//public class Ex3{
//    public static void main(String[] args) {
//        Person per = new Person("张三",20);
//        System.out.println(per.getPersonInfo());
//    }
//}