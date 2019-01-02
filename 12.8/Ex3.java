class Person{
    int age;//age为包访问权限
}

public class Ex3{
    public static void main(String[] args){
        Person per = new Person();
        per.age = 10;
        System.out.println(per.age);
    }
}