///*
//接口之间是可以互相继承的
// */
//
//
//package test;
//interface A{
//    void playA();
//}
//
//interface B{
//    void playB();
//}
//
//interface C extends A,B{
//    void playC();
//}
//
//class CImpl implements C{
//    public void playA(){}
//    public void playB(){}
//    public void playC(){}
//}
//
//public class Test3 {
//    public static void main(String[] args) {
//        C c = new CImpl();
//        c.playA();
//        c.playB();
//        c.playC();
//    }
//}
