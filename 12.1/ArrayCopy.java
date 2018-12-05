public class ArrayCopy
{
    public static void main(String[] args)
     {
        int[] A = new int[]{1,2,3,4,5,6,7,8,9};
        int[] B = new int[]{11,22,33,44,55,66,77,88,99};
        //1/2/55/66/77/6/7/8/9
        System.arraycopy(B, 4, A, 2 , 3);
        printArray(A);
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
