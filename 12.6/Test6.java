public class Test6 {
    public static void main(String[] args) {
    System.out.println(add(new int[]{1}));
    System.out.println(add(new int[]{1,2,3}));
    System.out.println(add(new int[]{1,2,3,4,5,6,7,8}));
    }
    public static int add(int[] data) {
    int result = 0 ;
    for (int i = 0; i < data.length; i++) {
    result += data[i] ;
    }
    return result ;
    }
    }
    