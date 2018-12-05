public class Jiecheng
{
    public static void main(String[] args)
    {   
        int x = 20;
        System.out.println(jiSuan(x));
    }
    public static long jiSuan(int x)
    {
        if(x == 0)
        {
            return 1L;
        }
        else
        {
            return x * jiSuan(x-1);
        }
    }
}