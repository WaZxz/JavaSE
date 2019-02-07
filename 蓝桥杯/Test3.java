import java.util.Scanner;
 
public class Test3 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		cin.close();
		int a = 1, b = 1, ans = 1,c=cin.nextInt();
		for (int i = 1; i <=  c- 2; i++) {
			ans = (a + b) % 10007;
			a = b;
			b = ans;
		}
		System.out.println(ans);
	}
}
