public class Array2
{
    public static void main(String[] args)
    {
        int[] x= null;
        x =new int[3];
        System.out.println(x.length);
        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        for(int i= 0;i<x.length ; i++)
        {
            System.out.println(x[i]);
        }
        
    }
}