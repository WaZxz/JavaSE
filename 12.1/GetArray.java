public class GetArray
{
    public static void main(String[] args)
    {
        int[] data = new int[]{1,2,3,4,5};
        int[] data1 = new int[]{2,4,6,8,10};
        printArray(data);
        printArray(data1);
        //引用传递，效果等同于int[] temp = data;
    }
    //定义一个方法输出整形数组
    public static void printArray(int[] temp){
        for(int i : data ){
            System.out.print(i+"、");
        }
    }
}