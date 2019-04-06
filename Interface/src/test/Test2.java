//package test;
///*
//介绍子类既实现接口，又继承抽象类
// */
//
//interface IMessage {
//   String MSG = "hello";// static final 这些修饰符之所以可以不写，是因为在interface中
//    void play();
//}
//
//abstract class News{
//    public abstract void getMsg();
//}
//ents IMessage{
////    public void play(){
////
//class MessageImpl extends News implem     System.out.println(MSG);
//    }
//
//    @Override
//    public void getMsg() {
//        System.out.println(MSG);
//    }
//}
//
//public class Test2 {
//    public static void main(String[] args) {
//        IMessage msg = new MessageImpl();
//        msg.play();
//        News news = (News)msg; //com.News news = new com.MessageImpl();
//        //可以理解为News news = new com.MessageImpl();
//        news.getMsg();
//    }
//}
