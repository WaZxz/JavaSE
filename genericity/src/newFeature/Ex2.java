package newFeature;
/*
静态导入
 */
//import newFeature.util.Message;
//
//
//public class newFeature.Ex2 {
//    public static void main(String[] args) {
//        Message.fun();
//        Message.test();
//    }
//}
import static newFeature.util.Message.*;//加上static 后面加上*
public class Ex2 {
    public static void main(String[] args) {
        fun();
        test();
        //效果使得这两个方法像是在本类中定义的一样
    }
}



