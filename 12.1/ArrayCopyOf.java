public class ArrayCopyOf
{
    public static void main(String[] args)
     {
        int[] data = new int[]{1,2,3,4,5};
        int[] newArray = java.util.Arrays.copyOf(data,10);
        printArray(newArray);
    }
    //定义一个方法输出整形数组
    public static void printArray(int[] temp)
    {
        for(int i : temp)
        {
            System.out.print(i+"、");
        }
    }
}
