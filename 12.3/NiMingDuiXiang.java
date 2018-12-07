class Person{
    private String name;
    private double salary;
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
    public double getSalary(){
        return salary;
    }
    public void fun(){
        System.out.println(name + "存款为" +  "￥" + salary);
    }
}
public class Ex2{
    public static void main(String[] args){  
       new Person("张三",200).fun();//匿名对象，在使用一次后变成垃圾空间
    }
}