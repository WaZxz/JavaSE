/*
为什么需要泛型类
 */
package genericityClass;

class Point{
    private Object x;
    private Object y;

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }
}
public class Test1 {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.setX(10);
        point1.setY(20.1);//如果类型不小心写错，编译不会报错，所以就产生了安全遗患（存在于强转）
        //所以此时需要泛型类的加入！
        int x = (int) point1.getX();//返回值为Object需要强转成int(向下转型 )
        int y = (int) point1.getY();
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
