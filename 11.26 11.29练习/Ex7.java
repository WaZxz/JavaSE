public class Ex7
{
    public static void main(String[] args)
    {
        myPrint(1);
        myPrint(2);
        myPrint(3);
        myPrint(4);
    }
    public static void myPrint(int x)
    {
        if (x==2)
        {
            return;
        }
        else
        {
            System.out.println(x);
        }
    }
}