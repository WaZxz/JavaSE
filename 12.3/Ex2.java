class Person{
    private String name;
    private double salary;
    // public Person(){
    //     System.out.println("**********************************");//无参构造
    // }
    // public Person(String n,double s){
    //     name = n;
    //     salary = s;
    // }//2个参数
    // public Person(String n){
    //    name = n;
    // }//1个参数
    public void setName(String n){
        name = n;
    }
    public void setSalary(double s){
        if(s < 0 || s > 10000 ){
            System.out.println("余额数量非法");
        }else{
            salary = s;//用形参比较
        }
    }
    public String getName(){
        return name;
    }
    // public double getSalary(){
    //     return salary;
    // }
    public void fun(){
        System.out.println(name + "存款为" +  "￥" + salary);
    }
}
public class Ex2{
    public static void main(String[] args){
        Person per = new Person();//调用无参构造
        // // Person per = new Person("张三");//调用一个参数
        // Person per = new Person("张三",200);//2个参数
        // // per.name = "张三";
        // // per.salary = 100;在类的外部无法直接调用
        // //所以需要用setter设置与修改
        // //getter取得属性值
        per.setName("张三");
        per.setSalary(-100);
        per.getName();
        per.fun();
    }
}