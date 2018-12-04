public class Array1
{
    public static void main(String[] args)
    {
        int[] x = new int[3];
        System.out.println(x.length);
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        for(int i = 0; i<x.length ; i++)
        {
            System.out.println(x[i]);
        }
    }
}