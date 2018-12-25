
class MyThread implements Runnable {
private int ticket = 10 ; // 一共10张票
@Override
public void run() {
while(this.ticket>0){
System.out.println("剩余票数："+this.ticket -- );
}
}
}
public class Test9 {
public static void main(String[] args) {
MyThread mt = new MyThread() ;
new Thread(mt).start();
new Thread(mt).start();
}
}