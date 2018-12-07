class Person
{
    public String name;
    public int age;
    public void fun()
    {
        System.out.println(name + "在" + age + "岁哈哈哈");
    }
    public void work()
    {
        if(this.age < 22)
        {
            System.out.println("还在上学");
        }
        else
        {
            System.out.println(this.name+"在工作");
        }
     
    }
}
public class Ex1
{
    public static void main(String[] args)
    {
        //根据Person类产生一个Person对象
        //理解：
        //per在栈上，一个对象引用，也就是栈上的值就是后面这个堆内存地址
        //int[] data = new int[5];//后面是一个长度为的数据块，前面的data指向这个数据块
        Person per = new Person();
        per.name = "张三";
        per.age = 20;
        Person per1 = per;//引用传递
        per1.name = "李四";
        per = new Person();
        per1 = per;
        per.fun();
        per.work();
    }
}

