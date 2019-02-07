import java.util.*;

public class Test4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        scanner.close();
        long sum = (a + b) * (b - a + 1) / 2;
        System.out.print(sum);
    }
}