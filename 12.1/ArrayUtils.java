
//Java数组章节练习题
public class ArrayUtils{
    //1.计算数组中最大值
    public static int arrayMaxElement(int[] data)
    {
        int temp = data[0];
        for(int i = 1 ; i<=data.length ; i++)
        {
            if(temp<data[data.length - i])
             {
                 temp = data[data.length - i];
             }
        }
        return temp;
    }
    
    //2.计算数组中最小值
    public static int arrayMinElement(int[] data)
    {
        int temp = data[0];
        for(int i = 1 ; i<=data.length ; i++)
        {
            if(temp>data[data.length - i])
            {
                temp = data[data.length - i];
            }
        }
        return temp;
    }
    
    
    //3.计算数组值之和
    public static int arrayElementSum(int[] data)
    {
        int temp = 0;
        for(int i = 0;i<data.length;i++)
        {
            temp = temp+data[i];//temp += data[i]
        }
        return temp;
    }
    
    //4.数组拼接
    // A {1,3,5,7,9} B {2,4,6,8,10} -> {1,3,5,7,9,2,4,6,8,10}
    public static void arrayJoin(int[] a, int[] b)
    {
        int sum1 = a.length+b.length;
        int[] c = new int[sum1];
        for(int i = 0 ; i<a.length ; i++)
        {
            c[i] = a[i];
        }
        for(int j = 0 ; j<b.length ; j++)
        {   
            c[j+3] = b[j];
        }
        System.out.println("数组拼接结果：" );
        for(int k = 0 ; k<sum1 ; k++)
        {
            System.out.println(c[k]);
        }
    }

    //5.数组截取
    //[start, end)
    // A {1,3,5,7,9} ->(A,1,3) > {3,5}
    public static int[] arraySub(int[] data, int start , int end)
    {
        int mid = end - start;
        int x[] = new int[mid];
        for(int i = 0; i<mid ; i++)
        {
            x[i] = data[start + i + 1];  
        }
        System.out.println("数组截取结果：" );
        for(int k = 0 ; k<mid ; k++)
        {
            System.out.println(x[k]);
        }
        return null;
    }
    
    //6.数组打印
    public static void printArray(int[] data)
    {
        for(int j : data)
        {
            System.out.print(j+"、");
        }
    }
    /** {   
        System.out.println("打印数组：");
        for(int k = 0 ; k<data.length ; k++)
        {
            System.out.println(data[k]);
        }
    }
    */
    
    
    //7.数组反转
    // 比如：[1,2,3,4] => [4,3,2,1]
    //从后往前输出即可
    //不用新数组
    public static void printReversal(int[] data)
    {
        int x[] = new int[data.length];
        for(int i = 0;i < data.length ;i++)
        {
            x[i] = data[i];
        }    
        for(int j = 0;j < data.length ;j++)
        {
            data[j] = x[data.length - j];
        }
        System.out.println("翻转数组：" );
        for(int k = 0;k < data.length ;k++)
        {
            System.out.println(data[k]);
        }
        
    }
    
    public static void main(String[] args){
        int[] data = {1,3,5,7,9};
        int[] a = {1,3,5};
        int[] b = {2,4,6};
        int start = 1;
        int end = 3;
        int max = arrayMaxElement(data);
        int min = arrayMinElement(data);
        int sum = arrayElementSum(data);
        System.out.println("数组的最大值：" + max);
        System.out.println("数组的最小值：" + min);
        System.out.println("数组的和：" + sum);
        arrayJoin(a,b);
        arraySub(data , start , end);
        printArray(data);
        printReversal(data);
  }
}