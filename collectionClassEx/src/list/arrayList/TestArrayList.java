/*
 *ArrayList是List接口的实现类
 */
package list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {

        //面向接口编程
        //1. 无参构造：初始化容量是多少呢
        //2. 有参数 int 初始化容量由用户自定义
        //3. 有参数 Collection
        List<Integer> list = new ArrayList<>();
        //向集合中添加数据
        list.add(2);
        list.add(3);
        list.add(5);
        ///向集合中添加一组数据，index：插入位置，element：插入数据
        list.add(1,4);
        List<Integer> list1 = new ArrayList<>();
        list1.add(6);
        list1.add(7);
        list.addAll(list1);
        //list.toString（，相隔 []结尾开始）
        System.out.println(list);
        //取得集合长度
        System.out.println(list.size());
        //将集合变为对象数组返回(toArray返回一个数组，数组一打印变成数组对象的hash code)
        System.out.println(list.toArray());
        for (Integer e : list){
            System.out.println(e);
        }
        //移除元素
        list.remove(2);
        System.out.println(list);

        //测试可否写低于1的数（数组越界）
//        list.add(-1,99);
//        System.out.println(list);

    }
}
