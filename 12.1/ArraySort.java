public class ArraySort{
    public static void main(String[] args) {
        int[] data = new int[]{5,2,1,65123,1,5456,1,4564665};
        char[] c = new char[]{'z','c','a','b','哈'};
        java.util.Arrays.sort(data);
        printArray(data);
        printArray(c);
    }
    //定义一个方法输出整形数组
    public static void printArray(int[] temp){
    for(int i : temp){
        System.out.print(i+"、");
    }
}
    //函数重载
    public static void printArray(char[] temp){
        for(char c : temp){
            System.out.print(c+"、");
        }
}
}