import java.util.*;

public class Test2{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        double r = cin.nextDouble();
        cin.close();
        double s = Math.PI*r*r;
        System.out.print(String.format("%.7f",s));


    }
}