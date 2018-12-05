

public class ArrayDemo
{
    public static void main(String[] args)
    {
        int[][] data = new int[][]
        {
            {1,2,3},{4,5},{6,7,8,9}//非等列数组，3行4列
        };
        //输出的时候一定要使用双重循环
        for(int x = 0; x<data.length ; x++)
        { 
            for(int y = 0; y<data[x].length ; y++)
            {
                System.out.println("data["+x+"]["+y+"]="+data[x][y]+"、");
                System.out.println(data.length);//行数
                System.out.println(data[x].length);//列数
            }
        }
        System.out.println();
    }
}