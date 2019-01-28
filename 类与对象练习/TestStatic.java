// class Test{
//     public int i;
//     public char a;
//     public static int x = 5;

//     public Test(int i,char a){
//     this.i = i;
//     this.a = a;
//     }
// } 

// public class TestStatic{
//     public static void main(String[] args){
//         Test tset1 = new Test(3,'m');
//         Test test2 = new Test(2,'b');
//         System.out.println(test1.i+","+test1.a+","+test1.x);
//         System.out.println(test2.i+","+test2.a+","+test2.x);
//     }
// }
class Test1{
    public int i;
    public char a;
    public static int b = 8;
    public Test1(int i,char a){
        this.i = i;
        this.a = a;
    }
}
public class TestStatic{
    public static void main(String[] args){
        Test1 test1 = new Test1(1,'a');
        Test1 test2 = new Test1(2,'b');
        System.out.println(test1.i+","+test1.a+","+test1.b);
        System.out.println(test2.i+","+test2.a+","+test2.b);
    }
}
