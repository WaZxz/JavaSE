package newFeature;/*
   方法的可变参数
 */


//设计一个方法，方法可以接受任意长度的整形，并依次叠加返回叠加后的结果

// 这样虽然也可以实现但是还是有些不同，要求是传入整形，这个传入的是数组
//public class newFeature.Ex1 {
//    public static void main(String[] args) {
//        System.out.println(sum(new int[]{1,3,5,}));
//        System.out.println(sum(new int[]{1,3,5,7}));
//        System.out.println(sum(new int[]{1,3,5,7,9}));
//    }
//
//    public static int sum(int[] data){
//        int sum = 0;
//        for(int i = 0;i < data.length;i++){
//            sum += data[i];
//        }
//        return sum;
//    }
//}


public class Ex1 {
    public static void main(String[] args) {
//        System.out.println(sum(new int[]{1,3,5,}));
//        System.out.println(sum(new int[]{1,3,5,7}));
//        System.out.println(sum(new int[]{1,3,5,7,9}));
        //可以不用传数组，直接传整形
        System.out.println(sum("1",1,3,5));
        System.out.println(sum("2",1,3,5,7));
        System.out.println(sum("3",1,3,5,7,9));
    }
    //可以传入多个参数，但是可变参数必须放到后面
    public static int sum(String str,int ... data){
        System.out.println(str);
        int sum = 0;
        for(int i = 0;i < data.length;i++){
            sum += data[i];
        }
        return sum;
    }
}

